# 1 : 전구가 켜져있는 상태 
# 0 : 전구가 꺼져있는 상태

# 1번 명령어 [i x] : i번째 전구의 상태를 x로 변경
# 2번 명령어 [l r] : l번째부터 r번째까지의 전구 상태 변경(킴->끔, 끔->킴)
# 3번 명령어 [l r] : l번째부터 r번째까지의 전구 끔
# 4번 명령어 [l r] : l번째부터 r번째까지의 전구 킴

# 1. 전구개수 N , 명령어의 개수 M 
# 2. N의 현재 상태 S
# 3. M+2번째 줄까지 (a,b,c) a: 명령어 , [b c]: a=1일 경우 [i x] / a=2,3,4 일 경우 [l r]

n ,m =map(int, input("n과 m 입력: ").split())
s= list(map(int,input("s 상태 입력: ").split()))

for _ in range(m) :
    a,b,c = map(int,input("a,b,c 입력: ").split())

    if a == 1 :
        s[b-1] = c
    elif a == 2 :
        for i in range(b-1, c):
            if s[i] == 1 :
                s[i] = 0
            else :
                s[i] = 1
    
    elif a == 3 :
        for i in range(b-1,c) :
            s[i] = 0

    elif a == 4 :
        for i in range(b-1,c) :
            s[i] = 1

for i in range(n) :
    print(s[i])
