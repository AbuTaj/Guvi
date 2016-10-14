# Created on 14-Oct-2016
# @author: AbuTaj
a = input()
s = a.split(',')
s1 = list(s)
n = input()
if s1.__contains__(n):
    print('Found')
else:
    print('Not Found')
