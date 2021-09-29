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
