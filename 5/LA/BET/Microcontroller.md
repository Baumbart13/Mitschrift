Microcontroller
====


Warum ist Arduino so erfolgreich?
----

- Die IDE von Arduino
- Nicht nur Mikrocontroller konnten gekauft werden, sondern auch die Platine, Ein-/Ausgänge und eingebaute LED
- Auch USB-Schnittstelle bereits komplett vorhanden
   - Umwandlung von USB-Signal auf µ-Controller-Signal per eigenem Wandler-Chip


Besonderheit von ESP32
----

- Vorgänger: **ESP8266**
   - weniger Leistungsfähiger Prozessor
   - hatte nur WiFi, noch kein BLE
- Hat:
   - WiFi
   - BLE (Bluetooth)
   - Bussysteme
      - SPI
      - I2C
      - I2S
      - UART
      - CAN
      - ETH
      - DAC
      - ADC
      - PWM
      - Touch Sensor
   - Prozessor
      - DualCore
	  - eigener Prozessor für Verschlüsselung
   - Interner Speicher
   - teilweise externer Speicher unterstützt
- Hersteller:
   - War eigentlich ein Start-up
   - _ESPRESSIF_
   - Chinesischer Hersteller
- GPIO
   - Manche sind für Touch-Sensor geeignet


Funkübertragung
====

- Möglichkeiten der Informationsübertragung:
   - Frequenzmodulation (meiste Radiosender)
   - Amplitudenmodulation
   - Phasenverschiebung (kaum gebräuchlich)
- Arduino-Programm von Lehrer in Moodle-Kurs verfügbar unter _Funksteckdose Senden_
   - Zu-Sendendes Signal kann über verschiedene Arten angegeben werden
      - String mit binärem Inhalt
	  - Integer mit Dezimalzahl und Länge des Binärcodes
	  - Binärstring mit Haus-DIP-Code und Geräte-DIP-Code
	  - Hexadezimalstring mit TriState-Code


Informationen
====

Logikpegel
----

Hiermit ist definiert, ab welcher Spannung ein logisches ``HIGH`` und ab wann ein logisches ``LOW`` interpretiert wird.

----

SoC = System on Chip

Nützliche Links
====

- [Random Nerd Tutorials](https://randomnerdtutorials.com/)
- [Dronebot Workshop](https://dronebotworkshop.com/)
