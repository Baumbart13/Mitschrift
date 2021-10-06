Regelungstechnik
================

Technische Systeme werden gesteuert und überwacht
Jede Regelung hat eine Steuerung.

Bsp.:
> In der Früh gehe ich duschen und stelle mir das Wasser heiß ein (Steuerung) \
> Dabei merke ich, dass es zu heiß ist und ich möchte kälter stellen (Regelung) \
> Ich stelle das Wasser kälter ein (Steuerung)

```
W ... Sollwert {zB 25°C}
x ... Istwert {zB 20°C}
y ... Stellgröße {Ausgang des Reglers zB 70%}
E ... Regelabweichung = W - x
```

![Grafik001.png](./Grafik001.png)

Regelung hat immer eine Rückkopplung. \
Ziel ist immer die Strecke zu verändern.

Regelung ist wenn man nach dem Steuern nochmals steuert anhand der Sensoren (Dusche)
Sollte man die Dusche einstellen und nicht weiter ändern, so ist das steuern. Korrigiert man diese Einstellung, regelt man.

Überlegungen:
- Welche Regler?
- Wie schnell, wie stark?
   - Darf der Istwert über den Sollwert?
   - Wie weit darf der Istwert über den Sollwert?
   - Je nach Anwendungszweck zu entscheiden und definieren
- Was generell?
- Muss zur Strecke passen      auch Heizung, etc dabei

#### Was wollen wir?
##### 1 Das Führungsverhalten

![Führungsverhalten](./Führungsverhalten.png)
- Unter _Führungsverhalten_ versteht man die zeitliche Reaktion des Regelkreises auf einen Sprung des Sollwertes.

**Sprungantwort**
- Unter _Sprungantwort_ versteht man den zeitlichen Verlauf der Ausgangsgröße eines regelungstechnischen Elements oder des Regelkreises wenn am Eingang zum Zeitpunkt 0 ein Sprung der Höhe 1 erfolgt (Einheitssprung)
   - Führungsverhalten ist die Sprungantwort des ganzen Regelkreises im Bezug auf die Eingangsgröße *W*
**Achtung:** Genau unterscheiden wovon man die Sprungantwort beachtet!
Sprungantwort von Regler kann zwar sofort auf 100% gehen, aber Sprungantwort vom Sensor kann sehr träge sein

Je nachdem wie sich der Regler verhält, verhält sich die Strecke und die Sensoren. Sie reagieren alle anders, aber in Abhängigkeit der anderen Teile

![Punkt zu Heizen/Abkühlen](./Heizen001.png)

Schwarze Linie ist Abbau der Temperatur, Rot ist der Aufbau
<br><br>
- Beispiel:
   - Mit einer Heizung auf 20°C heizen. Bei 2 Heizungen "dauert" es halb so lang, allerdings gleich lange wie wenn man auf 40°C heizen würde.
   - Praxis: Effekt sichtbar, da Dauer halbiert
   - Theorie: Wenn 2 Heizungen verwendet werden, muss auch erwartete Temperatur verdoppelt werden (ALLES!), damit Sprungantwort am Ende die Gleiche ist
   - Verdopplung der Leistung = doppelt so hoher Sprung = halbe Zeit

![Heizen002.png](./Heizen002.png)

----

#### 2 Störverhalten

- Störfaktoren
   - Lampen
   - Menschen
   - Fenster
   - EDV-Geräte
   - Raumgröße (wirkt auf die Strecke, aber ist kein direkter Störfaktor)

Auf die Strecke wirkt die Störgröße **Z**

Das Störverhalten ist die Sprungantwort des ganzen Regelkreises in Bezug auf die Eingangsgröße **Z**

Das Störverhalten ist zB ein geöffnetes Fenster im Winter, wenn man Heizen möchte. 

[Störverhalten001.png](./Störverhalten001.png)

Der Störfaktor **Z[0]** weist einen Einheitssprung auf (Ein Fenster wird geöffnet) \
Dadurch sinkt die Temperatur (**x** steigt) \
Dann wird **y** so eingestellt, dass der gestiegene Störfaktor kompensiert wird (**x** sinkt wieder runter) \
Im Idealfall sinkt **x** dadurch auf den originalen, gewünschten Wert herunter. In der Praxis kann dies nicht umgesetzt werden, lediglich eine Näherung.

