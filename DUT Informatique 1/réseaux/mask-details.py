__author__ = 'Zaleks'
__copyright__ = 'Copyright 2019, Le_Grand_Casse'
__credits__ = ['']
__license__ = 'WTFPL'
__version__ = '1.1'
__maintainer__ = ''
__email__ = ''
__status__ = ''

def bit_not(n, numbits=8):
    return (1 << numbits) - 1 - n

def andip(ip, mask):
	ip = saisie_ip.split(".")
	mask = saisie_mask.split(".")
	return str(int(ip[0]) & int(mask[0])) + "." + str(int(ip[1]) & int(mask[1])) + "." + str(int(ip[2]) & int(mask[2])) + "." + str(int(ip[3]) & int(mask[3]))

def finip(ip, mask):
	raw_network = andip(ip, mask)
	network_bin = []
	mask_bin = []
	addto = []
	network = []
	network_string = ""

	for i in raw_network.split("."): 
		network_bin.append(bin(int(i))[2:].zfill(8))
	
	for i in mask:
		mask_bin.append(bin(int(i))[2:].zfill(8))

	for i in range(4):
		addto.append(bit_not(int(mask_bin[i],2)))
	
	for i in range(4):
		network.append(int(network_bin[i],2) + int(addto[i]))

	for i in network:
		network_string += str(i) + "."

	return network_string.rstrip(".")

#Entrée : une ip 'x.x.x.x'
#Sortie : binaire de l'ip en str
def ip_str_denormalize(ip):
	ip_bin = []
	ip_str = ""

	for i in ip.split("."):
		ip_bin.append(bin(int(i))[2:].zfill(8))

	for i in ip_bin:
		ip_str += str(i)

	return ip_str

#Entrée : une ip binaire "x.x.x.x"
#Sortie : une ip normale décimale
def ip_str_normalize(ip):
	string = ""
	for i in ip.split("."):
		string += str(int(i,2)) + "."
	return string.rstrip(".")

def bin_str_to_ip_bin(ip):
	return ip[:8] + "." + ip[8:16] + "." + ip[16:24] + "." + ip[24:32]

def premier_identificateur(ip, mask):
	network_address = andip(ip,mask)

	network_string = ip_str_denormalize(network_address)

	network_string = str(bin(int(network_string,2) + 1)[2:].zfill(32))
	network_string = bin_str_to_ip_bin(network_string)

	return ip_str_normalize(network_string)

def dernier_identificateur(ip, mask):
	broadcast_address = finip(ip,mask)

	broadcast_string = ip_str_denormalize(broadcast_address)

	broadcast_string = str(bin(int(broadcast_string,2) - 1)[2:].zfill(32))
	broadcast_string = bin_str_to_ip_bin(broadcast_string)

	return ip_str_normalize(broadcast_string)

def plage_ip(x,y):
	x = ip_str_denormalize(x)
	y = ip_str_denormalize(y)
	x = int(x,2)
	y = int(y,2)
	return abs(x-y) + 1

saisie_ip = input("Entrer l'IP (en décimale) : ")
saisie_mask = input("Entrer le mask (en décimale) : ")

ip = saisie_ip.split(".")
mask = saisie_mask.split(".")
network_address = andip(ip,mask)
broadcast_address = finip(ip, mask)
premier_identificateur = premier_identificateur(ip,mask)
dernier_identificateur = dernier_identificateur(ip,mask)

print(" - - - - - - Mask Details - - - - - - ")
print("Adresse du réseau : " + network_address)
print("Adresse du broadcast : " + broadcast_address)
print("Premier identificateur : " + premier_identificateur)
print("Dernier identificateur : " + dernier_identificateur)
print("Plage ip : " + str(plage_ip(premier_identificateur,dernier_identificateur)))
