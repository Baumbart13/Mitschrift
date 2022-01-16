Arena-Dateien sind [hier](./Arena/) zu finden
====

Einführung ARENA
====

<details><summary>Cheatsheet</summary>

<details><summary>
<strong>Arena's Probability Distributions</strong>
</summary>

| Distribution | Parameter | Values                     |
|:------------ |:--------- |:-------------------------- |
| Beta         | BETA      | Beta, Alpha                |
| Continuous   | CONT      | CumP1, Val1,...CumPn, Valn |
| Discrete     | **DISC**  | CumP1, Val1,...CumPn, Valn |
| Erlang       | ERLA      | ExpoMean, k                |
| Exponential  | EXPO      | Mean                       |
| Gamma        | GAMM      | Beta, Alpha                |
| Johnson      | JOHN      | Gamma, Delta, Lambda, Xi   |
| Lognormal    | LOGN      | LogMean, LogStd            |
| Normal       | **NORM**  | **Mean, StdDev**           |
| Poisson      | POIS      | Mean                       |
| Triangular   | **TRIA**  | **Min, Mode, Max**         |
| Uniform      | UNIF      | Min, Max                   |
| Weibull      | WEIB      | Beta, Alpha                |

</details>

</details>

Arena - Input Analyzer
----

- Zufallszahlengenerator mit verschiedenen Verteilungsfunktionen / Dichtefunktionen (Excel: nur Gleichverteilung [0...1]
- aus Daten wird Dichtefunktion ermittelt
   - mithilfe von Regression wird die _optimale_ Dichtefunktion ermittelt
   - Methode: kleinstes Fehlerquadrat
      1. Kurve wird angelegt
	  2. Abstand zu Messwerten wird ermittelt (Fehler werden ermittelt)
	  3. Quadrierung der Fehler
	     - Fehler werden positiv
		 - Fehler werden gewichtet


- Trennzeichen in einer CSV für Arena ist wissentlich gültig:
   - NewLine (CR LF)


----

Aufgabe McDoodle
====

#### Problemstellung

Kunden kommen mit dem Auto (Annahme: 1 Personen pro Auto) zu McDoodle. Messungen haben ergeben dass die Zeit zwischen den ankommenden Autos ``2, 4, 1, 2, 5, 3, 2, 1, 2, 3, 5, 1, 1, 2`` und ``2`` Minuten betragen. ``30%`` der Kunden fahren zum _Drive-In_, ``60%`` parken und gehen ins _Restaurant_ und ``10%`` fahren wieder, _ohne zu konsumieren_. Die Zeit für die Bedienung am _Drive-In-Schalter_ ist _gleichverteilt_ im Intervall ``[3,4]`` in Minuten. Im _Restaurant_ beträgt die _normalverteilte_ Bedienzeit _(``1`` Schalter ist offen)_ im _Mittel_ ``2`` Minuten mit der _Standardabweichung_ ``0.2`` Minuten. Der _Verzehrdauer_ im Restaurant ist _dreiecksverteilt_ (Triangular) mit ``[3,8,20]``. Es stehen _genügend Plätze_ zur Verfügung.

#### Aufgabe

- [ ] Modellieren Sie dieses System und animieren Sie dieses.
- [ ] Zeigen Sie die Variable der im Gesamtsystem Wartenden
- [ ] Wie reagiert das Modell bei der Simulation?
- [ ] Wo können Parameter sinnvoll geändert werden?