----

|      | Beispiele                         |                                            |
|:---- |:---------------------------------:|:------------------------------------------:|
| Bsp1 | **x** = Zimmertemperatur          | **Z** = Wärmeverlust durch Außentemperatur |
|      | **y** = Heizleistung              |                                            |
| Bsp2 | **x** = konstante Geschwindigkeit | **Z** = Gefälle oder Steigung              |
|      | **y** = Treibstoffzufuhr          |                                            |
| Bsp3 | **x** = Drehzahl                  | **Z** = Lastdrehmoment                     |
|      | **y** = Umdrehungen               |                                            |

Zu viel CO2 im Blut schneller Atem

<table>
   <tr>
      <td>Helligkeit</td>
      <td><strong>x</strong> = Lichteinfall im Auge</td>
      <td><strong>Z</strong> = illegale Substanzen</td>
   </tr>
   <tr>
      <td></td>
      <td><strong>y</strong> = Pupillenöffnung</td>
      <td></td>
   </tr>
   
   <tr>
      <td>Helligkeit</td>
      <td><strong>x</strong> = Zuckergehalt im Blut</td>
      <td><strong>Z</strong> = Zucker</td>
   </tr>
   <tr>
      <td></td>
      <td><strong>y</strong> = Insulinproduktion</td>
      <td></td>
   </tr>
</table>

----

Negative Rückkoplung:

Die Preisbildung durch Angebot & Nachfrage ist ein Beispiel für negative Rückkopplung. Ein bestimmter Effekt (geringe Nachfrage) hat eine Konsequenz, die diesem entgegengerichtet ist. => System pendelt sihc in einen stabilen Zustand ein.


<table>
   <tr>
      <td></td>
	  <td style="text-align: center">
	     <strong>Beispiel Laptop-Verkauf</strong>
	  </td>
	  <td></td>
   </tr>
   <tr>
      <td>W</td>
      <td>gewünschter Preis</td>
      <td>€</td>
   </tr>
   <tr>
      <td>y</td>
      <td>Angebot</td>
      <td>Stück</td>
   </tr>
   <tr>
      <td>x</td>
      <td>aktueller Preis</td>
      <td>€</td>
   </tr>
   <tr>
      <td>E</td>
      <td>W - x</td>
      <td>€</td>
   </tr>
</table>

Negative Rückkopplung ≘ **x** steigt, **W** sinkt; und anders herum \
Positive Rückkopplung ≘ **x** steigt, **W** steigt; und anders herum

Positive Rückkopplung ist in der Wirtschaft meistens eine Blase => Nachfrage steigt, Preis steigt. \
Bis zum Kippen der Richtung. Nach dem Kippen sinkt die Nachfrage und der Preis sinkt.

----

#### 3 Typische Regelstrecken (regelungstechnische Elemente)

##### P-Element (Proportionalelement)

- Nicht mehr proprotional dazu ist zB die Motordrehzahl, weill das Fahrzeug beschleunigt werden muss.
- **A(t)** = **k[p]** \* **E(t)**
- Ausgangswert = Proprotionalitätsfaktor des p-Elements \* Eingangswert

##### Totzeit-Element

Siehe Förderband: Kies wird auf Förderband gelegt und benötigt eine gewisse Zeit (= Verzögerung), damit der Kies im System ist.

Beispiel: Handy ausschalten: Ausschalten-Knopf gewisse Zeit gedrückt lassen, bis sich das Handy ausschaltet. Diese Verzögerung ist die **Totzeit** und das Bauelement ist das **Totzeit-Element**

##### Integrierer (I-Glied (ohne Verluste))

- Für was brauchen wir Integration?
   - Wenn man auf etwas warten möchte
   - Wenn man eine Fläche berechnen möchte (= Integrieren in a nutshell)
      - Was bringt das?
	     - Tank
		    - Zufluss ist linear
			- Füllstand ist das Integral vom Wasserstand
