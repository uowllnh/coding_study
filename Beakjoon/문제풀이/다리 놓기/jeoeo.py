import math

T = int(input())

for _ in range(T):
    N, M = map(int, input().split())
    
    #math.comb(M, N) 함수는 M개 중에서 N개를 고르는 조합의 수를 계산
    result = math.comb(M, N)
    print(result)