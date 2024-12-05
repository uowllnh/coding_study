# 입력 받기
N, M = map(int, input().split())
bulbs = list(map(int, input().split()))

for _ in range(M):
    a, b, c = map(int, input().split())
    
    if a == 1:
        #b번째 전구를 c로 변경
        bulbs[b - 1] = c
    elif a == 2:
        #b번째부터 c번째까지 변경
        for i in range(b - 1, c):
            bulbs[i] = 1 - bulbs[i]
    elif a == 3:
        #b번째부터 c번째까지 끄기
        for i in range(b - 1, c):
            bulbs[i] = 0
    elif a == 4:
        #b번째부터 c번째까지 켜기
        for i in range(b - 1, c):
            bulbs[i] = 1

for bulb in bulbs:
    print(bulb, end=" ")