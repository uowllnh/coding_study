# 입력받은 값을 토대로 체스판 생성
board = [input() for _ in range(8)]
# "F"값이 있으면 넣어줄 공간 초기화
white_cnt = 0

# 위에서부터 홀수 번째 줄에는 1, 3, 5, 7번 칸이 하얀색, 짝수 번째 줄에는 2, 4, 6, 8번 칸이 하얀색
# index를 사용해 보드판의 하얀 칸의 "F" 갯수 구하기

for i in range(8):
    for j in range(8):
        if i % 2 == j % 2 and board[i][j] == "F":
            white_cnt += 1

print(white_cnt)

