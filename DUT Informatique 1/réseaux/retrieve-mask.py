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

def mask_retriever(ip1,ip2):
	ip1 = ip_str_denormalize(ip1)
	ip2 = ip_str_denormalize(ip2)

	ipx = list(ip1)
	ipy = list(ip2)

	same = True

	mask = ""
	for i in range(len(ipx)):
		if ipx[i] == ".":
			mask += "."
			continue

		if same:
			if ipx[i] == ipy[i]:
				mask += "1"
			else:
				same = False
				mask += "0"
		else:
			mask += "0"

	return ip_str_normalize(bin_str_to_ip_bin(mask))

ip1 = input("Entrer la première ip : ")
ip2 = input("Entrer la deuxième ip : ")

print(mask_retriever(ip1, ip2))
