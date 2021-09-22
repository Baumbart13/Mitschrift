4 Layer 1 (Physical Layer/ Hardware Layer)
==============================================

#### Aufgaben:
- Bits übertragen (Probleme vermeiden)
- NICs (Network Interface Cards) miteinander verbinden
- Kommunikation mit Layer 2

#### Praktische Umsetzung: 
- Kupferkabel (elektrische Signale)
- Glasfaserkabel (elektromagnetische Wellen)
- Drahtlose - WLAN (elektromagnetische Welle)
- …

#### Bereiche;
- Physische Komponente (NIC, Kabel, Ports, Verbindungen, …)
- Kodierung (Bedeutung von 0 und 1, Manchester-Kodierung-Flanken (10 Mbit/s))
- Signale (0 und 1 erzeugen)

#### Wichtige Begriffe:
- Bandbreite: Die Bandbreite sind die Bits die pro Sekunde gesendet werden können (theoretisch). Einheit: bsp. bits/s
- Latenz: Die Latenz ist die Zeit, welche die Daten von Empfänger zum Sender benötigen.
- Durchsatz: Die Anzahl der Bits die pro Sekunde über die Leitung gesendet werden.
- Goodput: Die Anzahl der Bits pro Sekunde an nutzbaren Daten.
- Goodput = Durchsatz - Overhead Traffic

#### Kupferkabel
Das Kupferkabel ist das meist verwendete Kabel in aktuellen Computernetzen.

##### Vorteil:
- Billig
- Leichte Handhabung
- (Speed theoretisch bis zu 40 Gib/s)

##### Nachteil:
- Distanz (100m)
- Störungen von außen
Arten von Störungen:
EMI (Elektromagnetische Interferenzen)/RFI (Radio Frequenz Interferenzen)
Crosstalk: Signal springt auf eine andere Leitung
Arten von Kupferkabel:
Koaxialkabel
Twisted Pair Kabel
UTP (Unshielded Twisted Pair Kabel)
STP (Shielded Twisted Pair Kabel, teurer, besserer Schutz)
Twisted Pair Kabel
Besteht aus vier verdrillten Adernpaare (Orange, Braun, Blau, Grün) und RJ45 Stecker an jedem Ende.
Warum verdrillte Adern? Um Störungen zu vermeiden
Kategorien von Twisted Pair Kabel
Cat 3 - nutzt nur 2 Paar zum Senden und Empfangen, kein verdrillen
Cat 5/5e - 4 Paare, verdrillt (labor: 1000 Mbit/s)
Cat 6 - STP
Cat 7 - aktuell (10 Gbit/s)
Cat 8 (40 Gbit/s)
Kabelarten
Ethernet Crossover (einmal 568 A und 568 B)
Ethernet Straight Through (zweimal 568 A bzw. 568 B)
Der Switch ist ein Gerät der in der Buchse aufkreuzt
Stecker und Verbindungen (TIA/EIA)
