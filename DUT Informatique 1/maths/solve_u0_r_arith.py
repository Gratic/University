print("n < p")
n = int(input("Entrer n : "))
un = float(input("Entrer un : "))

p = int(input("Entrer p : "))
up = float(input("Entrer up : "))

r = (up-un)/(p-n)
u0 = un - r * n

print("r : " + str(r))
print("u0 : " + str(u0))
