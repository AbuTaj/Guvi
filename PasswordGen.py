# Created on 14-Oct-2016
# @author: AbuTaj
a = input()
b = input()
s = ''
s1 = ''
if len(b) > len(a):
    s += a
    for i in range(1, (len(b) - len(a)) + 1):
        s += str(i)
if len(a) > len(b):
    s += b
    for i in range(1, (len(a) - len(b)) + 1):
        s += str(i)
for i in range(len(s)):
    if len(a) < len(b):
        s1 += s[i]
        s1 += b[i]
    if len(a) > len(b):
        s1 += s[i]
        s1 += a[i]
print(s1)
