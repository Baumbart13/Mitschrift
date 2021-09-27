ORM
====

Object-Relational Mapping
----

- Informationssysteme
- Amann Markus
- HTL Anichstrasse

ORM Definition
----

- Objektrelationale Abbildung (ORM)
   - Englisch “object-relational mapping“

- Definition
   - Technik der Softwareentwicklung, mit der ein in einer objektorientierten Programmiersprache geschriebenes Anwendungsprogramms seine Objekte in einer relationalen Datenbank ablegen kann. 

- Definition „kurz“
   - Dem Programm erscheint die Datenbank dann als objektorientierte Datenbank, was die Programmierung erleichtert.

ORM Einführung
----

- Implementiert wird diese Technik mit Klassenbibliotheken, wie beispielsweise:
   - Entity Framework für .NET-Programmiersprachen
   - **Hibernate** für die Programmiersprache Java
   - **Doctrine** für PHP
   - **SQLAlchemie** für Python
   - **ActiveRecord** für Ruby on Rails
   - Für Java gibt es auch eine standardisierte Schnittstelle, die Java Persistence API (**JPA**).
- Objektorientierte Programmiersprachen (OOP) kapseln Daten und Verhalten in Objekten.
- Relationale Datenbanken legen Daten in Tabellen ab
- Die beiden Paradigmen sind grundlegend verschieden. 
- So kapseln Objekte ihren Zustand und ihr Verhalten hinter einer Schnittstelle und haben eine eindeutige Identität. 
- Relationale Datenbanken basieren dagegen auf dem mathematischen Konzept der relationalen Algebra. Dieser konzeptionelle Widerspruch wurde in den 1990er Jahren als “object-relational impedance mismatch“ bekannt.

ORM Einführung - Prinzip
----

- Um den Widerspruch zu mildern, wurden verschiedene Lösungen vorgeschlagen
   - Objektorientierte Datenbanken
   - Erweiterung von Programmiersprachen um relationale Konzepte (z. B. Embedded SQL). 
- Vorteile der direkten objektrelationale Abbildung von Objekten auf Relationen
   - Programmiersprache muss nicht erweitert werden.
   - Relationale Datenbanken sind als etablierte Technik in allen Umgebungen als ausgereifte Software verfügbar. 
- Nachteil dieses dem OOP-Paradigma entgegenkommenden Ansatzes
   - Nicht-Ausnutzen der Stärken und Fähigkeiten einer relationalen Datenbank, was sich in nicht optimaler Leistung niederschlägt.

ORM Einführung - Embedded SQL
----

- ESQL Statements werden in die Abfolge der regulären Statements der Programmiersprache (= Hostsprache) eingefügt.
- Syntax
```SQL
EXEC SQL <sql-statement> <terminator> für Nicht-Java 
#sql { <sql-statement> }; für Java
```
- COBOL
```COBOL
EXEC SQL <sql-statement> END-EXEC.
```
- C++
```C++
EXEC SQL <sql-statement>;
```

Bsp.:
```
EXEC SQL 
SELECT vorname, nachname 
  INTO :vorname :i_vorname, :nachname i_nachname 
  FROM mitarbeitertabelle 
 WHERE pnr = :pnr
;
```

ORM Einführung – Grundlegende Techniken
----

- Im einfachsten Fall werden Klassen auf Tabellen abgebildet.
   - Jedes Objekt (Entität) entspricht einer Tabellenzeile (Tupel)
   - Jedes Attribut entspricht eine Tabellenspalte. 
   - Identität eines Objekts wird durch den Primärschlüssel der Tabelle definiert.
   - Objekt Referenz auf ein anderes Objekt wird durch Fremdschlüssel-Primärschlüssel-Beziehung in der Datenbank dargestellt.
- Shadow Information („Schatteninformation“) 
   - Zusätzliche Daten die ein Objekt benötigt um persistent abgelegt zu werden.
      - Primärschlüssel (Surrogatschlüssel ohne fachliche Bedeutung) 
      - Hilfsdaten für die Zugriffssteuerung (Timestamps).

ORM Abbildung von Vererbungshierarchien
----
- Es gibt im Wesentlichen drei verschiedene Verfahren, um Vererbungshierarchien auf Datenbanktabellen abzubilden. 
- Einige Frameworks bieten weitere Variationen und Vermischungen dieser drei Grundverfahren.

###### ORM Single Table

- Tabelle pro Vererbungshierarchie (Single Table)
   - Bei diesem Verfahren werden alle Attribute der Basisklasse und aller davon abgeleiteten Klassen in einer gemeinsamen Tabelle gespeichert. 
   - Zusätzlich wird ein sogenannter „Diskriminator“ in einer weiteren Spalte abgelegt, der festlegt, welcher Klasse das in dieser Zeile gespeicherte Objekt angehört. 
   - Attribute von abgeleiteten Klassen dürfen bei diesem Ansatz aber in den meisten Fällen nicht mit einem NOT-NULL-Constraint versehen werden. 
   - Außerdem können Beschränkungen der Anzahl erlaubter Spalten pro Tabelle diesen Ansatz bei großen Klassen bzw. Klassenhierarchien vereiteln.

###### ORM Tabelle pro Unterklasse (Class Table)

- Joined oder Class Table
- Bei diesem Verfahren wird eine Tabelle für die Basisklasse angelegt und für jede davon abgeleitete Unterklasse eine weitere Tabelle.
- Ein Diskriminator wird nicht benötigt, weil die Klasse eines Objekts durch eine 1-zu-1-Beziehung zwischen dem Eintrag in der Tabelle der Basisklasse und einem Eintrag in einer der Tabellen der abgeleiteten Klassen festgelegt ist.

###### ORM Concrete Table

- Tabelle pro konkrete Klasse (Table per Class oder Concrete Table) 
- Hier werden die Attribute der abstrakten Basisklasse in die Tabellen für die konkreten Unterklassen mit aufgenommen.
- Die Tabelle für die Basisklasse entfällt. Der Nachteil dieses Ansatzes besteht darin, dass es nicht möglich ist, mit einer Abfrage Instanzen verschiedener Klassen zu ermitteln.

###### ORM General Tables

- Ein weiteres Verfahren ist die Abbildung von Strukturen (Beziehungen, Vererbung) und Daten in generellen Tabellen General Tables.
- Dabei enthält die gesamte Datenbank genau 5 Tabellen.
- Eine für Klassen, eine für Beziehungen (einschließlich Vererbungsbeziehungen), eine für Attribute, eine für Instanzen (der Klassen) und eine für Werte (der Attribute).
- Dieses Verfahren hat in der Praxis kaum Bedeutung.

---

http://www.agiledata.org/essays/mappingObjects.html#MapToGenericStructure

---