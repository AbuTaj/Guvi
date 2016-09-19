# Created on 19-Sep-2016
# @author: AbuTaj
s = input('Number')
p = 0
for i in range(len(s)):
    p += int(pow(int(s[i]), i))
print(p)
