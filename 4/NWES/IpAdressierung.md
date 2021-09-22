# 1 IP-Adressierung

#### IPv4 - Internet Protocol Version 4
Eine IPv4-Adresse besteht aus 32-Bit -> 4,3 Milliarden Möglichkeiten

| 11000000 | 10101000 | 00001010 | 00001010 |
|:---:|:---:|:---:|:---:|
| Oktette | Oktette | Oktette | Oktette |
| 128+64 | 128+32+8 | 8+2 | 8+2 |
| 192 | 168 | 10 | 10 |
| Netzteil | Netzteil | Netzteil | Hostteil |

-> 192.168.10.10/24

Die Subnetzmaske gibt an, wo zwischen Netzwerkteil und Hostteil getrennt wird.

| Prefix | Subnetzmaske | Hosts |
|:---:|:---:|:---:|
|/8 |255.0.0.0     |232-8-2 |
|/16| 255.255.0.0  |232-16-2|
|/24| 255.255.255.0|232-24-2|
|/28|255.255.255.240|232-28-2|
- Netzadresse (erste Adresse)
- Broadcastadresse (letzte Adresse)(an alle)

Bsp.:
Netzwerk:    192.168.5.0 /24
Netzadresse:    192.168.5.0
Broadcastadresse:    192.168.5.255
Hosts:    192.168.5.1 - 192.168.5.254
Netzwerk:    10.0.0.0  /8
Netzadresse:    10.0.0.0
Broadcastadresse:    10.255.255.255
Hosts:    10.0.0.1 - 10.255.255.254

#### Netzwerkgeräte
1. Endgeräte
2. Router: verbindet verschiedene Netzwerke
3. Switches: verbindet Geräte in einem lokalen Netzwerk.

#### Private IP-Adresse
- 10.0.0.0 /8
- 172.16.0.0 /12
- 192.162.0.0 /16
