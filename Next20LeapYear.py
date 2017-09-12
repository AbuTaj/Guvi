'''
Created on 12-Sep-2017
@author: AbuTaj
'''
from datetime import date
ye = str(date.today())
year = ye.split('-')
cur = int(year[0])
for i in range(20):
    cur += 1
    if(cur % 4 == 0):
        print(cur)
