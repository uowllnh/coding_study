import sys

def gcd(a, b):
    if b == 0:
        return a
    else:
        return gcd(b, a % b)

N, S = map(int, sys.stdin.readline().split())
A = list(map(int, sys.stdin.readline().split()))

for i in range(N):
    A[i] = abs(S - A[i])
answer = A[0]
for i in range(1, N):
    answer = gcd(answer, A[i])

print(answer)