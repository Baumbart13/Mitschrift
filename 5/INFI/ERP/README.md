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


#### **3. Test - 07. März 2022**
- Theorie (Kostenrechnung)
	- inklusive Folien ab ca Seite 52 (internes Rechnungswesen)
	- exklusive Folien bis ca Seite 96 (Kostenrechnungssysteme)
- Nicht rechnen
	- somit auch kein Taschenrechner verfügbar

#### **4. Test - 04. April 2022**
- Gute Frage
- Nächste Frage


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
10. [Fallstudie Sozialamt](./fallstudie_sozialamt_v.2.pdf)


Cheat Sheet
====

<details>
<summary style="color:red">Artikel erstellen</summary>

1. **Artikel**
   1. **Basis**
      - Artikelnummer
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
      - Erlöskonto-Klassifikation: ``400-300`` (Erlöse Handelsware)
      - Bestandskonto-Klassifikation: ``100-300`` (Bestand Handelsware)
      - Kostenarten-Klassifikation Vertrieb: ``300``
      - Kostenarten-Klassifikation Beschaffung: ``300``
      - Kostenarten-Klassifikation Produktion: ``300``
      - Kostenarten-Klassifikation Lagerlogistik: ``300``
      - Preis 1 - Pflichtfeld: beliebiger Geldbetrag
   3. **Lagerlogistik**
      - Klassifikation: ``300``
      - Lademittel: ``80000`` (Europalette)
   4. **Disposition**
      - Mindestbestand
      - Maximalbestand
      - Meldebestand
      - Füllbestand
      - Bedarfsdeckung: ``Externe Beschaffung``
      - Beschaffungsdisponent: ``ADM_KEJ``
      - [ ] Produktionsdaten anwenden
   5. **Beschaffung**
      - Klassifikation: ``300``
      - Standard-Lagerort: ``100``
      - Einheiten: ``Stk.``
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
            - Ausgangssteuer-Klassifikation: ``100`` (Vertrieb Inland)
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

</details>
<details><summary style="color:red">Beschaffung mit Zahlung</summary>

1. **Beschaffungsaufträge**
   - Nummer
      - ``100``
      - Neu
   - Lieferant: Der Lieferant. Bspw ``UG00703``
   - Fremdbelegnummer: Irgendwas
   - Wunschtermin: Irgendwann ab heute in der Zukunft
   - Speichern
   - **Position hinzufügen**
      - **Allgemeines**
         - Artikel: Artikel auswählen. Bspw ``UG00704``
	     - Gesamtmenge: Beliebige Menge. Bspw. ``20 Stk``
		 - Evtl. ``Lagerort`` ändern von ``100`` (Standard Lager) auf eigenes Lager
	  - **Preise**
	     - Preisherkunft: 2 Manuell
		 - Bruttopreis: Preis eintragen. Bspw. ``50,00 EUR``
		 - Preisdimension: Beliebig. Bspw. ``Pro Stk``
		 - "Enter", bzw. ``übernehmen (Eingabetaste)`` drücken
		 - Speichern
		 - Rolle: ``Lieferauftrag erzeugen und Warenrücklieferschein mit Materialbuchung ausgeben..``
		 - ``Ausgeben``
2. **Wareneingänge**
   - Nummer:
      - ``100``
   - Lieferpartner: Der selbe Lieferant. Bspw. ``UG00703``
      - Neu
	  - Fremdbelegnummer:
	     - Irgendwas
		 - Irgendwann ab heute in der Zukunft
	  - Rolle
	     - Positionen mit Auftragsbezig einfügen...
		    - Nummer von Beschaffungsauftrag in ``Nummer`` einügen. Bspw. ``BA1171``
		    - Häckchen hinten setzen
			- ``Zuordnung speichern``
	  - Speichern
	  - Rolle
	     - Wareneingang buchen...
		    - [x] Wareneingangsetiketten ausgeben
			- [x] Warnungen automatisch bestätigen
			- ``Asugeben``
