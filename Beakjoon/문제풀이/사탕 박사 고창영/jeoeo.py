import sys

T = int(sys.stdin.readline())

for _ in range(T):
    sys.stdin.readline() # 빈 줄 처리
    A = [] # 사탕 박스 저장할 리스트
    count = 0
    r, c = map(int, sys.stdin.readline().split())

    # 각 행 입력받기
    for _ in range(r):
        A.append(sys.stdin.readline())

    # j는 c-2까지 반복 -> c-2는 j+2가 배열을 벗어나지 않도록 함
    for i in range(r):
        for j in range(c-2):
            if A[i][j] == '>' and A[i][j+1] == 'o' and A[i][j+2] == '<':
                count += 1

    # i는 r-2까지 반복 -> i+2가 배열을 벗어나지 않도록 함
    for i in range(r-2):
        for j in range(c):
            if A[i][j] == 'v' and A[i+1][j] == 'o' and A[i+2][j] == '^':
                count += 1
                
    print(count)