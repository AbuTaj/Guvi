# Created on 31-Oct-2016
# author: AbuTaj
s = input()
s1 = input()
n = 0
if s.__contains__(s1):
    n = s.index(s1)
    print(n)
else:
    print('-1')
