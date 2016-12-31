'''
Created on Dec 31, 2016

@author: Abu Taj
'''
firstname = raw_input()
lastname = raw_input()
PIN = raw_input()
N = raw_input()
S = ''
if len(firstname) > len(lastname):
    S = firstname[0] + lastname
if len(firstname) < len(lastname):
    S = lastname[0] + firstname
if len(firstname) == len(lastname):
    f = list(firstname)
    l = list(lastname)
    for i in range(len(f)):
        if chr(ord(f[i])).__gt__(chr(ord(l[i]))):
            S = f[0] + lastname
        if chr(ord(l[i])).__gt__(chr(ord(f[i]))):
            S = l[0] + firstname
S += PIN[int(N) - 1]
PIN1 = PIN[::-1]
S += PIN1[int(N) - 1]
print(S)
