import sys

T = int(sys.stdin.readline())
input = sys.stdin.read
data = list(map(int, input().split()))
result = [-1] * T

for i in range(T-1):
    for j in range(i+1, T):
        if data[i] < data[j]:
            result[i] = data[j]
            break
print(' '.join(map(str, result)))


import sys

T = int(sys.stdin.readline())
input = sys.stdin.read

data = list(map(int, input().split()))
result = [-1] * T
stack = []

for i in range(T):
    while stack and data[stack[-1]] < data[i]:
        result[stack.pop()] = data[i]
    stack.append(i)

print(' '.join(map(str, result)))
