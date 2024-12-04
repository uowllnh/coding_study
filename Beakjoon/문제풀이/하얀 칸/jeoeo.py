board = []

for _ in range(8):
  line = input().strip()
  board.append(line)
   
count = 0
for i in range(8) :
  for j in range(8) :
    if (i+j) % 2 == 0 and board[i][j] == 'F':
      count += 1

print(count)


#코드 오류는 없으나 입력값 제대로 처리안됨