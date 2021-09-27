ORM - JPA
====

ORM Mapping
----

- Dieses Kapitel beschreibt, wie Objekte auf Tabellen abgebildet werden.
- Definition:
   - Ein persistentes Objekt wird Entity genannt.
   - Beschreibung aus der JPA- Spezifikation 
   > „An entity is a lightweight persistent domain object.“ 
      - Damit ist ein einfaches Java-Objekt gemeint
      - Siehe auch: https://docs.oracle.com/cd/E19798-01/821-1841/bnbqa/index.html

Primärschlüssel versus Objektidentität
----

- Java unterscheidet zwischen Werten (primitive Typen) und Objekten (Referenztypen)
   - Test auf Identität bei Werten als auch bei Objektreferenzen mittels Gleichheitsoperator == (Identitätsoperator)
   - Bei Werten (primitive Typen wie int, char, ..)
      - Vergleich beider Werte
- Java unterscheidet zwischen Werten (primitive Typen) und Objekten (Referenztypen)
   - Bei Objekten (Referenztypen)
      - Vergleich ob beide Referenzen auf das gleiche Objekt verweisen
   - Um die Gleichheit von Objekten in Java zu testen, gibt es die equals- Methode
      - Die equals-Methode verlangt die Implementierung der hashCode()-Methode um die Gleichheit ein oder mehrere Properties zweier Objekte zu ermitteln.
- Ein persistentes Objekt repräsentiert,
   - Eine bestimmte Zeile einer Datenbanktabelle.
   - Diese wird durch einen Primärschlüssel identifiziert.
- Die Datenbankidentität ist ein Realisierungsdetail der Objektpersistenz.
   - Sie ist daher einerseits im Anwendungsmodell nicht enthalten, muss aber andererseits immer im Mapping verwendet werden. 
- In JPA gibt es mehrere Alternativen den Primärschlüssel zu erstellen.
   - Er kann von der Anwendung erzeugt werden.
   - Von der Persistenzschicht in Zusammenarbeit mit dem Datenbanksystem erzeugt werden.
- Nachfolgend dargestellte Klasse Kunde realisiert die Alternative des anwendungserzeugten Primärschlüssels.

```Java
@Entity // Annotation @Entity macht aus der Java Klasse ein persistentes Entity
public class Kunde {

    @Id
	private String Id; // Die Instanzvariable ist mit @Id annotiert und wird von JPA als Primärschlüssel verwendet.
	private String Vorname;
	private String Nachname;
	
	public Kunde() {}
	
	// Getter und Setter
}
```

- Ohne weiter Annotationen muss die Anwendung dafür sorgen, dass das Entity vor dem Persistieren mit einem gültigen, noch nicht vergebenen Primärschlüssel versorgt wird.
```Java
public Kunde() {
    this.Id = UUID.randomUUID().toString();
}

public Kunde(String Vorname, String Nachna,e){
    this();
	this.Vorname = Vorname;
	this.Nachname = Nachname:
}
```

- Die zentrale Einheit zur Verwaltung von Entities ist die Klasse EntityManager.
```Java
Entity-Manger em = ..
Kunde NeuerKunde = new Kunde("Max", "Mustermann");
em.getTransaction().begin();
em.persist(NeuerKunde);
..
..
NeuerKunde = em.find(Kunde.class, <primaerschluessel>);
em.getTransaction().commit();
}
```

- Operationen des Entity-Managers, die zu Aktionen in der Datenbank führen sollen, müssen in einem Transaktionskontext ausgeführt werden.
```Java
em.getTransaction().begin();
..
..
em.getTransaction().commit();
```

- JPA stellt mehrere Alternativen zur Generierung von Primärschlüsseln zu Verfügung. 
```Java
@Entity
public class Kunde {
    @Id
	@GenerateValue // Annotation @GeneratedValue zusätzlich zur @Id-Annotation
	private String Id;
	private String Vorname;
	private String Nachname;
	
	public Kunde() {} // Damit ist kein Zwang eines anwendungserzeugten 
}
```

- JPA sieht vier alternative Generatoren vor:
   - AUTO
      - Überlässt der JPA Implementierung die Wahl des Verfahrens. 
   - IDENTITY
      - Verwendet die Datenbankfunktionalität einer selbstinkrementierenden Spalte.
      - Z.B.: AUTO_INCREMENT bei MySQL
   - TABLE
      - Verwendet eine zusätzliche Tabelle zur Verwaltung des zuletzt generierten Primärschlüssels.
   - SEQUENCE
      - Verwendet die Datenbankfunktionalität einer Sequence. (z.B: Oracle, DB2,..)
