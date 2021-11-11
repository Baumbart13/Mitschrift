Arena-Dateien sind [hier](./Arena/) zu finden
====

Einführung ARENA
====

<details><summary>Cheatsheet</summary>

<details><summary>
**Arena's Probability Distributions**
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
