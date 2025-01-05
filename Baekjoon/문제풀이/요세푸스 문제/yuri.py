#재귀함수 이용하면 되..나?


result=[]
command = list(map(int, input().split()))
people:int=command[0]
sub:int=command[1]
josephus=list(range(0,people))


crt = 0
for _ in range(people):
    crt += sub

    while crt > people:
       remaind = crt - people
       result.append(josephus[remaind])
       crt=remaind

    result.append(josephus[crt-1])

print(result)
