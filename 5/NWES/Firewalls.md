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
      - Firewall entpackt alles, sieht alles durch, muss entscheiden, ob genehmigt oder nicht, packt zusammen und muss richtig wieder weiterleiten

---

Software-Firewall ist auch guter Schutz zusätzlich zu Hardware-Firewall, da Menschen mit BYOD-Geräten wissen was sie tun mit ihren Geräten

Recherche für Unterschiede zwischen

|   | ACL | SPI | DPI |
|:---:|:---:|:---:|:---:|
| Vorteile |   |   |   |
| Nachteile |   |   |   |
| Generelles |   |   |   |