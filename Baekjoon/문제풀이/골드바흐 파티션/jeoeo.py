import sys

limit = 1000000
is_prime = [True] * (limit + 1)
is_prime[0] = is_prime[1] = False

for i in range(2, int(limit ** 0.5) + 1):
    if is_prime[i]:
        for j in range(i * i, limit + 1, i):
            is_prime[j] = False

T = int(sys.stdin.readline().strip())
for _ in range(T):
    N = int(sys.stdin.readline().strip())
    count = 0
    for i in range(2, N // 2 + 1):
        if is_prime[i] and is_prime[N - i]:
            count += 1
    print(count)
