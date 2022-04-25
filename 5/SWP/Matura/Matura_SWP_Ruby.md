Algorithmen
===========

- Nur erwähnen können (Diskutieren können)
    - Aufwandsklassen
        - Müssen auch erkannt werden können
        - Setzen sich aus Tauschoperationen und Vergleiche zusammen
        - Definition
            - Beschreiben die Vertausch- und Vergleichsoperationen einer Methode
            - Man beobachtet immer den Worst-Case
        - Drückt man immer mit ``n``, bzw. ``O(n)`` aus
    - Vor-/Nachteile
    - Wie funktionieren sie?
    - Pseudocode muss möglich sein zu schreiben
    - Müssen unabhängig der genauen Implementierung programmiert werden
    - Müssen auf den beinhalteten Datentypen angewandt werden können
        - zB ``double`` statt ``int`` verwenden
        - zB ``LocalDateTime`` statt ``int`` verwenden
    - Algorithmen
        - Binary Search
        - Mergesort
            - Wurde nicht ausprogrammiert
        - Insertionsort
        - Selectionsort
        - Quicksort
            - Code wurde angeschaut
            - Mutation
                - Durch verdreht-sortierte (Teil-)Listen mutiert die Aufwandsklasse von ``n*log(n)`` zu ``n²``
- (End-)Rekursion
    - Alle Rekursionen werden in iterative Form umgewandelt während der Kompilierung
    - Bei der Endrekursion berechnet die letzte Rekursionsebene die Parameter für die nächste Rekursionsebene
    - Bezieht sich auf den Stack
- Linked List
    - Verkettete Liste, nicht Java-Liste
    - Soll ausprogrammierbar sein
        - Einfügen
        - Löschen
        - Sortieren (auf Niveau von "Bubblesort-ähnlichen Algorithmen")
    - Auch Doubly Linked List
- Ausprogrammieren können
    - Bubblesort
- Stable / Unstable muss nicht erklärbar sein, aber anwendbar
- In-Place
    - Wenn Algorithmus nur Konstanten von N unabhängigen Speicher benötigt, dann ist er in-place
    - Der Speicherverbrauch ist unabhängig der Anzahl der Elemente innerhalb des Datentyps/Containers
    - Bezieht sich auf den Heap


Java
====

- Wer (objektorientiert) programmieren kann, kann die SWP-Matura leicht schaffen
- Theorie muss bekannt sein
    - Was ist der "Stack"?
    - Wie funktioniert Java?
        - Compiled?
        - Interpretiert?
        - OOP?
    - Funktionalitäten
        - Dateien Ein-/Ausgabe
        - (Manipulation von Strings)?
        - Schleifen
        - OOP
            - Vererbung
            - Interfaces
            - Polymorphie
            - Abstrakte Klassen
            - Wie funktioniert in Java Vererbung?
- Datentypen
    - Sollen erklärbar sein
    - Was ist "Mutable"?
    - Was ist "Immutable"?
- Anonyme Methoden sind auch möglich
    - Soll man erklären können
- GUI kommen nicht
- Datenbankverbindungen sind möglich


Aufgaben
========

- Angaben bei Matura werden wie in der Praxis gestellt
- bei Prof. Rubner
    - Aufgabe + Theoriefrage dazu
    - Aufgabe + Theoriefrage dazu
    - Theoriefrage
- bei Prof. Holzmann
    - Aufgaben
    - Fragen


Matura
======

Rubner behauptet, dass gute Programmierer so etwa 1h bis 1,5h benötigen pro Aufgabe in seinem Teil

> "Die Aufgabe, die Sie am besten beherrschen, sollten Sie als erstes machen"     - Rubner Sabo

> "Alle (essentiellen) Fragen so früh wie möglich stellen"     - Rubner Sabo

> "Des was Sie nid verstehen nachfragen"     - Rubner Sabo

Rubner sein Ziel ist, dass die Absolventen/Absolventinnen mehr als der Durchschnitt können

Kompensationsteil ist bei Rubner schwerer als der Hauptteil

Wenn Klammer oder Strichpunkt an einem unwichtigem Punkt (zB Variablendeklaration) vergessen wird, ist es nicht schlimm

Rechtschreibfehler sind nicht schlimm, solange sie nicht den Sinn verändern (Groß-/Kleinschreibung, Buchstaben vergessen ("irelevant" statt "irrelevant"))


Allgemein
=========

**Wenn man das auf der Tafel kann, kann man eigentlich alles**

<details><summary>Foto Tafel</summary>

![Tafel mit Stoff](./tafel.png)

</details>


<table>
    <tr>
        <td colspan="2">Bubble Sort</td>
    </tr>
    <tr>
        <td>Insertion Sort</td>
        <td rowspan="2">(End-)Rekursion</td>
    </tr>
    <tr>
        <td>Mergesort</td>
    </tr>
    <tr>
        <td>Selection Sort (Stable)</td>
        <td>Linked List</td>
    </tr>
    <tr>
        <td colspan="2">Quicksort</td>
    </tr>
    <tr>
        <td>Binary Search</td>
        <td>Aufwandsklassen</td>
    </tr>
</table>


- Bubble Sort
- Insertion Sort
- Mergesort
- Selection Sort (Stable)
- Quicksort
- Binary Search
- (End-)Rekursion
- Linked List
- Aufwandsklassen

> "Wenn man alles durchgeht, was wir miteinander programmiert haben, kann man die Matura leicht schaffen"     - Rubner Sabo

> "Des kann nur a gmahde Wiesn sei, wenn Sie noamol alls durchgehen, was ma de Jahre gmacht hamm"     - Rubner Sabo