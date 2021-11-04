ORM  - JPA - Zusammengesetzte Schlüssel
====

JPA Zusammengesetzte Schlüssel
----

- Unter einem **zusammengesetzten Schlüssel** versteht man einen aus **mindestens zwei Properties** bestehenden Schlüssel
- JPA-Spezifikation sieht zwei alternative Möglichkeiten zur Realisierung zusammengesetzter Schlüssel vor.
   - ``@IdClass``
   - ``@EmbeddedId``
- Weitere Möglichkeit
   - ``@Embeddable``
- Allen drei Alternativen gemein ist, daß der **zusammengesetzte Schlüssel** in einer eigenen Klasse definiert wird.
- Beispiel: Zusätzlich zur **Klasse ``Kunde``** wird noch eine **Klasse ``KundeId``** als Primärschlüsselklasse definiert.
- Diese muss serialisierbar sein, einen Default-Konstruktor besitzen und die Methoden ``equals()`` und ``hashCode()`` definieren.

JPA Zusammengesetzte Schlüssel ``@IdClass``
----

Listing 2.1 Realisierung mit ``@IdClass``
```JAVA
public class KundeId implements Serializable {
	private String Abteilung;
	private int Nummer;

	public KundeId() {
	}

	public KundeId( String Abteilung, int Nummer) {
		this.Abteilung = Abteilung;
		this.Nummer = Nummer;
	}
	.. ..
```

Listing 2.2 ``Kunde`` mit ``@IdClass`` annotiert
```JAVA
@Entity
@IdClass(KundeId.class)
public class Kunde {
	@Id private String Abteilung;
	@Id private int Nummer;

	private String Vorname;
	private String Nachname;

	public Kunde() {
	}
. . .
```

Listing 2.2
   - Man erkennt in Zeile 2 die ``@IdClass`` Annotation mit der in Listing 2.1 definierten Primärschlüsselklasse als Wert des Attributs.
   - Das die Schlüsselklasse verwendende Entity muss Properties mit identischem Typ und Namen besitzen.
   - Diese Properties des Schlüssels werden mit ``@Id`` annotiert.
   - Sollen die Properties vom Default abweichende Eigenschaften besitzen, so sind diese in der Entity-Klasse und nicht in der Primärschlüsselklasse anzugeben. 
```JAVA
@Entity
@IdClass (KundeId class)
public class Kunde {
	@Id @Column (length = 5)
	private String Abteilung;
	. . .
```
   
- Die Verwendung des Entities erfolgt ganz intuitiv. Die Properties werden wie gewohnt verwendet.
- Auch das Persistieren erfolgt ohne Änderung, wie im folgenden Beispiel.
```JAVA
Kunde NewKunde = new Kunde ("IBM", 123, "Willi", "Muster");
em.persist(NewKunde);
```
- Lediglich bei der ``find()``-Methode ist die Schlüsselklasse zu verwenden.
```JAVA
Kunde NewKunde = em.find(Kunde.class, new KundeId( ("IBM", 123));
```

JPA Zusammengesetzte Schlüssel ``@EmbeddedId``
----

- ``@EmbeddedId``-Annotation zur Kennzeichnung des Schlüsselproperties.
- Das Schlüsselproperty des Entity ist bei dieser Alternative vom Typ der Schlüsselklasse.
- Einzubettende Klassen müssen generell mit ``@Embeddable`` annotiert werden.
```JAVA
@Embeddable
public class KundeId implements Serializable {
	...
```
- Realisierung mit ``@EmbeddedId``
```JAVA
@Entity
public class Kunde {
	@EmbeddedId 
	private KundeId Id;
	private String Vorname;
	private String Nachname;

	public Kunde() {
	}
. . .
```

JPA Zusammengesetzte Schlüssel ``@Embeddable``
----

- Die dritte und letzte Alternative zur Realisierung zusammengesetzter Schlüssel ist in der JPA Spezifikation nicht explizit als solche genannt.
> „The Embeddable annotation is used to specify a class whose instances are stored as an intrinsic part of an owning entity and share the identity of the entity.“
- Die ``@Embeddable``-Annotation haben wir bereits verwendet, um die so annotierte Klasse durch die Verwendung von ``@EmbeddedId`` in der Entity-Klasse als Primärschlüssel zu verwenden.
- Wenn man statt ``@EmbeddedId`` nun ``@Id`` verwendet, erhält man den Standardfall der Verwendung einer Klasse als persistenten Property-Typ und reduziert den open genannten Fall einer gemeinsamen Identität auf die alleinige Identität durch genau dieses Property.
```JAVA
@Entity
public class Kunde {
	@Id private KundeId Id;
	private String Vorname;
	private String Nachname;

	public Kunde() {
	}
. . .
```
- Als Klasse zur Repräsentation des zusammengesetzten Schlüssels verwenden wir weiterhin die Klasse ``KundeId``.
- Die Klasse kann nun mit ``@Embeddable`` annotiert werden oder nicht. Falls man die Klasse nicht annotiert, wird sie als gewöhnlicher, benutzerdefinierter serialisierbarer Typ verwendet.
- Falls man sie mit ``@Embeddable`` annotiert, aber in der ``Entity``-Klasse mit ``@Id`` und nicht mit ``@EmbeddedId`` verwendet, definiert die Spezifikation kein explizites Mapping. Verhalten ist daher providerspezifisch.
