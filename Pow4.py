# Created on 06-Sep-2016
# @author: AbuTaj
n = input('Number')
p = 0
for i in range(len(n)):
    p += int(n[i]) * int(n[i]) * int(n[i]) * int(n[i])
print(p) 
