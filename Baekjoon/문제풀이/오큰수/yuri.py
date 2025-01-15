list=[]
result=[]
num=int(input())
list = input().split()
list = [int(i) for i in list]

for a in range(num):
    NGE=-1
    for j in range(num-a):
        if list[a]<list[j+a]:
            NGE=list[j+a]
            break
    result.append(NGE)

print(" ".join(map(str, result)))
