import sys

num = 1000000009

def onetwothree():
    
    dp = [[0] * 4 for _ in range(100001)]

    dp[1][1] = 1  
    dp[2][2] = 1 
    dp[3][1] = 1 
    dp[3][2] = 1 
    dp[3][3] = 1  

    for i in range(4, 100001):
        dp[i][1] = (dp[i-1][2] + dp[i-1][3]) % num
        dp[i][2] = (dp[i-2][1] + dp[i-2][3]) % num
        dp[i][3] = (dp[i-3][1] + dp[i-3][2]) % num

    return dp

def ans():
    dp = onetwothree()
    t = int(sys.stdin.readline().strip())

    for _ in range(t):
        n = int(sys.stdin.readline().strip())
        print((dp[n][1] + dp[n][2] + dp[n][3]) % num)

if __name__ == "__main__":
    ans()