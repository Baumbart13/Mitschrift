WLAN (**W**ireless **L**ocal **A**rea **N**etwork)
====

| Vorteile                              | Nachteile        |
|:--------------------------------------|:-----------------|
| Flexibel                              | Störanfälliger   |
| evtl Kosten                           | Geteiltes Medium |
| **B**ring **Y**our **O**wn **D**evice | Sicherheit       |
| Anpassungsfähigkeit                   |                  |


Arten von Wireless LANs
----

- WPAN
    - Wireless Personal Area Network
    - Bluetooth (IEEE 802.15)
- WLAN
    - Wireless Local Area Network
    - WiFi (802.13)
- WNAN
    - Wireless Metropolitian Area Network
- WWAN
    - Wireless Wide Area Network


WiFi-Standards
----

- 802.11
    - 2,4 GHz
    - 2   Mbit/s
- 802.11a
    - 5   GHz
    - 54  Mbit/s
- 802.11ax (2019)
    - 2,4 GHz
    - 5   GHz
    - abwärtskompatibel


Elektromagnetische Welle
----

- 2,4 GHZ
    - b
    - g
    - n
    - ax
- 5   GHZ
    - a
    - ac
    - ax


WLAN-Design
====

- Wireless Router
    - meist zusätzlich
        - Switch
        - Router
        - Access Point
        - ...
- Repeater
- Access Point
    - Autonom
    - Controller Based
        - 


Opertaions-Modi
====
- Ad-Hoc
    - Bluetooth
        - Kopfhörer
        - Lautsprecher
        - ...
- Infrastruktur
    - WiFi
        - Schul-WLAN
        - Firmen-WLAN
        - ...
- Tethering
    - bspw. Hotspot


WLAN-Channels
====

![WLAN-Channels](./images/WlanChannels.svg)

Je nach Land gibt es verschiedene Channel-Anzahl. USA haben 11 Channels. Japan hat 14 Channels.

Durch Überlappungen vom Netz entstehen Störungen und das Netz für den Benutzer wird schlecht.

Überlappung kann dadurch verhindert werden, dass die Netzfrequenz weiter ausgebreitet wird (mehr Frequenzbereich muss gekauft werden)

- 2,4 GHz
    - 2,4 bis 2,5 GHz
    - 13 Channels mit je Breite von 22 MHz
- 5   GHz
    - 24 Channels ohne Überlappungen


WLAN-Security
====

Durch das geteilte Medium erhält jeder die Nachrichten, die man sendet und empfängt. Jeder ist ein potenzieller Eve. <br/>
Dagegen kann nur Verschlüsselung helfen

- Datendiebstahl 🢥 Shared Medium 🢥 verschlüsseln
- DoS (**D**enial **o**f **S**ervice)
- Rogue AccessPoint / Evil Twin
    - SSID-Beacon
- Unerwünschte Eindringlinge
