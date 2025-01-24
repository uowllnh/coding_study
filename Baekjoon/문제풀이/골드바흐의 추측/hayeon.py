# 소수 구하는 방법
def is_prime(num):
    if num < 2:
        return False
    for i in range(2, int(num ** 0.5) +1):
        if num % i == 0:
            return False
    return True

def goldbach(n):
    a,b = n//2-1, n//2+1
    while a > 1:
        if is_prime(a) and is_prime(b):
            return a,b
        a-=2
        b+=2
    return None

t = int(input())

for _ in range(t):
    n = int(input())
    result = goldbach(n)

    if result:
        a, b= result
        print(f"{n} = {a} + {b}")
    else:
        print("Goldbach's conjecture is wrong.")