3. **Eingangsrechnung**
   - Nummer:
      - ``100``
	  - Neu
	  - Rechnungssteller: Selbiger Lieferant. Bspw. ``UG00703``
	  - Fremdbelegnummer und -datum
	     - Irgendwas
		 - Irgendwann ab heute in der Zukunft
	  - Leistungsdatum
	     - Irgendwann ab heute in der Zukunft
	  - Speichern
	  - kleine Rolle
	     - ``Wareneingang automatisch mit Auftragsposition verknüpfen``
		    - Nummer: Nummer von Beschaffungsaufrag. Bspw. ``BA1171``
			- Häckchen hinten setzen
			- Zuordnungen speichern
      - Speichern
	  - Auftragsstelle anwählen
	  - Kostenrechnungsdaten hinzufügen
	     - Kostenstelle: Bspw. ``802000`` (Einkauf)
		 - Kostenträger: Ignorieren
		 - Fakturierte Menge: Teil von Gesamtmenge. Bspw. ``5,00 Stk``
		 - Nettobetrag: Sollte sich von selber ergeben
	  - Auftragsstelle anwählen
	  - Kostenrechnungsdaten hinzufügen
	     - Kostenstelle: Bspw. ``805000`` (Einkauf)
		 - Kostenträger: Ignorieren
		 - Fakturierte Menge: restlicher Teil von Gesamtmenge. Bspw. ``15,00 Stk``
		 - Nettobetrag: Sollte sich von selber ergeben
	  - Bruttobetrag: Mit Betrag von ``Saldo`` gleich setzen. Bspw. ``1190,00 EUR``
	  - Speichern
	     - ``Saldo`` muss dann auf ``0,00 EUR`` stehen.
	  - Rolle
	     - Eingangsrechnung buchen
		 - In der HTL
		    - ``Sofort``
	     - Außerhalb der HTL
		    - ``Im Hintergrund``
4. **Cockpit: Eingangsrechnungen**
   - Eingangsdatum: Datum der Rechnung. Bspw. ``heute`` oder ``17.01.2022``
   - Status: ``(Alle)``
   - Zuständiger Mitarbeiter: Nummer des Mitarbeiters. Bspw. ``H20A007``
   - Eingabetaste drücken
   - Häckchen für betroffene Eingangsrechnungen setzen
   - Rolle
      - Rechnungen übertragen...
	     - In der HTL
		    - ``Sofort``
	     - Außerhalb der HTL:
		    - ``Im Hintergrund``
5. **Cockpit: Buchungsläufe Finanzbuchhaltung**
   - Herkunft: ``(Alle)``
   - Erfasst von: Nummer des Mitarbeiters. Bspw. ``H20A007``
   - Status: ``(Alle)``
   - Eingabetaste drücken
   - Häckchen setzen bei betreffender Eingangsrechnung
   - Rolle
      - Übernehmen und buchen
	     - In der HTL
		    - ``Sofort``
	     - Außerhalb der HTL:
		    - ``Im Hintergrund``
6. **Cockpit: Zahlungen**
   - Rolle
      - Zahlungsvorschlag erzeugen
7. **Zahlungsvorschlag erzeugen**
   - Auswahl Zahlungsvorschlag: Irgendwas. Bspw. ``LERNEN1``
   - Bezeichnung: Irgendwas. Bspw. ``Lernen Nummer 1``
   - **Partner**
      - Partner: Lieferant angeben. Bspw. ``UG00703``
   - **Zahlung**
      - Zahlungsweg-Klassifikation: ``100`` (Zahlungen)
   - Rolle
      - ``Ausgeben``
8. **Cockpit: Zahlungen**
   - Eingabetaste drücken
   - Zahlungsvorschlag auswählen
   - Rolle
      - Zahlungsvorschlag anzeigen/bearbeiten
9. **Zahlungsvorschlag anzeigen/bearbeiten**
   - Rolle
      - Vorschlag sperren
	  - Vorschlag freigeben
	  - Zahlungen durchführen
	     - ``Ausgeben``

</details>
<details><summary style="color:green">Mahnen</summary>

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
<details><summary style="color:red">Vertrieb mit Bezahlung</summary>

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
<details><summary style="color:green">Einkauf, Kostenaufteilung auf mehrere Stellen, automatische Bezahlung, manuelle OP-Zuordnung</summary>

1. **Beschaffungsaufträge**
   - Nummer
      - ``100``
      - Neu
   - Lieferant: Der Lieferant. Bspw ``KK00702``
   - Fremdbelegnummer: Irgendwas
   - Wunschtermin: Irgendwann ab heute in der Zukunft
   - Speichern
   - **Position hinzufügen**
      - **Allgemeines**
         - Artikel: Artikel auswählen. Bspw ``KK00702``
        - Gesamtmenge: Beliebige Menge. Bspw. ``10 Stk``
       - Evtl. ``Lagerort`` ändern von ``100`` (Standard Lager) auf eigenes Lager
     - **Preise**
        - Preisherkunft: 2 Manuell
       - Bruttopreis: Preis eintragen. Bspw. ``1050,00 EUR``
       - Preisdimension: Beliebig. Bspw. ``Pro Stk``
       - "Enter", bzw. ``übernehmen (Eingabetaste)`` drücken
       - Speichern
       - Rolle: ``Bestellung mit Preisangaben ausgeben...``
       - ``Ausgeben``
