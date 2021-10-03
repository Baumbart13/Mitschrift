Einführung Simulation
====

Kurzerklärung
----

> Ein möglichst realitätsnahes Nachbilden von Geschehen der Wirklichkeit. Aus Sicherheits- und Kostengründen ist es für fast alle konkreten Problemkreise notwendig, sie aus der Realität zu lösen und abstrakt zu behandeln; d.h. durch Abstraktion wird ein Modell geschaffen, an dem zielgerichtet experimentiert wird. Die daraus resultierenden Ergebnisse werden anschließend wieder auf das reale Problem übertragen.

Sie bildet die Geschehen der Wirklichkeit möglichst realitätsnah nach.

Klassifizierung
----

|     |                                                                             |                                                                                    |
|:---:|:--------------------------------------------------------------------------- |:---------------------------------------------------------------------------------- |
| 1   | Physikalisches Modell (Windkanal)                                           | abstraktes Modell (Planspiel)                                                      |
| 2   | Modelle mit menschlicher Entscheidung (militärische Sandkastenspiele)       | ohne menschliche Entscheidung (Automatensteuerung)                                 |
| 3   | deterministische Modelle (Wärmeflussgleichungen)                            | stochastische Modelle (mindestens 1 Zeitpunkt ist zufällig; bsp Molekularbewegung) |
| 4   | statische Modelle                                                           | dynamische Modelle (es finden Zustandsänderungen statt)                            |
| 5   | kontinuierliche Modelle (Änderungen sind immer)                             | diskrete Modelle (Änderungen nur in diskreten Zeitpunkten                          |

Stochastische Simulation
----

Zu betrachtende Einflussgrößen sind per Zufall bestimmt, somit sind Eingangsdaten und Ergebnisse nicht reproduzierbar. Die Beziehungen der Wahrscheinlichkeitsverteilungen und die Veränderungen können beschrieben werden. EDV-Systeme erleichtern den Aufbau und Ablauf von diesen Simulationsmodellen.

----

Eigenschaften eines Modells (Simulation)
----

- Korrektheit
   - syntaktische Korrektheit (= generell; bei Programmieren -> richtige Syntax)
      - entspricht der Korrektheit für den Compiler beim Programmieren
   - semantische Korrektheit (= logische Korrektheit)
      - entspricht der Korrektheit des Codes selber, dass zB eine Schleife über Array iteriert und nicht darüber hinaus beim Programmiern
   - Überprüfung der Korrektheit nennt man __Verifikation__
> _"Das Modell wird richtig erstellt"_
- Gültigkeit (Entsprechung der Realität)
   - strukturelle Gültigkeit (Ist das Modell so genau wie nötig? Ist das Modell so ungenau wie möglich?)
   - zeitliche Gültigkeit (Ist das Modell akkurat in Zusammenhang mit der Zeit? Auch im Verlauf der Zeit korrekt?)
   - Überprüfung der Gültigkeit nennt man _Validierung_

Simulationskreis
----

|     |     |     |
|:---:|:---:|:---:|
| reales System                    | ➡➡ Reduktion / Abstraktion ➡➡      | Simulationsmodell (Animationen) |
| ⬆⬆ Anwenden ⬆⬆                   |                                       | ⬇⬇ Experimente ⬇⬇                |
| Folgerungen für das reale System | ⬅⬅ Übertragung / Interpretation ⬅⬅ | formale Ergebnisse              |
