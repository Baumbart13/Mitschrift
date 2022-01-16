# INFI ERP Fifth school year (2021 - 2022)

----

#### **2. Test - 17. Januar 2022 - Stoff zum Teil geleakt am 06.12.2021**
   - Einkauf/Verkauf
   - Stammdaten von vorne bis hinten
      - Kunden/Lieferanten erstellen
      - Artikel erstellen
   - Zahlen
      - Zahlungsvorschlag
      - FiBu
      - evtl auf Kostenstellen aufteilen
   - Mahnen
      - Zahlungsvorschlag
      - FiBu
      - evtl auf Kostenstellen aufteilen

----

Cheat Sheet
-----------

<details>
<summary style="color:red">Artikel erstellen</summary>

1. **Artikel**
   1. **Basis**
      - Artikelname
      - Bezeichnung
      - Basiseinheit: ``Stk``
      - Verpackungen
         - 1 ``Pal``
         - 10 ``Stk.``
         - ``80000`` (Europalette)
   2. **Rechnungswesen**
      - Vorsteuer-Klassifikation: ``100``
      - Mehrsteuer-Klassifikation: ``100``
      - Aufwandskonto-Klassifikation: ``500-300`` (WEK Handelsware)
      - Bestandskonto-Klassifikation: ``400-300`` (Bestand Handelsware)
      - Erlöskonto-Klassifikation: ``400-300`` (Erlöse Handelsware)
      - Kostenarten-Klassifikation Beschaffung: ``300``
      - Kostenarten-Klassifikation Vertrieb: ``300``
      - Kostenarten-Klassifikation Produktion: ``300``
      - Kostenarten-Klassifikation Lagerlogistik: ``300``
      - Preis 1 - Pflichtfeld: beliebiger Geldbetrag
   3. **Beschaffung**
      - Klassifikation: ``300``
      - Standard-Lagerort: ``100``
      - Einheiten: ``Stk.``
   4. **Lagerlogistik**
      - Klassifikation: ``300``
      - Lademittel: ``80000`` (Europalette)
   5. **Disposition**
      - Mindestbestand
      - Meldebestand
      - Maximalbestand
      - Füllbestand
      - Bedarfsdeckung: ``Externe Beschaffung``
      - Beschaffungsdisponent: ``ADM_KEJ``
   6. **Vertrieb**
      - Klassifikation: ``300``
      - Standard-Lager: ``100``
      - Einheiten: ``Stk.``

</details>
<details><summary style="color:green">Lieferant erzeugen</summary>

1. **Partner**
   1. **Basis**
      - Name
      - Adresse
   2. **Rechnungswesen**
      - **Finanzbuchhaltungsdaten**
         - **Debitor**
            - [x] <u>D</u>ebitor
            - Ausgangssteuer-Klassifikation: ``500`` (Beschaffung Inland)
            - Zahlungsprofil: ``100`` (30 Tage Netto)
         - **Kreditor**:
            - [x] <u>K</u>reditor
            - Zahlungsbedingung: ``120`` (Sofort Netto)
            - Partnerkonto-Klassifikation: ``100`` (Inland)
            - Eingangssteuer-Klassifikation: ``500`` (Beschaffung Inland)
            - **Allgemeines**
               - Sammelkontenprofil: ``200`` (Verbindlichkeiten Inland)
            - **Zahlung**
               - Abzugsprofil: ``100`` (Standard Abzugsprofil)
            - **Mahnung**
               - Mahnprofil: ``100`` (Standard Mahnprofil)
      - **Bankverbindungen**
         - Land: ``DE``
         - Bank: Banknummer auswählen
         - Kontonummer: frei wählen
         - Kontoinhaber: Name
         - Zahlungsweg: ``100`` (Überweisung Inland)
         - Bankkontotyp: ``Normal``
         - Kontobezeichnung: ``Girokonto``
         - [x] Be<u>v</u>orzugt
         - [x] A<u>k</u>tiv
   3. **Lieferant**
      - Klassifikation: Nach Region
      - Lieferbedingung: ``110`` (Frei Haus)
   4. **Kunde**
      - **Basis**
         - Klassifikation: Wie bei ``Lieferant``
         - Lieferbedingung: ``110`` (Frei Haus)
      - **Rechnungswesen**
         - Zahlungsprofil: ``100``
         - **Debitor**
            - **Allgemeines**
               - Zahlungsbedingung. ``120``
               - Partnerkonto: ``100``
               - Ausgangssteuer-Klassifikation: ``100``
            - **Zahlung**
               - Abzugsprofil: ``100``
            - **Mahnung**
               - Mahnprofil: ``100``
   5. **Rechnungswesen**
   6. **Kunden**

</details>
<details><summary style="color:red">Mahnen</summary>

1. **Cockpit: Mahnungen**
   - Mahnvorschlag erzeugen
2. **Mahnvorschlag erzeugen**
   - Mahnvorschlag erzeugen
   - Mahndatum ist NACH Rechnungsdatum und muss mehrere Tage in der Zukunft liegen
   - kleines gelbes Dreicek rechts oben
      - bestätigen
         - Ausgeben
3. **Cockpit: Mahnungen**
   - Mahnvorschlag bearbeiten
4. **Mahnvorschlag bearbeiten**
   - sperren
   - freigeben
5. **Cockpit: Mahnungen**
   - Mahnvorschlag prüfen
   - Mahnvorschlag durchführen
   - Mahnungen asugeben
   - Mahnungen stornieren

</details>
<details><summary style="color:green">Vertrieb mit Bezahlung</summary>

1. **Vertrieb**
   - Rechnung mit Materialbuchungen
2. **Cockpit: Ausgangsrechnungen**
   - Rechnung auswählen
   - Rechnung übertragen
3. **Cockpit: Buchungsläufe Finanzbuchhaltung**
   - Rechnung auswählen
   - Übernehmen und buchen
4. **Vertrieb**
   - Belegkette Ausgangsrechnung anwählen und Betrag kopieren
5. **Buchen Finanzbuchhaltung**
   - Belegart 300, Neu
   - Beliebige Nummer in Beleg
   - heute
   - Konto
      - Eigenes Konto (bspw. Bank)
   - Buchungsbetrag
      - Eigenes Konto Soll/Haben
   - Beleg buchen

</details>


----
----

##### [1 Directory up](./../)

----
