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
- Beispiel:
   - 20 Minuten Zeit
      - Artikel erstellen
         - Lagerort nur bei entsprechender Angabe einfügen
   	     - Dispositionssicht muss nicht gepflegt werden
      - Lieferant erstellen
         - Bankverbindungen niht vergessen
      - Beschaffung von neuem Artikel bei neuem Lieferant
      - Eingangsrechnung
         - auf 2 Kostenstellen verteilen
      - Zahllauf
   - 20 Minuten Zeit
      - Artikel
	  - Kunde
	  - Vertrieb
	  - Zahlung
	  - Mahnung


Theory
====

1. [ERP](./01_ERP.pdf)
2. [Beschaffung](./02_Beschaffung_ERP.pdf) im ERP
3. [BPM](./02_BPM.pdf)
4. [Vertrieb](./03_Vertrieb_CEE.pdf) CEE
5. [Produktion](./04_Produktion_1und2_CEE.pdf)
6. [**Fi**nanz**bu**chhaltung](./05_FiBu_CEE01_man_buchen.pdf) Teil 1
7. [**Fi**nanz**bu**chhaltung](./05_FiBu_CEE02_int_prozesse.pdf) Teil 2
8. [Lagerlogistik](./08_Lagerlogistik_Lagerplatzsteuerung.pdf)
9. [Finanzbuchhaltung Theorie](./99_FI_CO_Theorie.pdf)

Cheat Sheet
====

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
			- PFLICHT !! Partnerkonten-Klassifikation: ``100`` (Inland)
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
         - **Rechnungsdaten**
            - Zahlungsprofil: ``100``

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
   - Mahnungen ausgeben
   - Mahnungen stornieren

</details>
<details><summary style="color:green">Vertrieb mit Bezahlung</summary>

1. **Vertriebsaufträge**
   - Rechnung mit Materialbuchungen
2. **Cockpit: Ausgangsrechnungen**
   - Rechnung auswählen
   - Rechnung übertragen
3. **Cockpit: Buchungsläufe Finanzbuchhaltung**
   - Rechnung auswählen
   - Übernehmen und buchen
4. **Vertriebsaufträge**
   - Belegkette Ausgangsrechnung anwählen und Betrag kopieren
5. **Buchen Finanzbuchhaltung**
   - Belegart 300, Neu
   - Beliebige Nummer in Beleg
   - heute
   - Konto
      - Eigenes Konto (bspw. Bank=1200)
   - Buchungsbetrag
      - kopierten Betrag einfügen
      - Eigenes Konto Soll/Haben
   - Gegenkonto
      - D
      - Unternehmen einfügen
   - OP-Zuordnung
   - Beleg buchen

</details>


----
----

##### [1 Directory up](./../)

----
