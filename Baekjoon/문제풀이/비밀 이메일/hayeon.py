# N 글자에서 최대한 정사각형과 가까운 R,C를 구한다 
# R,C는 N의 약수
# R<C
# 입력값을 세로로 입력-> 가로로 출력

import sys
msg = sys.stdin.readline().strip() 

if not msg.islower():
    print("소문자로만 입력 가능")
    sys.exit()
if len(msg) > 100:
    print("최대 100글자만 가능")
    sys.exit()

n = len(msg)
r,c = 0,0

for r in range(1,int(n**0.5)+1):
    if n % r == 0:
        r,c=r, n//r

# r*c인 2차원 배열
arr = [[0 for _ in range(c)] for _ in range(r)]

idx = 0

#c방향으로 문자 체우기
for col in range(c):
    for row in range(r):
        arr[row][col] = msg[idx]
        idx+=1
        
for i in range(r):
    print(''.join(arr[i]), end = '')