2. **Wareneingänge**
   - Nummer:
      - ``100``
   - Lieferpartner: Der selbe Lieferant. Bspw. ``KK00702``
      - Neu
     - Fremdbelegnummer:
        - Irgendwas
       - Irgendwann ab heute in der Zukunft
     - Rolle
        - Positionen mit Auftragsbezig einfügen...
          - Nummer von Beschaffungsauftrag in ``Nummer`` einügen. Bspw. ``BA1264``
          - Häckchen hinten setzen
         - ``Zuordnung speichern``
     - Speichern
     - Rolle
        - Wareneingang buchen...
          - [x] Wareneingangsetiketten ausgeben
         - [x] Warnungen automatisch bestätigen
         - ``Asugeben``
3. **Eingangsrechnung**
   - Nummer:
      - ``100``
     - Neu
     - Rechnungssteller: Selbiger Lieferant. Bspw. ``KK00702``
     - Fremdbelegnummer und -datum
        - Irgendwas
       - Irgendwann ab heute in der Zukunft
     - Leistungsdatum
        - Irgendwann ab heute in der Zukunft
     - Speichern
     - kleine Rolle
        - ``Wareneingang automatisch mit Auftragsposition verknüpfen``
          - Nummer: Nummer von Beschaffungsaufrag. Bspw. ``BA1264``
         - Häckchen hinten setzen
         - Zuordnungen speichern
      - Speichern
     - Auftragsstelle anwählen
     - ``Kostenrechnungsdaten hinzufügen``
        - Kostenstelle: Bspw. ``802000`` (Verwaltung)
       - Kostenträger: Ignorieren
       - Fakturierte Menge: Teil von Gesamtmenge. Bspw. ``5,00 Stk``
       - Nettobetrag: Sollte sich von selber ergeben
     - Auftragsstelle anwählen
     - ``Kostenrechnungsdaten hinzufügen``
        - Kostenstelle: Bspw. ``805000`` (Einkauf)
       - Kostenträger: Ignorieren
       - Fakturierte Menge: restlicher Teil von Gesamtmenge. Bspw. ``5,00 Stk``
       - Nettobetrag: Sollte sich von selber ergeben
     - Bruttobetrag: Mit Betrag von ``Saldo`` gleich setzen. Bspw. ``12.495,00 EUR``
     - Speichern
        - ``Saldo`` muss dann auf ``0,00 EUR`` stehen.
     - Rolle
        - ``Eingangsrechnung buchen``
        - In der HTL
          - ``Sofort``
        - Außerhalb der HTL
          - ``Im Hintergrund``
4. **Cockpit: Eingangsrechnungen**
   - ``Eingangsrechnungsnummer``
      - Nummer von Eingangsrechnung. Bspw. ``ER0908``
   - ``Status``
      - ``(Alle)``
   - "Enter"
   - Eingangsrechnung auswählen
   - Rolle
      - ``Rechungen übertragen...``
      - In der HTL
        - ``Sofort``
      - Außerhalb der HTL
        - ``Im Hintergrund``
5. **Cockpit: Finanzbuchhaltung**
   - ``Erfasst von``
      - Benutzerkürzel einfügen. Bswp. ``H20A007``
   - Korrekten Buchungslauf auswählen
   - Rolle
      - ``Übernehmen und buchen``
6. **Eingangsrechnung**
   - Die vorherige Eingangsrechnung aufrufen. Bspw. ``ER0908``
   - Belegkette
      - Auf ``Buchungsbeleg Finanzbuchhaltung`` klicken
7. **Buchen Finanzbuchhaltung**
   - Belegart:
      - ``300``
   - Neu
   - ``Beleg``:
      - irgendwas
   - ``Datum``:
      - Korrektes Datum einfügen. Bspw. ``06.02.2022``
   - ``Konto``
      - Soll: ``S``
      - ``1200``
   - ``Buchungsbetrag``:
      - Betrag von Eingangsrechnung. Bspw. ``12495,00``
      - Haben: ``H``
      - Währung. Bspw. ``EUR``
   ``Gegenkonto``:
      - ``K``
      - Lieferant einfügen. Bswp. ``KK00702``
   - "Enter"
   **In der OP-Zuordnung!!!**
   - "Alt" + "Pfeil nach unten"
   - "Enter"
   - Offenen Posten auswählen
   - ``Zuordnen``
   - ``Enter``
   - Speichern
   - Rolle
      - ``Beleg buchen``


</details>


----
----

##### [1 Directory up](./../)

----
