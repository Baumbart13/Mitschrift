ORM - JPA - POJO-Mapping
====

POJO – Mapping \ Definition
----

- „lightweight persistent domain object“
   - Damit ist ein einfaches Java-Objekt gemeint
   - Welches als POJO bezeichnet wird
- POJO (Plain Old Java Object)
   - Objekt einer einfachen, flachen, nicht komplexen Java Klasse.

Plain Old Java Object
----

- Gemeint ist damit eigentlich nichts anderes als das, was alle Entwickler am Anfang der Java-basierten Softwareentwicklung für gewöhnlich implementiert haben: 
- Einfach aufgebaute Java-Klassen, die nicht durch infrastrukturellen Code verwässert sind, sondern nur die fachliche Logik implementieren.
- Unter einem POJO wird ein Objekt verstanden, das von keiner bestimmten Klasse erben und kein bestimmtes Interface implementieren muss.
- Damit werden auch keine Callback- Methoden vorausgesetzt. Für die Objektattribute gilt der erweiterte Begriff eines Property, in Anlehnung an die Java-Beans-Spezifikation.
- Ein Property ist die Gesamtheit eines Objektattributs mit je einem Getter und Setter, die nach dem üblichen Namensschema gebildet wer- den. Attribute haben meist die Sichtbarkeit oder , Getter- und Setter- Methoden.
- Zusätzlich besitzt das POJO einen Default-Konstruktor, also einen Konstruktor ohne Parameter. 

POJO – Mapping \ Definition
----

- Nicht alle Java-Konstrukte sind in JPA erlaubt. 
- JPA verlangt von Entities einige zusätzliche Eigenschaften, schränkt also die Menge persistierbarer POJOs ein.
- Was ist erlaubt
   - Generell müssen Entities Klassen sein
   - Interfaces und Enums sind nicht erlaubt.
   - Die Entity Klasse sowie ihre Methoden und persistenten Instanzvariablen dürfen nicht als final deklariert sein.
- Als Datentypen sind folgende Typen erlaubt:
   - Primitive Datentypen und Strings
   - Serialiserbare Datentypen, einschließlich Wrapper der primitiven Datentypen
   - BigInteger, BigDecimal (java.math)
   - Date, Time, Timestamp (java.sql)
   - byte[], char[], ..
   - Enums
   - Entity-Typen und Collections von Entity-Typen
   - Eingebettete Klassen
   - Collections von einfachen Typen und eingebetteten Klassen

POJO - Mapping auf Entity-Ebene
----

- Für JPA reicht die Angabe der @Entity und @Id Annotation um aus einem normalen Java Objekt ein persistentes Java-Objekt zu machen.
- Das funktioniert aber nur wenn JPA eine Reihe von Default-Einstellungen als gesetzt annimmt.
   - String Property wird auf VARCHAR abgebildet
   - Das alle Properties einer Klasse persistent sein sollen
- Ausnahmen von diesen Default Einstellungen müssen explizit angegeben werden.
- Java und SQL haben verschiedene Regeln zur Bildung von Bezeichnern.
- Dazu kommen firmeninterne Konventionen welche die Einhaltung bestimmter Regeln fordern.
- Mit dem name-Attribute der @Table Annotation kann der Tabellenname abweichend vom Klassennamen gewählt werden.

```JAVA
@Entity
@Table(name = "HV_KUNDE"
      ,uniqueContraints = {@UniqueConstraint {"vorname"
	                                         ,"nachname" })}
	   }
public class Kunde{
..
```

POJO – Serialisierbarkeit von Entities
----

- Serialisierbare Entities besitzen eine Reihe von Vorteilen:
   - Bis Java EE 1.4 Data Transfer Objects (DTO)
   - Umwandlung eines Java Objekts in einen Byte-Stream
   - Übertragung zwischen einzelnen Schichten einer Java-EE Anwendung
   - RMI (Remote Method Invocation)
   
```JAVA
@Entity
public class Kunde implements Serializable{
..
```

POJO – JPA Zugriff auf Entity-Properties
----

- Unterscheidung beim Zugriff auf die Daten eines durch den JPA-Provider und dem Anwendungsprogramm. 
- Der JPA- Provider benötigt den Zugriff, um Daten in die Datenbank schreiben zu können.
- Analog benötigt er den Zugriff, um nach dem Lesen aus der Datenbank die Daten des Entity setzen zu können. 

POJO – JPA Zugriff auf Entity-Properties
----

- Position der @Id Annotation legt Field- oder Property-Access fest
   - @Id Annotation vor der Instanzvariablen -> FIELD-ACCESS
   - @Id Annotation vor dem Getter -> PROPERTY-ACCESS
   
```JAVA
@Entity
public class Kunde {
    @Id
	private Integer Id;
.. ..
```

```JAVA
@Entity
public class Kunde {
	private Integer Id;
	@Id
	public Integer getId() {
	    return Id;
    }
	public void setId (Integer Id) {
	    this.Id = Id;
	}
.. ..
```
   
