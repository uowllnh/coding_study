import sys

MOD = 1_000_000_000

def stair_num(n):

    dp = [[0] * 10 for _ in range(n+1)]

    # 한 자리 숫자 지정해줌
    for i in range(1, 10):
        dp[1][i] = 1

    for i in range(2, n+1):
        for j in range(10):
            if j == 0: # 마지막 숫자가 0인 경우 1만 가능
                dp[i][j] = dp[i-1][1]
            elif j == 9: # 마지막 숫자가 9인 경우 8만 가능
                dp[i][j] = dp[i-1][8]
            else : # 나머지 숫자들은 이전 또는 이후 숫자가 모두 가능
                dp[i][j] = dp[i-1][j-1] + dp[i-1][j+1]

    return sum(dp[n]) % MOD

if __name__ == "__main__":
    t = int(sys.stdin.readline().strip())
    print(stair_num(t))
