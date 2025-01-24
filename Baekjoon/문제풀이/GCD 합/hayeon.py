import sys
import math
n=int(input())

for i in range(n):
    num = list(map(int, sys.stdin.readline().split()))
    sum = 0
    for j in range(1,len(num)):
        for k in range(j+1,len(num)):
            sum += math.gcd(num[j],num[k])

    print(sum)
