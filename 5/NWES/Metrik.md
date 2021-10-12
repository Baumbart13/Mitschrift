Metrik und adminsitrative Distanz
====

Administrative Distanz
----

Gibt an, wie gut das Routing-Protokoll ist.

Wie sehr man der Quelle des Protokolls vertrauen kann

- Jede adminsitrative Distanz hat eine eigene Quelle
- Je niedriger der Wert, desto eher stimmt die Adresse
- Die adminsitrative Distanz sagt aus, wie sehr der Router glaubt, dass die Adresse dass sie auch stimmt. Sie ist vom Verbindungstyp (zB ``static route``, RIP, OSPF, etc) abhängig

Metrik
----

Gibt an, wie gut die Route innerhalb meines Protkolls ist.

Berücksichtig werden hierbei...
- Welche Latenz?
- Ausfallrate?
- Wie ist die momentane Auslastung?
- CPU-Auslastung des Routers