- Die vier genannten Generatoren sind die Werte der Enum GenerationType, die als Werte des Attributes strategy der Annotation @GeneratedValue verwendet werden. 
- AUTO ist Default.
- Achtung: Abhängigkeit zum Datenbanksystem

```Java
@Id
@GeneratedValue(strateegy = GenerationType.AUTO);
private String Id
..
```

- Sequence Generatoren
   - Falls die Schema Generierung gewählt wird, so wird auch die Sequence erzeugt.
   - Die Sequence ist global und wird nur einmal generiert und bei jeder weiteren Klasse verwendet.
   
   ```Java
   @Id
   @GeneratedValue(strateegy = GenerationType.SEQUENCE);
   private String Id
   ..
   ```

- Um einen bestimmten Sequence Generator zu verwenden, dient die Annotation @SequenceGenerator mit folgenden Attributen:

| Attribut        | Typ    | Default             | Beschreibung                                  |
|:--------------- |:------ |:------------------- |:--------------------------------------------- |
| name {Mussfeld} | String | Generatorname       | Eindeutiger Name des Sequence Generators      |
| sequenceName    | String | Provider spezifisch | Name der Datenbank Sequence                   |
| allocationSize  | int    | 50                  | Increment Wertevorrat der Sequence beim Alloc |
| initalValue     | int    | 1                   | Anfangswert der Sequence                      |
| catalog         | String | Default Katalog     | Katalog der Sequence                          |
| schema          | String | Default Schema      | Schema der Sequence                           |

Beispiel eines Sequence-Generator

```Java
@Id
@GeneratedValue(generator = "MySeg"
               ,strategy = GenerationType.SEQUENCE);
@SequenceGenerator(name = "MySeg", sequenceName = "MY_SEQ"
                  ,allocationSize = 100, initalValue = 1)
private String Id
..
```

Table Generatoren
----

- Mit Hilfe von Table Generatoren kann der JPA Provider die Generierung von Primärschlüsseln auch ohne die Datenbankfunktionalität von Identitätspalten oder Sequences garantieren.
- Wird der Table-Generator nicht explizit genannt, wird ein Default-Generator verwendet.

```Java
@Id
@GeneratedValue(strategy = GenerationType.Table);
private String Id;
..
```

- Soll eine spezielle Tabelle verwendet werden, so ist diese über die Annotation @TableGenerator anzugeben. 

```Java
@Id
@GeneratedValue(strategy = GenerationType.Table
               ,generator = "kundeGenerator")
@TableGenerator(name = "kundeGenerator"
               ,table = "ID_GEN"
			   ,pkColumnName = "GEN_KEY"
			   ,valueColumnName = "GEN_VALUE"
			   ,pkColumnValue = "KUNDE_ID"
			   ,allocationSize = 10)
private String Id
..
```

Table Generatoren „Beispiel aus vorheriger Seite“
----

- Die @TableGenerator  Annotation definiert einen Tabellen-Generator namens kundeGenerator.
- Dieser ist global für die Persistenzeinheit und wird im Beispiel im generator-Attribute der @GeneratedValue-Annotation referenziert.
- Die Tabelle heist ID_GEN und besitzt die beiden Spalten GEN_KEY und GEN_VALUE.
- ID_GEN ist der Primärschlüssel der Tabelle.
- Die Tabelle wird als Generator für mehrere Entities verwendet, für die Entität Kunde wird daher der Primärschlüsselwert KUNDE_ID als String verwendet.
- JPA erhöht bei jeder Allokation durch den Entity-Manger den Wert um 10.

@TableGenerator-Attribute
----

| Attribut         | Typ              | Default             | Beschreibung |
|:---------------- |:---------------- |:------------------- |:------------ |
| name {Mussfeld}  | String           | Generatorname       | Eindeutiger Name des Sequence Generators |
| allocationSize   | int              | 50                  | Increment Wertevorrat der Sequence beim Alloc |
| catalog          | String           | Default Katalog     | Katalog der Tabelle |
| initalValue      | int              | 1                   | Anfangswert der Sequence |
| pkColumnName     | String           | Provider spezifisch | Name der Spalte, mit der die Ids für das jeweilge Entity unterscheidet werden. |
| okColumnValue    | String           | Provider spezifisch | Wert, der einen Primärschlüssel von einem anderen Wert unterscheidet. Wird verwendet, wenn für verschiedene Entities eine Tabelle zum Speichern des Primärschlüssels genutzt wird. |
| schema           | String           | Default Schema      | Schema der Sequence |
| table            | String           | Provider spezifisch | Tabellenname |
| uniqueConstraint | UniqueConstraint | {}                  | Spaltenname(n) für Unique-Constraints |
| valueColumnName  | String           | Provider spezifisch | Name der Tabellenspalte, die den letzten generierten Wert je Entity aufnimmt |
