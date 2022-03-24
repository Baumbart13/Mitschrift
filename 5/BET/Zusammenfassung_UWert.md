Allgemeines
====

- 1 Grad weniger Temperatur bringt eine Einsparung von 6% Heizenergie


- Was ist ein Standortklima
- Was ist ein Referenzklima
- Was ist ein Referenz-Wärmebedarf
- Was ist ein Heizwärmebedarf
- Was ist ein Warmwasserwärmebedarg
- Was ist ein Standortklima


Wärmedurchgangskoeffizient / U-Wert
====


- Einheit
    - ``Watt`` pro ``m² * Kelvin``
- besserer U-Wert = mehr Dämmung
- U-Wert = Kehrwert Wärmedurchgangswiderstand
- Wärmedurchgangswiderstand = Wärmedurchgangswiderstand + Wärmedurchlasswiderstand
- Wärmedurchgangskoeffizient = 1 / Wärmedurchgangswiderstand
- meist nachschlagbar für Bauteil für bestimmte Dicken


Berechnung für homogenes Bauteil
====

- homogen -> keine verschiedenen Materialien
- Wärmestrom meist horizontal von innen nach außen


Widerstand
====

- Einzelwiderstand = Dicke / Wärmeleitkoeffizient
- ``R = d / λ ``
- ``R[T] = R[si] + R1 + R2 + ... + Rn + R[se]``
- Wärmeübergangswiderstand außen + sämtliche Wärmedurchlasswiederstände + Wärmeübergangswiderstände innen = Wärmedurchgangskoeffizient


Beispiel 1
====

``C[L] = 1,2 KS/m³K``

Dichte von Luft in etwa ``1,29 kg/m³``

``C[W] = 4,2 KS/m³K``



Erklärung Berechnung
====

- 1 cm Außenputz
- 20cm Außen Styropor
- 20cm Betonwand
- 2 cm Kalkzementputz


1. λ-Werte aus dem Internet
2. 


#### λ-Werte

Rsi = 0,13
Rse = 0,04

| Material              | λ-Wert [W/(m*K)] | Dicke [cm] | Dicke [m] | U-Wert [W/(m²K)] | R [(m² * K) / W] | Rsi und Rse [(m² * K) / W] | R gesamt [(m² * K) / W] | U-Wert gesamt [W/(m² * K)] |
|:----------------------|-----------------:|-----------:|----------:|-----------------:|-----------------:|---------------------------:|------------------------:|---------------------------:|
| Zementputz            |            8.700 |          1 |      0,01 |           87,000 |           0,0115 |                  Rsi: 0,13 |                  5,1638 |                     0,1937 |
| Polystyrol-Hartschaum |            0.045 |         20 |       0,2 |            0,225 |           4,4444 |                  Rse: 0,04 |                         |                            |
| Leichtbeton           |            0.390 |         20 |       0,2 |            1,950 |           0,5128 |                            |                         |                            |
| Kalkzementputz        |            0.800 |          2 |      0,02 |            40,00 |           0,0250 |                            |                         |                            |


Heizwärmebedarf - Verluste

| Wände | Wärmebrückenzuschlag | Fenster/Türen | Fußböden | Dach | Lüftung |
|------:|---------------------:|--------------:|---------:|-----:|--------:|
|   20% |                   6% |           28% |       6% |   8% |     32% |

Innere Gewinne
- Kochen
- Glühlampen


Wie viel Watt der Heizung sind nötig für das Heizen?
----

- Hier: Planung
- Bei bestehendem Gebäude: Messen!!
- Norm: ``DIN EN 12831 Beiblatt 1 2008-07``
    - Die originalen Heizungen waren zu überdimensioniert für Deutschland
- Berechnung i.d.R. per Software


- Norm-Aussentemperatur:
    - "Wie kalt ist die Außentemperatur"
    - Theta[e]
    - "Kann kälter werden, wird es aber selten"
    - Bielefeld: -12°C
- Norm-Innentemperatur:
    - Theta[int]
    - je nach Raumart
        - typisch 20°C
- Norm-Heizlast eines Gebäudes:
    - Phi[HL], -Geb = Summe aller Räume der Phi[T] und Phi-V
        - Phi[T] <=> Was durch Fenster, Türen, Wände geht
        - Phi[V] <=> Was an Frischluft reinkommt
    - Phi[T] = Norm-Transmissionswärmeverlust
        - Ohne Flüsse zwischen beheizten Räume
        - Phi-T = H[T] * (Theta[int] - Theta[e])
            - H[T] <=> Transmissions-Wärmekraft-Koeffizient
            - H[T] = Summe (aller Flächen * U-Wert)
                - U-Wert <=> Wärmedurchgangskoeffizient
                    - "Wie schlecht dämmt das Bauteil/die Bauweise/das Baumaterial?"
                    - Einheit: W / (m² * K)
                - Einheit: W / K
    - Phi-V = Norm-Lüftungswärmeverlust
        - was zum Heizen gebraucht wird