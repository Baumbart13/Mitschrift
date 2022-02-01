Asymmetrische Verschlüsselung
====

Ein Schlüssel zum Verschlüsseln - **Public Key**
Ein Schlüssel zum Entschlüsseln - **Private Key**

<table>
<tbody>
<tr>
<td style="text-align: center;">Public Key</td>
<td style="text-align: center;">➡➡ ➡➡</td>
<td style="text-align: center;">Geheimtext</td>
</tr>
<tr>
<td style="text-align: center;">⬆⬆ ⬆⬆</td>
<td style="text-align: center;"></td>
<td style="text-align: center;">⬇⬇ ⬇⬇</td>
</tr>
<tr>
<td style="text-align: center;">Klartext</td>
<td style="text-align: center;">⬅⬅ ⬅⬅</td>
<td style="text-align: center;">Private Key</td>
</tr>
</tbody>
</table>


RSA-Algorithmus
----

RSA sind die drei Entwickler des Algorithmus
Beispiel mit einfache Zahlen:

Alice -> Bob


Ablauf:
====

<ul>
    <li>1. Bob
        <ul>
            <li>1. Zwei Primzahlen
                <ul>
                    <li>ca. gleich viele Stellen</li>
                    <li>nicht zu nah beieinander
                        <ul>
                            <li>zwei aufeinander folgende Primzahlen sind eine schlechte Idee</li>
                        </ul>
                    </li>
                    <li>19 und 23 für Erklärung.. keine gute Praxis!!!</li>
                    <li>In der Praxis liegen die Primzahlen im Bereich von <img src="./images/RSA_Prinzahlen000.png" alt="RSA_Prinzahlen000.png"></li>
                    <li><code>N = p * q = 19 * 23 = 437</code></li>
                </ul>
            </li>
            <li>2. <code>m = (p - 1) * (q - 1) = 18 * 22 = 396</code></li>
            <li>3. Bob wählt eine weitere Zahl <code>e</code> mit folgenden Eigenschaften
                <ul>
                    <li>teilerfremd zum <code>ggT(m,e) = 1</code></li>
                    <li><code>e = 59</code> zur Erklärung</li>
                    <li>Public Key = <code>59,437</code></li>
                </ul>
            </li>
        </ul>
    </li>
    <li>4. Alice
        <ul>
            <li>4. nimmt <code>(a^e) % N = (97^59) % 437 = 203</code>
                <ul>
                    <li>&quot;%&quot; entspricht dem &quot;Modulo-Operator&quot;</li>
                    <li>Das für jedes Zeichen</li>
                    <li>sendet den verschlüsselten Wert (203) an Bob</li>
                </ul>
            </li>
        </ul>
    </li>
    <li>5. Bob
        <ul>
            <li>muss eine Gleichung lösen</li>
            <li><code>e * d + k * m = 59 * s + k * 396 = 1</code></li>
            <li>EEA - erweiterter euklidischer Algorithmus</li>
            <li>Hiermit werden <code>d</code> und <code>k</code> ermittelt. Interessant ist für Bob nur <code>d</code></li>
            <li><code>d = 47; k = -7</code></li>
            <li>Private Key = <code>47,437</code></li>
            <li><code>(203^47) % 437 = 97</code></li>
        </ul>
    </li>
</ul>