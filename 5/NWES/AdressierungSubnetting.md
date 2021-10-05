Adressierung im LAN / Subnetting
====

IPv4
----

- 32 Bit Zahl in dotted decimal Form geschrieben
   - 4.3 Milliarden IP-Adressen 
- Subnetzmaske auch mit 32 Bit
   - Wird in Prefix Notation angegeben (/8, /16, /24)
- Netzteil und Hostteil 
   - Max. 216 – 2 Hosts
- Selber Netzteil = selbes Netz

Private Adressen/ classless Adressing
----

- Private Adressen:
   - 10.0.0.0/8
   - 172.16.0.0/12
   - 192.168.0.0/24
- Classless Adressing
   - Subnetzmaske wird beliebig gewählt

IPv6
----

- 128 Bit Adresse -> 2128 Möglichkeiten
- Besteht aus:
   - 32 Hexadezimale Ziffern
   - 8 Hextetten
- Subnetzmaske in Präfix-Notation (z.B. /64)
- Zusätzlich auch Link Local Adresse
   - Benötigt für Kommunikation im selben Netzwerk
   - fe80-febf
- Kommunikationsarten:
   - Unicast
   - Multicast
   - Anycast
- Wichtigsten Adressen:
   - Loopback (::1)
   - Unspecified Address (::)
   - Global Unicast (1. Hextet: 2001 – 3FFF)

IPv6-Adresse Beispiel
----

- Da IPv6 relativ lang -> 2 Regeln um zu kürzen:
   - Führende 0 weglassen
   - Hextette mit 0000 durch ersetzen
- Beispiel:
   - 2001:0000:0000:DB84:00B6:000A:0B0A:0011 /64
   - 2001:0:0:DB84:B6:A:B0A:11 -> (mit Regel 1)
   - 2001::DB84:B6:A:B0A:11 -> (mit Regel 2)

Subnetting
----

- Netze in mehrere kleinere Aufteilen: 
   - 1 Netz in mehrere aufteilen
      - 1 Netz mit 254 Hosts -> 2 Netze mit jeweils 126 Hosts
      - oder: 4 Netze mit 62 Hosts
   - Wird nach Präfix Notation geteilt
      - Größere Zahl = weniger Hosts (/30 = 2 Hosts; /25 = 128 Hosts)
      - Netz mit größter Anzahl Hosts startet mit X.X.X.0

VLSM (Variable Length Subnet Mask)
----

- Ziel: IP-Adressen vergeben und so wenig wie möglich verschwenden
- Funktionsweise wie Subnetting
   -> Allerdings variable gewählte Subnetzmasken -> Unterschiedliche Netzwerkgrößen
- Beispiel – 172.16.10.0 / 24 – 2 Netzwerke (100- bzw. 10 Hosts)
- Netzwerk 1:
   - Netzadresse: 172.16.10.0 - Subnetzmaske: /25 255.255.255.128
   - Hosts: 172.16.10.1 - 172.16.10.126
- Netzwerk 2:
   - Netzadresse: 172.16.10.128 - Subnetzmaske: /28 255.255.255.240
   - Hosts: 172.16.10.129 - 172.16.10.143

IPv6-Subnetting
----

<table>
	<td>
		<tr>Globale Routing Präfix</tr>
		<tr>Subnetz-ID</tr>
		<tr>Schnittstellen-ID</tr>
	</td>
	<td>
		<tr>48 Bits</tr>
		<tr>16 Bits</tr>
		<tr>64 Bits</tr>
	</td>
</table>

- Beispiel:
   - 2001:DB8:ACAD::/48
   - Netz 1: 2001:DB8:ACAD:0001::/64
   - Netz 1: 2001:DB8:ACAD:0002::/64
