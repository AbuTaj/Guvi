'''
Created on Jan 3, 2017

@author: Abu Taj
'''
n = int(input())
for k in range(n):
  for i in range(2):
    for j in range(n):
      print('*', end='')
    print(' ', end='')
  print()
  n -= 1
