# Created on 03-Sep-2016
# @author: AbuTaj
n = int(input('Enter N'))
n2 = 2 * n
for i in range(1, n2):
    print('Day', i)
    for j in range(0, 1):
        if(i != j):
            if i + 1 > 9 or j + 1 > 9 or i > 9 or j > 9:
                i = 0
                j = 0
        print(i, i + 1, j, j + 1)
