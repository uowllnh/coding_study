import math
import sys

def find_decimal(n):
    decimal_lst = [True for _ in range(n + 1)]
    decimal_lst[0] = decimal_lst[1] = False
    for i in range(2, int(math.sqrt(n)) + 1):
        if decimal_lst[i]:
            decimal_lst[i*i:n+1:i] = [False] * ((n - i * i) // i + 1)
    return decimal_lst

data = list(map(int, sys.stdin.read().split()))
T = data[0]
lst = data[1:]
decimal_lst = find_decimal(max(lst))
cnt = 0
for i in lst:
    if decimal_lst[i]:
        cnt += 1

print(cnt)
