# Created on 14-Oct-2016
# @author: AbuTaj
import math
n = input()
n1 = n.split(',')
s = ''
for i in range(len(n1)):
    for j in range(1, len(n1)):
        if n1[i] == n1[j]:
            a = math.fabs(i - j)
            if a > 0:
                s += str(int(a)) + " "
s1 = s.split(" ")
s1.sort()
print('Min=', (int(s1[1]) - 1), 'Max=', (int(s1[len(s1) - 1]) - 1))
