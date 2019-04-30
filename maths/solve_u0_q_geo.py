print("Solveur de q : n < p")
n = int(input("Entrer n: "))
un = float(input("Entrer un: "))

p = int(input("Entrer p:"))
up = float(input("Entrer up: "))

q = (up/un)**(1/(p-n))
u0 = un / q**n
print("q : " + str(q))
print("u0 : " + str(u0))
