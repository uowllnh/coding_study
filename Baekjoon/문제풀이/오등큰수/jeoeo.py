import sys
input = sys.stdin.read

data = input().split()
N = int(data[0])
A = list(map(int, data[1:]))

freq = [0] * 1000001
for num in A:
    freq[num] += 1

result = [-1] * N
stack = []

for i in range(N):
    while stack and freq[A[stack[-1]]] < freq[A[i]]:
        result[stack.pop()] = A[i]
    stack.append(i)

sys.stdout.write(' '.join(map(str, result)) + '\n')
