import sys
import math

def is_prime(num):
    if num < 2:
        return False
    for i in range(2, int(math.sqrt(num)) + 1):
        if num % i == 0:
            return False
    return True

def goldbach(n):
    a, b = n // 2, n // 2
    while a > 1:
        if is_prime(a) and is_prime(b):
            return a, b
        a -= 1
        b += 1
    return None

input = sys.stdin.read
numbers = map(int, input().split())

for n in numbers:
    if n == 0:
        break
    result = goldbach(n)
    
    if result:
        a, b = result
        print(f"{n} = {a} + {b}")
    else:
        print("Goldbach's conjecture is wrong.")
