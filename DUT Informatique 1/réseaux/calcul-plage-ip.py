def ip_str_denormalize(ip):
	ip_bin = []
	ip_str = ""

	for i in ip.split("."):
		ip_bin.append(bin(int(i))[2:].zfill(8))

	for i in ip_bin:
		ip_str += str(i)

	return ip_str

def ip_str_normalize(ip):
	string = ""
	for i in ip.split("."):
		string += str(int(i,2)) + "."
	return string.rstrip(".")

def plage_ip(x,y):
	x = ip_str_denormalize(x)
	y = ip_str_denormalize(y)
	x = int(x,2)
	y = int(y,2)
	return abs(x-y) + 1

borne_inf = input("Borne 1 : ")
borne_sup = input("Borne 2 : ")

print("Plage ip : " + str(plage_ip(borne_inf,borne_sup)))
