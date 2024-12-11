import sys

input = sys.stdin.read
S = input().strip()
N = len(S)

R, C = 0, 0

for i in range(1, int(N**0.5) + 1):
    if N % i == 0:
        if i <= N:
            R, C = N // i, i

lst = [S[i * C : (i + 1) * C] for i in range(R)]
message = []

for c in range(C):
    for r in range(R):
        message.append(lst[r][c])

print(''.join(message))
