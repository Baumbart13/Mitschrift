Firewalls
====

ACL - Access Control List / Stateless inspection firewall
====

Stateful (packet) inspection firewall (SPI)
====

- Hält Überischt über Verbindungen
- Nicht nur Ausgänge, sondern auch Antworten werden überprüft und überwacht
- Geht nur bis Layer 4

Depacket Inspection (DPI)
====

- Bis ins letzte bit auf Layer 7 wird das Packet auseinander genommen und analysiert
- Problem: 
   - Geschwindigkeit
      1. Firewall entpackt alles
	  2. Sieht alles durch
	  3. Muss entscheiden, ob genehmigt oder nicht
	  4. Packt zusammen
	  5. Muss richtig wieder weiterleiten

---

Software-Firewall ist auch guter Schutz zusätzlich zu Hardware-Firewall, da Menschen mit BYOD-Geräten wissen was sie tun mit ihren Geräten

Recherche für Unterschiede zwischen

|   | ACL | SPI | DPI |
|:---:|:---:|:---:|:---:|
| Vorteile |   |   |   |
| Nachteile |   |   |   |
| Generelles |   |   |   |