setwd("/home/baumbart13/Desktop/Mitschrift_Lokal/Schule/GITHUB-ONLINE/Mitschrift/5/INFI/IS/Aufgabe02/")
d <- read.csv("../datasets/bev_meld.csv", sep=";", encoding="UTF-8")
#1
bev_sum_bezirk <- aggregate(d[,4:30], by=list(d$Bez), FUN =sum)
bev_pro_jahr <- apply(bev_sum_bezirk[2:28],2, FUN =sum)
years <- 1992:2018
lm_tirol <- lm(bev_pro_jahr ~ years)
plot(years,bev_pro_jahr,xlim= c(2000, 2030), ylim=c(450000,1000000))
#2.1
abline(lm_tirol,col="red")
#2.2
tirol_pred <- predict(lm_tirol, data.frame(years=(2030)))
points(2030, tirol_pred, col="blue")
#3
gem <- function(year, value)
{
  l <- lm(value ~ year)
  plot(year,value,xlim=c(1990,2030),ylim = c(3000,4500))
  abline(l, col="red")
}
y <- 1992:2018
value <- as.numeric(d[d$Gemeinde == "Stans", 4:30])
lm_stans <- lm(value ~ y)
stans_pred <- predict(lm_stans, data.frame(y=(2030)))
gem(y,value)
points(2030,stans_pred,col="blue")
#4
bev_il <- apply(d[d$Bezirk=="IL",4:30],2, FUN =sum)
bev_re <- apply(d[d$Bezirk=="RE",4:30],2, FUN = sum)
lm_re <- lm(bev_re ~ years );
lm_il <- lm(bev_il~ years );
plot(years, bev_re, pch='*', type="b", col="blue", ylab = "Bevölkerung Re im Vergleich zu Bevölkerung IL",
     xlab = "Jahre 1990 - 2018",c(1992,2018), ylim=c(10000,200000));
points(years, bev_il, pch='+', type="b", col="purple")
abline(lm_re, col="red")
abline(lm_il, col="green")
#5
#in der PDF-Datei, einfach nur das Auswerten der Grafik
