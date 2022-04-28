1 Datenmodellierung und Datendefinition in relationalen Datenbanken
===================================================================

- UML-Diagramm muss irgendeine Art möglich zu sein
    - muss nicht Krähenfußnotation sein, kann aber
    - bei einer Art einfach bleiben und möglichst nicht vermischen
    - ER-Modell wird eigentlich nicht verwendet
        - Muss aber für die Basics beigebracht werden
        - Ist unübersichtlicher als UML-Diagramm
    - Vererbung soll abbildbar sein
        - Möglichkeiten
            1. Eine große Tabelle, die alle Einzeldaten der vererbten Klassen beinhaltet
                - Viel Speicherverbrauch
                - Viel ungenutzter Speicher
                - Einfache Abfragen
                - Einfache Erstellung
                - Einfache Erweiterbarkeit
            2. Eine Stammtabelle mit mehreren Teiltabellen für vererbte Klassen mit Verweis auf die Stammklasse(n)
                - Gut für speicher
                - Abfragen werden kompliziert
            3. 
- Normalformen
    - Die ersten 3 Normalformen
        1. Alles muss atomar / einzeln sein
            - + Wegfall mehrwertiger Attribute
            - - gleiche Nachteile wie bei unnormalisierter Relation (Anomalien, etc)
        2. Es darf ein Datensatz nur zu **1** Primärschlüssel abhängig sein
            - Falsch:

                | Rechnungsnummer | Artikelnummer | Artikelname | Anzahl |
                |----------------:|--------------:|:------------|-------:|
                |               1 |          4711 | Colt        |      2 |
                |               1 |          4712 | Winchester  |      3 |
                |               1 |          4713 | Whiskey     |      5 |
                |               2 |          4712 | Winchester  |     10 |

            - <details><summary>Richtig:</summary>

                | Rechnungsnummer | Artikelnummer | Anzahl |
                |----------------:|--------------:|-------:|
                |               1 |          4711 |      2 |
                |               1 |          4712 |      3 |
                |               1 |          4713 |      5 |
                |               2 |          4712 |     10 |

                | Artikelnummer | Artikelbezeichnung |
                |--------------:|:-------------------|
                |          4711 | Colt               |
                |          4712 | Winchester         |
                |          4713 | Whiskey            |

                </details>

        3. Sind Abhängigkeiten unter den Nicht-Primärschlüssel?
    - Es gibt Datenbanken, wo es sinnvoll ist keine Normalformen einzuhalten
        - Bspw. Archive, in denen die Daten einmal eingespielt werden und dann nur noch ausgelesen werden


2 Umgang mit Datenbanksystem und Datenbankabfragen mit SQL
==========================================================

- Views
    - Inline-View
- Subselects
    - Bsp.:
        - "Anzahl der Mitarbeiter, deren Gehalt über dem Durchschnitt aller Gehälter liegt"
        - ```MYSQL
            # Bsp-Aufgabe Nr 5
            # Select für durchschnittliches Gehalt
            SELECT AVG(salary)
            FROM salaries
            WHERE YEAR(to_date) = 9999;
            # Select für die Aufgabe selbst
            SELECT COUNT(*)
            FROM salaries
            WHERE YEAR(to_date) = 9999 AND
            salary > SELECT AVG(salary)
                FROM salaries
                WHERE YEAR(to_date) = 9999;
            ```
- Joins
    - Bsp.:
        - "Anzahl der Mitarbeiter, deren Gehalt über dem Durchschnitt aller Gehälter liegt"
        - ```MYSQL
            # Bsp-Aufgabe Nr 6
            SELECT e.last_name, d.dept_name, s.salary
            FROM employees e, dept_manager dm, departments d, salaries s
            WHERE e.emp_no = dm.emp_no
            AND dm.dept_no = d.dept_no
            AND YEAR(dm.to_date) = 9999
            AND s.emp_no = e.emp_no;
            ```
        - ```MYSQL
            # Bsp-Aufgabe Nr 6
            SELECT e.last_name, d.dept_name, s.salary
            FROM employees e
                INNER JOIN dept_manager dm
                    ON dm.emp_no=e.emp_no
                INNER JOIN departments d
                    ON dm.dept_no=d.dept_no
                INNER JOIN salaries s
                    ON s.emp_no=e.emp_no
            WHERE YEAR(dm.to_date) = 9999;
            ```
```MYSQL
# Durchschnittliche Gehaltsschritte pro Abteilung
SELECT AVG(ds.steps)
FROM
    (SELECT de.dept_no, st.steps # Gehaltsschritte pro Abteilung pro Mitarbeiter
    FROM dept_em de,
            (SELECT emp_no, COUNT(*) as steps FROM salaries GROUP BY emp_no) st # Gehaltsschritte pro Mitarbeiter
    WHERE de.emp_no=st.emp_no) ds
GROUP BY ds.dept_no;
```