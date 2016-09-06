# Created on 06-Sep-2016
# @author: AbuTaj
n = input('Number')
p = 0
for i in range(len(n) - 1):
    p += pow(int(n[i]), int(n[i + 1]))
print(p + 1)
