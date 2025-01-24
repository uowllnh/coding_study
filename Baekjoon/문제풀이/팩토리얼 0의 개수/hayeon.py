from math import factorial

n = int(input())
cnt = 0

for zero in str(factorial(n))[::-1]:
    if zero != '0':
        break
    cnt += 1
    
print(cnt)
