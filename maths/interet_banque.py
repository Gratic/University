base = float(input("Base de placement (u0) : "))
taux = float(input("Taux fixe (en pourcentage) : "))
temps = int(input("Temps (en année) : "))

capital = base * (1 + taux/100)**temps
print("Arrondi unité = Arrondi à l'unité la plus proche.")
print("Capital initial + intérêt : " + str(capital))
print("Arrondi unité : " + str(round(capital)) + "\n")
print("Intérêt seulement : " + str(capital - base))
print("Arrondi unité : " + str(round(capital - base)))
