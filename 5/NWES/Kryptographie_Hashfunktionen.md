Hashfunktionen (Streufunktionen)
====

- Ist eine Funktion, wo der Bildbereich (= Output) kleiner ist als der Wertebereich (= Input)
- Bei Funktionen (bspw. ``Sinus``) will man grundsätzlich eine Gegenfunktion (bspw. ``Arcussinus``) möglich machen
- Bei Hashfunktionen ist die Absicht, dass es keine Gegenfunktion gibt


Beispiele für Anwendungen

- ISBN
- Namen -> Anfangsbuchstaben
- CRC (cyclic redundancy check)
- ...


Sie können das Ergebnis auf eine fixe Größe anpassen. Daher sind Hashfunktionen auch beliebt bei Suchalgorithmen.


Kryptographische Hashfunktionen
====

- Einwegfunktion
    - "Funktion mit Falltür"
- Chaos-Lawineneffekt
- Kollisionsresistent
    - Es werden immer Kollisionen auftreten können
    - Treten keine Kollisionen auf, besteht eine perfekte Hashfunktion, was nicht möglich ist
- Konfusion
    - Keine Rückschlüsse von Hash auf originale Daten


Typische Hashalgorithmen
----

- SHA (**S**ecure **H**ash **A**lgorithm)
    - Versionen
        - SHA1
        - SHA2
        - SHA3
    - einzelne Algorithmen
        - SHA256
        - SHA512
        - ...
    - Ab SHA
- MD5
    - 128 Bit
    - Unsicher


Eigenschaften
----

- kleine Änderungen vom Wert führen zu extremen Änderungen im Bild
- für Computer sehr einfach zu berechnen
    - beinhalten mehrere ``Modulo``-Operatoren


Passwörter
====

Um Passwörter im Klartext speichern zu können müssen diese Kriterien erfüllt sein:

- Das System wird nie gehackt
- Jeder Netzwerkadmin ist zu 100% vertrauenswürdig

Beide Voraussetzungen sind nie erfüllt


Salt
====

Es wird eine zufällige Zeichnkette an den Klartext gehängt, bevor es gehashed wird

| Client                     | Richtung | Server   |
|:---------------------------|:--------:|:---------|
| Anfrage                    |  ->->->  |          |
| Passwort + ``SALT`` hashen |  <-<-<-  | ``SALT`` |
| Hash                       |  ->->->  |          |
| ACK                        | <->-<->  | ACK      |


CHAP (**C**hallenge **H**andshake **A**uthentication **P**rotocol)
====

| Client                      | Richtung | Server                                                                    |
|:----------------------------|:--------:|:--------------------------------------------------------------------------|
| Anfrage                     |  ->->->  |                                                                           |
| Password + Challenge hashen |  <-<-<-  | Zufallszahl (Challenge)                                                   |
| Hash                        |  ->->->  | Aus Datenbank: Passwort + Challenge (Passwort ist aber nicht in Klartext) |
| ACK                         | <->-<->  | ACK                                                                       |


PAP
----

Warum ist PAP ein Problem bei _MitM_?