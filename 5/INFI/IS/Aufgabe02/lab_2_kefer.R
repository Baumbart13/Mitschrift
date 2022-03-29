#1.1
setwd("/home/baumbart13/Desktop/Mitschrift_Lokal/Schule/GITHUB-ONLINE/Mitschrift/5/INFI/IS/Aufgabe02/")
d <- read.csv("../datasets/Zeitreihe_Winter_2000_2019.csv", sep=";", encoding="UTF-8")


sz <- d[d$Bez == "SZ",4:23]
new_names <- paste("Jahr ", 2000:2019, sep="")
names(d)[4:23] <- new_names
summary(d)
#2.1
ibk <- as.numeric(d[d$Bez == "I",4:23])
plot(2000:2019,ibk,pch="i", xlab="Jahre")
#2.2
bev_sz <- apply(d[d$Bez=="SZ",4:23],2, FUN =sum)
plot(2000:2019,bev_sz,xlab="Jahre",type="l")
#3.1
d$durchschnitt <- apply(d[,4:23],1,FUN=mean)
d$minimum <- apply(d[,4:23],1,FUN=min)
d$maximum <- apply(d[,4:23],1,FUN=max)
d$range <- d$maximum - d$minimum
#3.2
bev_sum_bezirk <- aggregate(d[,4:23], by=list(d$Bez), FUN =sum)
bev_pro_jahr <- apply(bev_sum_bezirk[2:21],2, FUN =sum)
bev_alle_jahre <- sum(bev_pro_jahr)
#3.2.1
numbers <- d[4:23]
rangestnd <- numbers / d$range
# 4.1
boxplot(d$range~d$Bez, col = c("red","blue","green","grey","white","pink","purple","yellow","orange"))
# 4.2
barplot(ibk,xlab = "Jahre")
#5
#a
w <- read.csv("../datasets/bev_meld.csv", sep=";", encoding="UTF-8")
getwd()
dim(w)
schwaz <- apply(sz,2, FUN =sum)
m <- merge(w,d, by="Gemnr")
m$Bezirk <- NULL;
m$Gemeinde.y <- NULL;
names(m)
#b
m$winter_bev_2020 <- m$X2018/m$`Jahr 2018`
boxplot(m$winter_bev_2020~m$Bez)
#c
sub <- data.frame(gem=m$Gemeinde.x, m$winter_bev_2020)
ord <- order(m$winter_bev_2020, decreasing = T)
ord[269:279]
ord[1:10]
sub[ord[1:10],]
sub[ord[269:279],]
#d
sub[sub$gem == "Stans",]

