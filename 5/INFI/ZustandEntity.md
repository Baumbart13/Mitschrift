ORM - JPA - Zustand eines Entity
====

Zustand eines Entity
----

- Üblicherweise versteht man unter dem Zustand eines Objekts die aktuellen Werte der Property Menge.
- JPA kennt folgende Zustände aus Sicht des Entity-Managers:
   - **Transiente Objekte** (transient object)
      - Wurden noch nicht dem Entity-Manager übergeben
      - Es existiert noch kein Eintrag in der Datenbank 
   - **Verwaltete Objekte** (managed object)
      - Sind unter Kontrolle des Entity-Managers und in der Datenbank persistent
   - **Losgelöste Objekte** (detached object)
      - Sind nicht an einen Entity-Manager gebunden wurden aber bereits persistiert
   - **Gelöschte Objekte** (removed object)
      - Zum löschen vorgemerkte Entities.
- Alle persistenten Objekte einer JPA-Anwendung werden durch sogenannte Entity-Manager verwaltet.
- Die von einem Entity-Manager verwalteten Objekte werden als Persistenzkontext (Persistence Context ) bezeichnet. 
- Der Entity-Manager stellt sicher, dass die Primärschlüssel innerhalb eines Persistenzkontextes eindeutig sind, dass also ein Entity in einem Persistenzkontext nur einmal existiert. 
- Man spricht auch von anwendungsverwalteten und container-verwalteten Entity- Managern.
- Die Zustände, die ein Entity bezüglich der Verwaltung durch einen Entity- Manager annehmen kann, sind jedoch in Java-SE und Java-EE identisch.

Persistence Provider
----

- Die Java Persistence API (JPA) als API (Application Interface) definiert lediglich eine Schnittstelle und stellt keine Implementierung zur Verfügung.
- Die konkrete Implementierung stellt der **Persistence Provider** zur Verfügung (EclipseLink, OpenJPA, Hibernate, ..)
- Unterschiedliche Verwendung des Persistence Providers im Java EE und Java SE Umfeld.
![PersistenceProvider001.png](./images/PersistanceProvider001.png)

Entity Manager
----

- Stellt alle Dienste im Zusammenhang mit der Objekt-Persistence zur Verfügung, wie das Laden, Speichern, Aktualisierung und Suchen von Persistent Entities
- Zentrale Aufgaben des Entity Manager
   - Das dauerhafte Speichern einer Persistent Entity.
   - Das zusammenführen des Objektzustands einer Persistent Entity mit dem in der Datenbank gespeicherten Zustand (merge).
   - Das Löschen einer Persistent Entity aus der Datenbank (remove).
   - Das Suchen einer Persistent Entity anhand des Primärschlüssels (find) bzw. über JPQL-Abfragen (querry).
- Zentrale Aufgaben des Entity Manager
   - Das Sperren einer Persistent Entity (lock).
   - Das Synchronisieren des gesamten Persistenzkontexts mit der Datenbank (flush).
   - Das Schließen des Entity-Manager (close) 
	
Zustand eines Entity (Java SE-Anwendung)
----

![ZustandEntity001.png](./images/ZustandEntity001.png)
- Java SE Anwendungen haben eine main() Methode um den Client Code aufzurufen.
- Hier wird das JPA Framework initialisiert um die Datenbank Operationen ausführen zu können.

```JAVA
EntityManagerFactory emf = Persistance.CreateEntityManagerFactory(Bank);
EntityManager em = emf.CreateEntityManager();
// work with the persistence kontext
// persist, find, ..
em.close()
emf.close();
```

- Speichern von Entities

em.getTransaction().begin();
Kunde NewKunde = new Kunde();
em.persist(NewKunde);

Kunde ist nun im Persistenzkontext vorhanden aber noch nicht in der Datenbank. Erst am Ende der Transaktion wird mit commit() mit der Datenbank synchronisiert.
em.getTransaction().committ();

Die Methode flush() synchronsiert den kompletten Kontext mit der Datenbank programmatisch.
em.flush();

Zustand eines Entity (Java SE-Anwendung)
Laden von Entities
Kunde NewKunde = em.find(Kunde.class, 66);

Die find() Methode sucht zuerst im Persistenzkontext nach dem entsprechenden Entity. Falls es vorhanden ist wird dieses Objekt zurückgegeben. Nur wenn sich das Objekt nicht im Persistenzkontext befindet, wird eine SELECT-Anweisung an die Datenbank geschickt. 

Daher wiederholte find() – Aufrufe mit dem selben Primärschlüssel führen nur zu einem SELECT.

Der Persistenzkontext agiert daher als JPAs First-Level-Cache.

Zustand eines Entity (Java SE-Anwendung)
Aktualisieren von Entities
Entities werden im Persistenzkontext überwacht, der Entity-Manager ist dafür verantwortlich Änderungen mit der Datenbank zu synchronisieren.

em.getTransaction().begin();
Kunde NewKunde = em.find(Kunde.class, 66);
NewKunde.setNachname(„Mustermann“);
em.getTransaction().commit();

Obwohl nur die find()-Methode aufgerufen wurde, wird vor dem Ende der Transaktion eine UPDATE-Anweisung an die Datenbank abgesetzt, um dem den Nachnamen zu aktualisieren.