POJO – JPA Zugriff auf Entity-Properties
----

- JPA 2.0 führt die Annotation @Access ein, deren einziges Attribut **value** über die Werte FIELD und PROPERTY der Enumeration AccessType die Zugriffsart definiert.

| Attribut | Typ | Default | Beschreibung |
|:--- |:--- |:--- |:--- |
| value * | AccessType | - | Zugriffsart für Entity pder Property (FIELD, PROPERTY) |

* Mussfeld

- Folgendes Beispiel definiert die generelle Zugriffsart Field-Access
- Für das Property Vorname erfolgt der Zugriff durch den JPA Provider durch das Getter/Setter-Paar.

```JAVA
@Entity
@Access(AccessType.FIELD)
public class KundeAccess {
	@Id @GeneratedValue
	private Integer ID;
	private String Vorname;
	private String Nachname;
	
	@Access(AccessType.PROPERTY)
	public String getVorname() {
		return thisVorname;
	}
	public void setVorname(String Vorname) {
		this.Vorname = Vorname;
	}
.. ..
```

- Mapping Optionen auf Property-Ebene
- Eine Reihe von Annotationen erlaubt die Anpassung des Mapping auf Property Ebene.
- @Transient Annotation verhindert, dass ein Property persistent ist.

```JAVA
@Entity
public class KundeTransient {
	@Id
	private Integer Id;
.. ..
```

```JAVA
@Entity
public class KundeTransient {
	private Integer Id;
	private String Vorname;
	private String Nachname;
	public KundeTransient() {}
	
	@Id
	public Integer getId() { return this.Id; }
	public void setId(Integer Id) { this.Id = Id; }
	
	public String getVorname() { return this.Vorname; }
	public void setVorname(String Vorname) { this.Vorname = Vorname; }
	
	public String getNachname() { return this.Nachname; }
	public void setNachname(String Nachname) { this.Nachname = Nachname; }
	
	@Transient
	public String getName() {
		return Vorname + " " + Nachname;
	}
	public void setName(String Name) {
		String [] Namen = Name.split(" ");
		this.Vorname = Namen[0];
		this.Nachname = Namen[1];
	}
}
```

- Beispiel **``class KundeTransient``**
- Ohne ``@Transient`` Annotation geht JPA von folgenden Properties aus:

<table>
	<tr>
	<td>id, </td>
	<td>vorname, </td>
	<td>nachname, </td>
	<td>name</td>
	</tr>
</table>

- Das würde zu redundanten Daten führen.

POJO – @Column-Annotation
----

- Die ``@Column``-Annotation beschreibt wie ein einzelnes Property auf eine Tabellenspalte abgebildet wird.

| Attribut | Typ | Default | Beschreibung |
|:--- |:--- |:--- |:--- |
| name | String | Propertyname | Spaltenname |
| unique | boolean | False | Unique-Constraint auf Spalte |
| nullable | boolean | True | NULL-Werte zugelassen |
| insertable | boolean | True | Splate in Insert-Anweisung enthalten |
| updateable | boolean | True | Spalte in Update-Anweisung enthalten |
| columnDefinition | String | "" | DDL-Anteil für Spaltendefinition |
| table | String | Primäre Tabelle | Tabelle der Spalte, dalls das Entity auf mehrere Tabellen aufgeteilt wird. |
| length | int | 255 | Maximale Länge der Zeichenkette |
| precision | int | 0 | Anzahl Ziffern zur Darstellung |
| scale | int | 0 | Anzahl Nachkommastellen |

- Beispiel Kundendaten mit Eintrittsdatum und Kontostand

```JAVA
public class Kunde {
	private String Vorname;
	private String Nachname;
	private Date Eintritt;
	private BigDecimal Kontostand;
```

- Vorname mit @Column-Attributen

```JAVA
@Column (name = "KD_NAME", nullable = false, length = 30, unique = true)
private String Vorname;
```

- Mit dem Attribute columnDefinition kann der DDL-Code zur Definition der Spalte angegeben werden.
- Beispiel: String Property als ``CHARACTER(30) not nullable``

```JAVA
@Column (columnDefinition = "CHARACTER(30) NOT NULL")
private String Nachname;
```

- Für das Eintrittsdatum soll das Datum am Datenbank Server verwendet werden.

```JAVA
@Temporal(TemporalType.DATE)
@Column (columnDefinition = "DATE DEFAULT CURRENT_DATE", insertable = false, updateable = false )
private Date Eintritt;
```

- Beim Insert wird das Datum automatisch mit dem Server Datum erzeugt. Ein expliziter Insert und Update des Datums darf nicht erfolgen.
- Der Kontostand wird ebenfalls mit einer @Column Annotation versehen.

```JAVA
@Column (precision = 7, scale = 2)
private BigDecimal Kontostand;
```

- Dadurch wird JPA angewiesen insgesamt 7 Ziffern, davon 2 Nachkommastellen zur Repräsentation der Zahl zu verwenden.
- Unterschiede der einzelnen JPA Implementierungen sind zu beachten.
