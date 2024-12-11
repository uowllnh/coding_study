# 테스트 케이스 개수 입력받기
t = int(input())
results = [] #테스트 케이스 결과 초기화

# 각 테스트 케이스 처리
for _ in range(t):
    input()  # 빈 줄
    r, c = map(int, input().split())
    
    # 각줄 상태 입력받기
    grid = []
    for i in range(r):
        row = input() #각 줄 입력 후 변수 저장
        grid.append(row) #각 줄 상태 리스트에 넣기
    
    # 사탕 개수 세기
    candy_count = 0

    # 가로로 사탕 찾기 >o<
    for row in grid:
        for i in range(len(row) - 2):  # 한 행의 문자 3개씩 확인 / 각 줄의 총 개수 -2 (문자 3개 중 첫번째 문자를 기준으로 계산)
            if row[i] == '>' and row[i+1] == 'o' and row[i+2] == '<':
                candy_count += 1

    # 세로로 사탕 찾기 vo^
    for col in range(c): # 한 행 문자 수만큼까지 (가로)
        for row in range(r - 2):  # 한 세로 줄에서 문자 3개씩 확인 / 가로와 비슷한 방식으로 세로 줄 총 개수 -2 (문자 3개 중 첫번째 문자를 기준으로 계산)
            if grid[row][col] == 'v' and grid[row+1][col] == 'o' and grid[row+2][col] == '^':
                candy_count += 1

    # 결과 저장
    results.append(candy_count)

# 결과 출력
for result in results:
    print(result)
