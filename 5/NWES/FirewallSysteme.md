Firewall-System
====

Personal-Firewall
----

- AUch Desktop- oder Software-Firewall genannt
- Schützt das lokale System vor Angriffen aus dem Internet und dem lokalen Netzwerk
- Paketfilter
- Applikationsfilter
   - Kontrolliert welche Applikation Verbindung aufbaut
      - Gilt aber nur für persönliche Firewall und nicht für Netzwerk-Firewall
   - Benötigt sehr tiefe Betriebssystem-Nähe
      - Anbieter von solcher Software hat im Grunde Zugriff auf das komplette Gerät
- Endpoint-Protection ist in Unternehmen die Gesamtlösung
   - Jeglicher Netzwerkverkehr wird analysiert und somit sind die Endgeräte sehr stark gesichert
- Tiefe Systemintegration
- Meist in Verbindung mit Antivirensoftware
- Zentrales Management un Unternehmen möglich
- Früher *musste* man Firewall haben, da man sonst verloren ist
- Auch wenn Rechner in öffentlichem Netzwerk auf öffentlicher IP liegt, kann niemand dem Rechner schaden
- Die persönliche Firewall blockiert alles, solange die Verbindung nicht von Rechner aufgebaut wurde.
- Netzwerk-Firewall kann Schadsoftware nicht erkennen und auch davor nicht unbedingt schützen, Software-Firewall kann Schadsoftware erkennen und davor gut schützen


Network-Firewall
----

- Auch Hardware- oder externe Firewall genannt
- Stehen meist an äußerster Stelle im Netzwerk, damit alles analysiert werden kann.
- Es ist kein interner Schutz, da nur Kommunikation mit der Aussenwelt betrachtet wird.
- Systeme können geschützt werden, ohne dass selbst etwas getan werden muss
   - Ist bei BYoD oft der Fall, da sonst pro Gerät eine Endpoint-Protection installiert werden muss
- Schützt ein Netzwerk vor Angriffen aus anderen Netzwerken
- Transparent oder routend einsetzbar
   - Transparent = es passiert kein Hop
      - funktioniert nur anhand der MAC-Adresse
	  - wird selten so angewendet
   - in der Praxis wird aber meist geroutet
- Schützt Systeme ohne administratven Eingriff am System selbst
- Oftmals kombiniert mit VPN-Services und IDS/IPS
   - IDS - Intrusion Detection System
   - IPS - Intrusion Prevention System
- Hardware limitiert Durchsatz je nach Technologie
   - je besser die Pakete betrachtet werden, desto weniger Durchsatz ist möglich


Firewall-Technologie
----

Nach Stärke aufsteigend sortiert

1. Paketfilter
   - nicht stateful
      - Firewall weiß Zugehörigkeit der Pakete nicht
2. Stateful Inspection (SPI)
   - Firewall merkt sich Anfragen nach aussen
   - Kann die Antwort auf die Anfrage gleich behandeln, wie die Anfrage
   - Sieht sich nur IPs und Ports an
3. Proxy als Firewall
   - Löst viele Probleme von SPI
   - Sieht sich auch Content von Paket an
   - Proxy ist im Prinzip ein gewollter Man-in-the-Middle
      - Proxy redet für Rechner nach draussen
	  - Erhält dementsprechend auch die Pakete
	  - überprüft (evtl) die Inhalte mit Erkennungssoftware
	  - bei Genehmigung wird Paket weitergesendet an Rechner
   - umständliches, manuelles konfigurieren
   - automatische Proxy-Konfiguration funktioniert meist nicht
4. Deep Packet Inspection (DPI)
   - Versucht den Content zu analysieren
   - Versucht herauszufinden, welche Anwendung das Paket sendet/erhält
   - Problem mit SSL
   - Um SSL (Verschlüsselungen) auch zu analysieren, werden Zertifikate benötigt
5. IDS / IPS
   - Es finden Analysen über das Verhalten statt
   - Manche Viren kommunizieren immer mit bestimmten Mustern periodisch mit HQ


Herausforderungen
----

- Verschlüsselung
- Protokoll-Vereinheitlichung
   - Früher hatte jede Anwendung seinen eigenen Port
   - Heutzutage alles der gleiche Port
      - 
- "am Laufenden" bleiben
   - Firewall muss immer auf aktuellsten Stand der Schadsoftwaren sein
- Interne Bedrohungen
   - Passwörter unter der Tastatur
   - Unsichere Passwörter
   - Firewall kann hier nichts dagegen tun


### **A: wie kann eine Hardware-Firewall verschlüsselte Kommunikation analysieren und filtern?**
[Link](https://moodle2.htlinn.ac.at/mod/assign/view.php?id=40043) zur Aufgabe im Moodle <br/>
Abgabe als PDF

Es werden 2 VMs benötigt -> beide genau im Auftrag beschrieben

Kleiner Netzwerkplan ist auch gewollt
   - Gut im Packet-Tracer
   - Alternative ist draw.io
