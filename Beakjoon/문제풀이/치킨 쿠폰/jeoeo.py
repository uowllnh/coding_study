import sys

while True:
    try:
        N, K = map(int, sys.stdin.readline().split())
        
        chicken = N #처음 치킨 수 = 쿠폰 수

        #쿠폰을 교활할 수 있을 때까지 반복
        while True:
            if N // K == 0:
                break

            chicken += N // K
            N = (N // K) + N % K

        print(chicken)
    except:
        break