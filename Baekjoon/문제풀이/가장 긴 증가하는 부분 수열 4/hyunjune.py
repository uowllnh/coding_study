n = int(input()) 
arr = list(map(int, input().split()))  

dp = [1] * n  
prev = [-1] * n  

for i in range(n):
    for j in range(i):
        if arr[j] < arr[i] and dp[i] < dp[j] + 1:  
            dp[i] = dp[j] + 1
            prev[i] = j  

max_len = max(dp)
index = dp.index(max_len)

lis_sequence = []
while index != -1:
    lis_sequence.append(arr[index])
    index = prev[index]

print(max_len)  
print(*reversed(lis_sequence))  
