# 1. 체스판 첫번째줄만 리스트 생성   -> [0 1 0 1 0 1 0 1]
#     흰 :0, 검: 1 
# 2. '.' : 빈칸, 'F': 말 있음
# 3. 'F'가 있는 칸 파악 후 리스트 값이 0인 칸의 갯수 출력

chess = [0,1,0,1,0,1,0,1]

state = []
print("체스판 상태 입력('.' : 빈칸, 'F': 말 있음): ")
for _ in range(8) :
    row = input()
    state.append(row)

cnt = 0
for i,row in enumerate(state) :
    for j, blank in enumerate(row) :
        if blank == 'F' and chess[j] ==0 :
            cnt += 1

print(cnt)