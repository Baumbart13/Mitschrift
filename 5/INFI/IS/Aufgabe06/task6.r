#install.packages("RMySQL")
require(RMySQL)
c <- dbConnect(MySQL(), user="root", password="Baumkind13", dbname="employees", host="localhost")
t <- dbListTables(c)
dbListFields(c, "employees")
#2.1.1
q <- dbSendQuery(c, "select count(*)cE, dept_no from dept_emp where year(to_date) = 9999 group by dept_no")
d <- fetch(q, -1)
barplot(d$cE~d$dept_no, col=rainbow(2))
dbClearResult(q)

#2.1.2
q <- dbSendQuery(c,"select (employees.gender)gnd, (salary) sal  from salaries inner join employees on salaries.emp_no = employees.emp_no")
d <- fetch(q, -1)
boxplot(d$sal~d$gnd, xlab= "gender", ylab = "Verdienst", col=rainbow(2))
dbClearResult(q)

#2.1.3
q <- dbSendQuery(c,"select (dept_emp.dept_no) dn, (salary) sal  from salaries inner join dept_emp on salaries.emp_no = dept_emp.emp_no group by dept_emp.dept_no")
d <- fetch(q, -1)
barplot(d$sal~d$dn, xlab= "Abteilungen", ylab = "Verdienst", col=rainbow(2))
dbClearResult(q)

#2.2
q <- dbSendQuery(c,"select (salaries.salary) sal, (salaries.from_date) date from employees inner join salaries on employees.emp_no = salaries.emp_no where employees.emp_no = 492917;")
d <- fetch(q,-1)
plot(d$sal,xlab = "1985-2002",type="l")
dbClearResult(q)

#2.3
#2.3.1
#2.3.2
gem <- function(year, sal)
{
  l <- lm(year ~ sal)
  plot(sal,year, xlab = "years" , ylab="salaries", xlim= c(1980,2030), ylim=c(50000,110000))
  abline(l, col="red")
}
q <- dbSendQuery(c,"select (avg(salaries.salary)) avgsal, (year(salaries.from_date)) ysal from employees inner join salaries on employees.emp_no = salaries.emp_no group by year (salaries.from_date) order by year(salaries.from_date);")
d <- fetch(q,-1)
lm_sal <- lm(avgsal ~ ysal, data = d)
sal_predict <- predict(lm_sal, data.frame(ysal=c(2020:2030)))
gem(d$avgsal,d$ysal)
points(c(2020:2030),sal_predict,col="blue")
dbClearResult(q)
#2.4
q <- dbSendQuery(c,"select (year(curdate()) - year(birth_date)) age , (salaries.salary) salar from employees inner join salaries on employees.emp_no = salaries.emp_no where year(salaries.to_date) = 9999;")
d <- fetch(q,-1)
cor.test(d$age,d$salar, method="kendall")


dbDisconnect(c)
