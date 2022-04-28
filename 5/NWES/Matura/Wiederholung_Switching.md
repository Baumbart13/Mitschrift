Wiederholung
============

- 2 PCs
    - Lehrer-PC
        - VLAN 10
    - Schüler-PC
        - VLAN 20
    - hängen beide an 1 Switch
- Switch
    - ist mit den beiden PCs verbunden
    - ist mit L3-Switch verbunden
- L3-Switch
    - ist mit Switch verbunden
    - ist mit ISP verbunden
- ISP
    - ist mit L3-Switch verbunden
    - ist mit Internet verbunden
- Internet
    - ist mit ISP verbunden
    - ist mit DNS-Server-Netzwerk verbunden
    - ist mit Webserver-Netzwerk verbunden
- DNS-Server-Netzwerk
    - ist per Router und Switch zum Internet verbunden
    - besitzt 1 DNS-Server
        - hat Liste mit Domain und dazugehöriger IP gespeichert
- Webserver-Netzwerk
    - ist per Router und Switch zum Internet verbunden
    - besitzt 1 Webserver


-----


DHCP ist so einfach, dass (theoretisch) auch ein L3-Switch dazu fähig ist ein DHCP-Server zu sein

-----

-----

Subnetting
==========

- Ist gut, wenn man sich die Tabelle dazu merkt.

| Subnetmask (1er in der Subnetzmaske) |  ausgeschrieben |         Hosts | Unterste Adresse | Oberste Adresse |
|-------------------------------------:|----------------:|--------------:|-----------------:|----------------:|
|                                  /25 | 255.255.255.128 | 2^7 - 2 = 126 |                  |                 |
|                                  /26 | 255.255.255.192 |  2^8 - 2 = 62 |                  |                 |
|                                  /27 | 255.255.255.224 |  2^9 - 2 = 30 |                  |                 |
|                                  /28 | 255.255.255.240 | 2^10 - 2 = 14 |                  |                 |
|                                  /29 | 255.255.255.248 |  2^11 - 2 = 6 |                  |                 |
|                                  /30 | 255.255.255.252 |  2^12 - 2 = 2 |                  |                 |

Am besten mit dem größten Netz starten.


Firewall
========

Wenn Firewall an Stelle XY steht, in was kann sie dann reinschauen?