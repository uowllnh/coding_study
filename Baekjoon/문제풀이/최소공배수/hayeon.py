import math 

def lcm(a,b):
    return a*b // math.gcd(a,b)

t = int(input())

for _ in range(t):
    a,b = map(int, input().split())
    print(lcm(a,b))
