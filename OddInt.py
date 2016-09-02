# Created on 02-Sep-2016
# @author: AbuTaj
num1 = int(input('Start at'))
num2 = int(input('End at'))
for i in range(num1, num2 + 1):
    if i % 2 != 0:
        print(i)
