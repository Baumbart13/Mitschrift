#1.1
d <- read.csv("../datasets/ESS8e02.1_F1.csv", sep=",", encoding ="UTF-8")

# setzen der Labels fuer die Werte
d$gndr <- factor(d$gndr, levels=c(1,2), labels = c("Male","Female"))
d$vote <- factor(d$vote, levels=c(1,2,3,7,8,9), labels = c("Yes","No", "Not eligible to vote", "Refusal", "Don't know", "No answer"))

d_gndr_2 <- d[as.numeric(d$gndr) <= 2,]
d_gndr_2$gndr <- droplevels(d_gndr_2$gndr)
# Grundsätzliches Kennenlernen des Datensatzes
table(d_gndr_2$gndr)
table(d$cntry)
table(d$vote)

# Auswaehlen von Laendern
d_at <- d[d$cntry == 'AT',]
d_at_it <- d[d$cntry %in% c('AT','IT'),]

d_at_it$cntry <- droplevels(d_at_it$cntry) #nicht mehr gebrauchte Beschriftungen werden verworfen
table(d_at_it$cntry, d_at_it$gndr)

#1.2
#Hypothese:
#a.) Männer haben mehr Glauben in die Polizei
table(d_gndr_2$gndr,d$trstplc)
d_gender_plc <- d[d$trstplc <= 10,]
table(d_gender_plc$gndr,d_gender_plc$trstplc)
boxplot(d_gender_plc$trstplc, col="red")
boxplot(d_gender_plc$trstplc~d_gender_plc$gndr,col="red")

wilcox.test(trstplc~gndr, data=d_gender_plc)
# b.)Es besteht ein negativer Zusammenhang bei "mehr Strom aus nuklearer
# Energie" und "mehr Strom aus Solarenergie"
d$elgsun <- factor (d$elgsun, levels=c(1,2,3,4,5))
d$elgnuc <- factor (d$elgnuc, levels = c(1,2,3,4,5))

d_sun <- d[as.numeric(d$elgsun) <= 5,]
d_nuc <- d[as.numeric(d$elgnuc) <= 5,]

d_sun$elgsun <- droplevels(d_sun$elgsun)
d_nuc$elgnuc <- droplevels(d_nuc$elgnuc)

table(d_sun$elgsun, d_nuc$elgnuc)
boxplot(d_sun$elgsun~d_nuc$elgnuc, col="green")
cor.test(as.numeric(d_sun$elgsun),as.numeric(d_nuc$elgnuc), method="kendall")
# c.)
d_at_hu <- d[d$cntry %in% c("AT","HU"),]
d_at_hu <- d_at_hu[as.numeric(d_at_hu$ccgdbd) <= 10,]
d_at_hu$cntry <- droplevels(d_at_hu$cntry)
table(d_at_hu$cntry, d_at_hu$ccgdbd)
wilcox.test(ccgdbd~cntry, data=d_at_hu)
# d.)
d_basicnc <- d[as.numeric(d$basinc) <=7,]
d_basicnc$basicnc <- droplevels(d_basicnc$basicnc)
table(d_basicnc$gndr,d_basicnc$basinc)
boxplot(d_basicnc$basinc~d_basicnc$gndr, col="blue")
cor.test(as.numeric(d_basicnc$basinc),as.numeric(d_basicnc$gndr),method="kendall")
# Eigene Hypothesen
# e.)
d$elgsun <- factor (d$elgsun, levels=c(1,2,3,4,5))
d$elgwind <- factor (d$elgwind, levels = c(1,2,3,4,5))
d_sun <- d[as.numeric(d$elgsun) <= 5,]
d_wind <- d[as.numeric(d$elgwind) <= 5,]
d_sun$elgsun <- droplevels(d_sun$elgsun)
d_wind$elgwind <- droplevels(d_wind$elgwind)
table(d_sun$elgsun,d_wind$elgwind)
boxplot(d_sun$elgsun~d_wind$elgwind, col="yellow")
cor.test(as.numeric(d_sun$elgsun),as.numeric(d_wind$elgwind), method="kendall")
# f.)
d_at_de <- d[d$cntry %in% c("AT","DE"),]
d_at_de <- d_at_de[as.numeric(d_at_de$trstprl)<=10,]
d_at_de$cntry <- droplevels(d_at_de$cntry)
table(d_at_de$cntry,d_at_de$trstprl)
wilcox.test(ccgdbd~cntry, data=d_at_de)