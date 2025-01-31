import sys
import math

def find_primes(limit):
    primes = [True] * (limit + 1)
    primes[0] = primes[1] = False  

    for i in range(2, int(math.sqrt(limit)) + 1):
        if primes[i]:  
            for j in range(i * i, limit + 1, i):
                primes[j] = False  

    return primes

MAX_N = 1000000
is_prime = find_primes(MAX_N)

input = sys.stdin.read
data = input().split()
test_cases = map(int, data) 

for T in test_cases:
    count = 0
    for i in range(3, T // 2 + 1): 
        if is_prime[i] and is_prime[T - i]:  
            count += 1  
    print(count)
