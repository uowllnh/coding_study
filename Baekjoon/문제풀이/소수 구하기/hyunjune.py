import math

def find_decimal(n):
    decimal_lst = [True for _ in range(n + 1)]
    decimal_lst[0] = decimal_lst[1] = False
    for i in range(2, int(math.sqrt(n)) + 1):
        if decimal_lst:
            decimal_lst[i*i:n+1:i] = [False] * ((n - i * i) // i + 1)
    return decimal_lst

m, n = map(int, input().split())
lst = find_decimal(n)
cnt = 0
for i in range(m, n + 1):
    if lst[i]:
        print(i)
