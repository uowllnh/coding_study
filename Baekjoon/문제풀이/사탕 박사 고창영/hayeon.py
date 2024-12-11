# 1. > 를 찾아 오른쪽으로 0< 이 순서대로 오면 cnt+1
# 2. v 를 찾아 아래로 o^ 이 순서대로 오면 cnt+1

import sys
t = int(sys.stdin.readline())

for _ in range(t):
    sys.stdin.readline()
    candy = []
    cnt = 0
    r, c = map(int, sys.stdin.readline().split())
    
    for _ in range(r):
        candy.append(sys.stdin.readline())

    # > 를 찾아 오른쪽으로 0< 이 순서대로 오면 cnt+1
    for i in range(r):
        for j in range(c-2):
            if candy[i][j] == '>' and candy[i][j+1] == 'o' and candy[i][j+2] == '<':
                cnt += 1
                
    # v 를 찾아 아래로 o^ 이 순서대로 오면 cnt+1
    for i in range(r-2):
        for j in range(c):
            if candy[i][j] == 'v' and candy[i+1][j] == 'o' and candy[i+2][j] == '^':
                cnt += 1
    print(cnt)
