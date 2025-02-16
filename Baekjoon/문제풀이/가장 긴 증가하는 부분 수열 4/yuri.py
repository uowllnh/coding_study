n = int(input())
arr = list(map(int, input().split()))
dp = [1] * n
prev = [-1] * n

for i in range(n):
    for j in range(i):
        if arr[j] < arr[i] and dp[i] < dp[j] + 1:
            dp[i] = dp[j] + 1
            prev[i] = j

max_idx = dp.index(max(dp))
seq = []
while max_idx != -1:
    seq.append(arr[max_idx])
    max_idx = prev[max_idx]

print(len(seq))
print(*seq[::-1])
