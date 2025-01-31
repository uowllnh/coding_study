import sys

def sieve(limit):
    is_prime = [True] * (limit + 1)
    is_prime[0] = is_prime[1] = False  # 0과 1은 소수가 아님
    for i in range(2, int(limit**0.5) + 1):
        if is_prime[i]:
            for j in range(i * i, limit + 1, i):
                is_prime[j] = False
    return is_prime

def goldbach(n, primes):
    for a in range(3, n // 2 + 1, 2):  # 작은 값부터 탐색
        b = n - a
        if primes[a] and primes[b]:  # 둘 다 소수인지 확인
            return a, b
    return None

# 에라토스테네스의 체를 사용하여 소수 판별 배열 생성
LIMIT = 1000000
primes = sieve(LIMIT)

# 입력을 한 줄씩 받으며 처리
while True:
    n = int(input())  # 한 줄씩 입력 받기
    if n == 0:
        print("0")  # 0을 입력하면 종료 후 0 출력
        break
    
    result = goldbach(n, primes)
    
    if result:
        a, b = result
        print(f"{n} = {a} + {b}")
    else:
        print("Goldbach's conjecture is wrong.")
