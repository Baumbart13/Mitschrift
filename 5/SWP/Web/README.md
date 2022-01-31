Strategy Pattern
====

Zielt auf austauschbares Verhalten ab.
Erklärt mithilfe von Entenjagd mit verschiedenen Enten.

- Klassen
    - Ente
        - implementiert
            - Bewegungsverhalten
- Interfaces
    - Bewegungsverhalten
    - Fliegen
        - erbt von
            - Bewegungsverhalten
    - Schwimmen
        - erbt von
            - Bewegungsverhalten
    - Nicht bewegen
        - erbt von
            - Bewegungsverhalten


Observer Pattern
====

Erklärt mithilfe von Wellensensoren und einer Warnmeldung, die entgegengenommen
wird von der Zentrale.

Der Sensor meldet der Zentrale, dass wenn etwas passiert, dies gemeldet werden soll,
anstelle davon, dass die Zentrale bei jedem Sensor nachfragt, ob etwas passiert ist.

- Wer ist der Beobachter?
    - Zentrale
- Wer ist der Beobachtete?
    - Sensor


- Zentrale beobachtet Sensoren
- Signalgeber beobachten Zentrale
    - Wenn Signalgeber bestimmten Wert erhält, soll
        1. Blinker
        2. Sirene


- Observer
    - stellt ``update()``-Methode zur Verfügung mit ``Observer`` und ``deltas`` als Parameter
- Observable
    - ``List<Observer>``
    - ``add(Observer)``
    - ``remove(Observer)``
    - ``notifyAll()``

