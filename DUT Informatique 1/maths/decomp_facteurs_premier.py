# -*- coding: utf-8 -*-
def diviseurs(c):
    div = []
    for i in range(1,int(c)+1):
        if c%i == 0:
            div.append(i)
            
    return div

def premier(div):
    return True if len(diviseurs(div)) == 2 else False
    
def diviseurs_premier(num):
    div_pr = []
    for i in diviseurs(num):
        if premier(i) == True :
            div_pr.append(i)
    return div_pr
    
def decomp_premier(num, facteur):
    premier = diviseurs_premier(num)
    for i in premier:
        if num%i == 0:
            facteur.append(i)
            #print(num/i)
            decomp_premier(num/i, facteur)
            break
    return facteur
        
    
num = int(input("Entrez un nombre : "))
div = diviseurs(num)
facteur = []
decomp = decomp_premier(num, facteur)
#print("Commence")
for i in decomp:
    print(i)
