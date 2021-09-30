Einführung Simulation
====

Kurzerklärung
----

> Ein möglichst realitätsnahes Nachbilden von Geschehen der Wirklichkeit. Aus Sicherheits- und Kostengründen ist es für fast alle konkreten Problemkreise notwendig, sie aus der Realität zu lösen und abstrakt zu behandeln; d.h. durch Abstraktion wird ein Modell geschaffen, an dem zielgerichtet experimentiert wird. Die daraus resultierenden Ergebnisse werden anschließend wieder auf das reale Problem übertragen.

Sie bildet die Geschehen der Wirklichkeit möglichst realitätsnah nach.

Klassifizierung
----

|     |     |     |
|:---:|:--- |:--- |
| 1 | Physikalisches Modell (Windkanal) | abstraktes Modell (Planspiel) |
| 2 | Modelle mit menschlicher Entscheidung (militärische Sandkatenspiele) | ohne menschliche Entscheidung (Automatensteuerung) |
| 3 | deterministische Modelle (Wärmeflussgleichungen) | stochastische Modelle (mindestens 1 Zeitpunkt ist zufällig; bsp Molekularbewegung) |
| 4 | statische Modelle | dynamische Modelle (es finden Zustandsänderungen statt) |
| 5 | kontinuierliche Modelle (Änderungen sind immer) | diskrete Modelle (Änderungen nur in diskreten Zeitpunkten |

Stochastische Simulation
----

Zu betrachtende Einflussgrößen sind per Zufall bestimmt, somit sind Eingangsdaten und Ergebnisse nicht reproduzierbar. Die Beziehungen der Wahrscheinlichkeitsverteilungen und die Veränderungen beschrieben werden. EDV-Systeme erleichtern den Aufbau und Ablauf von diesen Simulationsmodellen.

----

Eigenschaften eines Modells (Simulation)
----

- Korrektheit
   - syntaktische Korrektheit (= generell; bei Programmieren -> richtige Syntax)
      - entspricht der Korrektheit für den Compiler beim Programmieren
   - semantische Korrektheit (=logische Korrektheit)
      - entspricht der Korrektheit des Codes selber, dass zB eine Schleife über Array iteriert und nicht darüber hinaus beim Programmiern
   - Überprüfung der Korrektheit nennt man <u>Verifikation</u>
