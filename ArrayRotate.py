# Created on 05-Sep-2016
# @author: AbuTaj
a = input('Array')
ar = ''
for i in range(len(a)):
    if a[i].isalnum():
        ar += a[i]
s = int(input('Step'))
for i in range(s + 1, len(ar)):
    print (ar[i], ',', end='')
for i in range(s):
    print(ar[i], ',', end='')
print(ar[s])
