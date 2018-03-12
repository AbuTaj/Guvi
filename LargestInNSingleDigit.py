arr=[]
size = int(input('Enter the value of N'))
for i in range(size):
  arr.insert(i,input())
arr.sort(reverse=True)
string = ''.join(arr)
print(string)
