n = int(input())

dp = [0 for _ in range(n)]
dp[0] = 1
dp[1] = 1
dp[2] = 2

for i in range(3, n):
    dp[i] = dp[i-1] + dp[i-2]

print(dp[n-1])
