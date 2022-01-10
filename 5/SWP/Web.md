Servlets / JSP
====

- Seitentausch
- Daten laden
- JDBC


OO / Design Patterns
====

- Kapselung
   - Java / C# / C++
      - 3 Access-modifier
   - Sonderfall Java
      - Wenn kein modifier steht, ist es ``package-private``
- Vererbung
   - "Nur du und geerbte Klassen haben Zugriff darauf" - ``protected``
   - "Nur du hast Zugriff drauf" - ``private``
   - "Alle haben Zugriff auf alles" - ``public``
   - Schülernotiz dazu: "WTF? Wie kann man so richtig und falsch **zugleich** liegen?"
   - Interfaces
      - beinhalten
         - gemeinsames Verhalten
         - Konstanten
- Dynamic / Late Binding
   - Binding
      - Static / Early
         - Bei Kompilierung wird direkt alles in Maschinensprache übersetzt
         - Verhalten wie bei ``C/C++``
      - Dynamic / Late
         - Es wir Zwischencode erzeugt und bei Bedarf wird der Zwischencode in Maschinensprache übersetzt
         - Verhalten wie bei interpretierten Sprachen e.g. ``Python``, ``Java``, ``C#``
         - Zur Laufzeit wird entschieden, welcher Programmcode ausgeführt wird


Geschichtliches zur Objektorientierung
====

1. Maschinensprache
2. Assemblersprache
3. Funktionen
4. Hochsprachen
   - C
   - Python
5. Datenstrukturen
   - Arrays
   - Listen
6. Konzept der Module
   - Module
      - wie Klassen vererbbar, aber nicht instanzierbar
   - Das Konzept von _Datenstrukturen_ und _funktionellem_ Programmieren hatten Sex und somit waren _Module_ geboren
7. Objektorientiertheit
   - Seit Ewigkeiten Schluss
   - Hat sich am längsten gehalten bis jetzt
   - Scheint **das** Konzept zu sein
   - _Fehlerfreiere_ und _wartungsfreiere_ Programme sind das Ziel dahinter
      - Durch weniger Wartung gehen geringere Wartungskosten einher
	  - Wartung ist nicht unbedingt kleiner/einfacher durch dieses Prinzip


Strategy Pattern
====

Erklärt mithilfe von Entenjagd mit verschiedenen Enten.
Zielt auf austauschbares Verhalten ab.

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