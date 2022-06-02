NWES Maturapools
================

- Termine:
    - 19.05.2022
    - 

[Side Info](./SideInfo.md)


1 OSI-Model - Networking Concepts [ca 4 freiwillige Kandidaten]
---------------------------------------------------------------

+ Layer 1 - 7
    * Benennen
    * Aufgaben jeder Schicht
    * Protokolle
    * Zusammenspiel der Layer
        - Speziell im Packet-Tracer gut zeigbar
+ Netzwerkdesign
    * VLANs
    * Router
    * Firewall
+ Geräte
    - Hub + Repeater (Layer 1)
    * Switch (Layer 2)
    * Router (Layer 3)
+ TCP / IP
+ Evtl Wechsel / Zusammenhang mit TCP-Model
+ Weg der PDV
    * PDV = Datenpaket
+ Zeigen können, was warum auf welchem Layer eingetragen wird
+ Übertragungsmedien


2 Switching Concepts [ca 2 freiwillige Kandidaten]
--------------------------------------------------

+ Layer 2
    * Ethernet
    * ARP
    * Switch
        - Switching-Methoden
        - Aufgaben
        - MAC-Table
        - Flooding
    * MAC-Adressen
    * Topologie
    * Braodcast-Domain
        - Existieren unter anderem, damit VLANs nicht zu groß werden
    * VLAN (802.1q)
        + Arten von VLAN
        + Warum Trunk-Port?
        + Warum Access-Port?


3 Routing Concepts [ca 4 freiwillige Kandidaten]
------------------------------------------------

+ Layer 3
    * **IPv4**
    * **IPv6**
        - Dass es existiert
        - Warum es existiert
        - Wissen, wie in etwa eine IPv6-Adresse aussieht
        - Eventuelle Anwendungsfälle
    * Routing
        - Protokolle
            + RIP
            + OSPF
        - Tabellen
        - statisch
        - dynamisch
        - Befehl ``show ip-route``
        - Metrik
        - Administrative Distanz
        - NAT / PAT
            + Konfigurieren? Nein
            + Befehle bekannt sein? Von Vorteil
            + Befehl ``show runnning-config`` sehr nützlich. Inhalte sollen wiedergebbar sein
            + NAT: Damit man mehrere private Netze haben kann und diese miteinander kommunizieren können
            + PAT: Damit nicht nur IP-Adresse, sondern sogar auch der Port ausgetauscht werden kann
        - Subnetting / VLSM
        - ACL (Access Control List)
            + Kann man schnell "hineinfallen"
            + Hauptpool dafür ist **Security**
        - Inter-VLAN Routing
    * Weg der Datenpakete
        - Bspw nimmt RIP den Weg mit den wenigsten HOPs
        - Andere Protokolle nehmen schnelleren Weg, nicht unbedingt den kürzesten
            + Nicht immer ist der kürzeste Weg zugleich der schnellste Weg


4 Network-Security [ca 6 freiwillige Kandidaten]
------------------------------------------------

+ Firewall
+ ACL
+ Angriffe
    * MITM
        - Es kann bei DHCP schnell passieren
        - Es kann bei ARP schnell passieren
    * Virus
    * Trojaner
    * DDOS
+ Abwehrmaßnahmen
    * Layer 2
        - MAC-Filter
+ Netzwerkdesign
    * Bswp. Wo ist DMZ
+ NAT
    * Ursprünglich nicht dafür vorgesehen, aber von vielen als Sicherheitsmaßnahme eingebaut
+ AAA
+ CHAP
    * Challenge Handshake Authentication Protocoll
+ Verschlüsselung
    * Nicht erklären müssen, wie Verschlüsselung XY funktionert
    * Erklären können, wie Verschlüsselung angewandt werden kann
    * Wann wo gehashed wird
+ VPN
    * TODO: VPN wurde nicht wirklich behandelt
+ BSP.:
    * Angabe:
        - Bild von Topologie
    * Aufgabe:
        - Sicherheitsaspekte erläutern
        - Welche Firewalls?
        - Layer 3 Security?


5 Kryptographische Konzepte [ca 8 freiwillige Kandidaten]
---------------------------------------------------------

+ Symmetrische Verschlüsselung
    * Frage kann etwa auch mit Cäsar-Verschlüsselung gestartet werden
    * AES
+ Asymmetrisch Verschlüsselung
    * RSA
+ Hybride Verschlüsselung
+ Hashing
+ CHAP
    * Challenge Handshake Authentication Protocoll
+ Warum ist das sicher? Warum nicht?
+ TLS / HTTPS
+ Zertifikate
+ SALT
+ Diffie-Hellmann


6 WiFi [ca 1 freiwillige Kandidaten]
------------------------------------

+ TODO: Wurde relativ gering behandelt
+ Arten
+ Standards
+ Wellenlängen
+ Channels
+ Heim-Router
    * Kann auch viel bei ``Layer 2`` und ``NAT`` behandelt werden
+ Security
+ AP
    * Access Point
    * verschiedene Arten
        - Jeder einzeln zu konfigurieren
        - Über AP-Controller zu konfigurieren
        - kann alles angemessen sein, je nach Nutzen
