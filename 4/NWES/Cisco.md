# 2 Cisco Geräte

1. Shell (GUI, CLI)
2. Kernel
3. Hardware

Betriebssystem: IOS… internet operating system
Zugang:
1. Konsolenkabel
2. Telnet
3. SSH

```
User Execution Mode (>)
-enable-
Privileged Execution Mode (#)
-config terminal-
Global Configuration
-interface [gigabitEthernet / fastEthernet] [Number]-
(config-if#)
-ip address [IP-Adresse] [Subnetzmaske]-
-no shutdown-

startup-config    running-config    (VLan.dat)
NVRAM    RAM        Flash
```

#### Telnet/SSH
```
enable password
enable secret
show running
line console 0
(strg + shift + 6)
service password-encrypt
username [username] password [password]
line vty
telnet [IP]
ip domain-name [cisco.com]
crypto key generate rsa
ip ssh version [2]
login local
transport input [all / …]
ssh [username] [IP-Adresse]
interface [vlan] [1]
```

#### Hosts (End Device, Switch, Router, Server, Clients, …)
Server stellt Dienste zur Verfügung ()
Client stellt die Anfrage (Clientsoftware, Bsp. Firefox)

#### Netzwerk-Komponente
- End Devices
- Intermedia Devices (Router, Switch, Hub, Access Point, Firewall, L3-Switch, …)
- Medien (Kupfer, Glasfaser, Drahtlos)

#### Netzwerk-Modelle
- Client-Server
- peer-to-peer

#### Diagramme / Topologie
- Physische Topologie
- Logische Topologie

#### Netzwerkkarten
- SOHO    (Small Office Home Office - Heimnetzwerk)
- LAN    (Local Area Network)
- (PAN)
- MAN    (Metropolitan Area Network)
- WAN    (Wide Area Network)
- Internet    (Intranet, Extranet)
- ISPs = Internet Service Providers

#### Internet-Zugang
- SOHO / DSL (ADSL), DRAHTLOS (TELEFONNETZ), Glasfaser, Satellit, Dial-Up

#### Netzwerkanforderungen
- Fehlertoleranz
- Quality of service
- Security
- Skalierbarkeit

#### Security
- Virus, Wurm, Trojaner
- (D)DOS
- ZERO-DAY (Zeit zwischen Software-Lücke und der Lösung der Lücke)
- …

#### Trends
- BYOD    (Bring Your Own Device)
- Online Collaboration
- Cloud
- Powerline Network
- Video
- IOT
- 5G

#### Peer-2-Peer
Alle Geräte gleich berechnet, abhängig nach ihrer Arbeitsfähigkeit

#### Client-Server
