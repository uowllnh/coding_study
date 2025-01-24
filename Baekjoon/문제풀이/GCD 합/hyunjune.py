from math import gcd

T = int(input())

for _ in range(T):
    nums = list(map(int, input().split()))[1:]
    sum = 0

    n = len(nums)
    for i in range(n):
        for j in range(i + 1, n):  
            sum += gcd(nums[i], nums[j])

    print(sum)
