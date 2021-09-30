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

Regelung hat immer eine Rückkopplung
Ziel ist immer die Strecke zu verändern.

Regelung ist wenn man nach dem Steuern nochmals steuert anhand der Sensoren (Dusche)
Sollte man die Dusche einstellen und nicht weiter ändern, so ist das steuern. Korrigiert man diese Einstellung, regelt man.

Überlegungen:
- Welche Regler?
- Wie schnell, wie stark?
   - Darf der Istwert über den Sollwert?
   - Wie weit darf der Istwer über den Sollwert?
   - Je nach Anwendungszweck zu entscheiden und definieren
- was generell?
- muss zur Strecke passen      auch Heizung, etc dabei

#### Was wollen wir?
##### 1 Das Führungsverhalten

![Führungsverhalten](./Führungsverhalten.png)
- Unter Führungsverhalten versteht man die zeitliche Reaktion des Regelkreises auf einen Sprung des Sollwertes.
**Sprungantwort**
- Unter Sprungantwortversteht man den zeitlichen Verlauf der Ausgangsgröße eines regelungstechnischen Elements oder des Regelkreises wenn am Eingang zunm Zeitpunkt 0 ein Sprung der Höhe 1 erfolgt (Einheitssprung)
   - Führungsverhalten ist die Sprungantwort des ganzen Regelkreises im Bezug auf die Eingangsgröße *W*
**Achtung:** Genau unterscheiden wovon man die Sprungantwort beachtet!
Sprungantwort von Regler kann zwar sofort auf 100% gehen, aber Sprungantwort vom Sensor kann sehr träge sein

Je nachdem wie sich der Regler verhält, verhält sich die Strecke und die Sensoren. Sie reagieren alle anders aber in Abhängigkeit der anderen Teile

![Punkt zu Heizen/Abkühlen](./Heizen001.png)

Schwarze Linie ist Abbau der Temperatur, Rot, ist der Aufbau
<br><br>
- Beispiel:
   - Mit einer Heizung auf 20°C heizen. Bei 2 Heizungen "dauert" es halb so lang, allerdings gleich lange wie wenn man auf 40°C heizen würde.
   - Praxis: Effekt sichtbar, da Dauer halbiert
   - Theorie: Wenn 2 Heizungen verwendet werden, muss auch erwartete Temperatur verdoppelt werden (ALLES!), damit Sprungantwort am Ende die gleiche ist
   - Verdopplun der Leistung = doppelt so hoher Sprung = habe Zeit

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

Das Störverhalten ist die Sprungantwort des ganzen Regelkreises im Bezug auf die Eingangsgröße **Z**

Das Störverhalten ist zB ein geöffnetes Fesnter im Winter, wenn man Heizen möchte. 

----

|   | Beispiele |   |
|:--- |:---:|:---:|
| Bsp1 | **x** = Zimmertemperatur | **Z** = Wärmeverlust durch Außentemperatur |
|   | **y** = Heizleistung |   |
| Bsp1 | **x** = konstante Geschwindigkeit | **Z** = Gefälle oder Steigung |
|   | **y** = Treibstoffzufuhr |   |
| Bsp1 | **x** = Drehzahl | **Z** = Lastdrehmoment |
|   | **y** = Umdrehungen |   |

Zu viel CO2 im Blut schneller Atem

| Helligkeit | **x** = Lichteinfall im Auge | **Z** = illegale Substanzen |
|   | **y** = Pupillenöffnung |   |
| Helligkeit | **x** = Zuckergehalt im Blut | **Z** = Zucker |
|   | **y** = Insulinproduktion |   |


----
