
num = input()
num : int
dic = {}

i=0
while (i < num or i == num) :
    i = i+1
    age, name = input().split(' ')
    dic [name] = age

    if i > num:
        break

print(dic)
