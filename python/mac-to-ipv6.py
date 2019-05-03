mac_raw = input("Entrez l'adresse mac (minuscule) : ").strip()
mac = ""
check = "abcdef0123456789"

#Au cas où les "-" sont mis
#On les enlèves
for char in mac_raw:
	if char.isalnum():
		mac += char

#On vérifie qu'elle a la bonne longueur
if len(mac) != 12:
	print("L'adresse mac est mauvaise. Arrêt du script.")
	exit()

#On vérifie qu'elle ne sort pas des caractères hexa
for i in mac:
	estDedans = False
	for j in check:
		if i == j:
			estDedans = True
			break

	if not estDedans:
		print("L'adresse mac est mauvaise. Arrêt du script.")
		exit()

#print(str(int(mac,16)))
#print(str(bin(int(mac,16))[2:]).zfill(48))

binaire = str(bin(int(mac,16))[2:])
binaire = list(str(binaire).zfill(48))

#Inversion du 6ème bit (partant de 0)
if binaire[6] == str(1):
	binaire[6] = str(0)
else:
	binaire[6] = str(1)

binaireStr = ""
for i in binaire:
	binaireStr += str(i)

mac_inversed = str(hex(int(binaireStr,2))[2:]).zfill(12)
ipv6_raw = mac_inversed[:6] + "fffe" + mac_inversed[6:]
ipv6 = "fe80::" + ipv6_raw[:4] + ":" + ipv6_raw [4:8] + ":" + ipv6_raw[8:12] + ":" + ipv6_raw[12:16]

print("- - - - - - MAC to IPv6 - - - - - -")
print("MAC : " + mac_raw)
print("MAC (hex av) : " + mac)
print("MAC (hex ap) : " + mac_inversed)
print("MAC (binaire av) : " + str(bin(int(mac,16))[2:]).zfill(48))
print("MAC (binaire ap) : " + binaireStr)
print("IPv6 : " + ipv6)