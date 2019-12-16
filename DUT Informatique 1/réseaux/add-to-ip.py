__author__ = 'Zaleks'
__copyright__ = 'Copyright 2019, Le_Grand_Casse'
__credits__ = ['']
__license__ = 'WTFPL'
__version__ = '1.1'
__maintainer__ = ''
__email__ = ''
__status__ = ''

def bin_str_to_ip_bin(ip):
	return ip[:8] + "." + ip[8:16] + "." + ip[16:24] + "." + ip[24:32]

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

def add_to_ip(ip,n):
	ip = ip_str_denormalize(ip)
	ip = int(ip,2)
	ip += n
	ip = str(bin(ip)[2:].zfill(32))
	return ip_str_normalize(bin_str_to_ip_bin(ip))

saisie = input("Entrer l'ip : ")
nombre = int(input("Entrer le décalage : "))

print("IP (base) : " + saisie)
print("- - - NON inclus - - -")
print("IP (ajout) : " + str(add_to_ip(saisie, nombre)))
print("IP (-ajout) : " + str(add_to_ip(saisie, -nombre)))
print("- - - inclus - - -")
print("IP (ajout) : " + str(add_to_ip(saisie, nombre + 1)))
print("IP (-ajout) : " + str(add_to_ip(saisie, -(nombre + 1))))
