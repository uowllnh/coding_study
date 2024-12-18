# k층 n호
# k >= 1
# 1<= n <=14
# 0층 i호엔 i명 거주

# 문제의 조건대로라면 모든 층의 1호는 1명, 2호는 3부터 1씩 증가
# 1층 이상의 k층 n호에 사는 사람 수 계산 식 : a[k][n-1] + a[k-1][n]

import sys
input = sys.stdin.read
data = input().split()

T = int(data[0])
index = 1  # 입력 데이터 읽기 위한 인덱스

results = []  # 각 테스트 케이스의 결과를 저장할 리스트

for _ in range(T):  # 테스트 케이스 수만큼 반복
    k = int(data[index])  # 층 수
    n = int(data[index + 1])  # 호 수
    index += 2
    
    # 0층 n호 수 까지의 사람 수 
    floors = [[i for i in range(n + 1)]]
    
    for floor in range(1, k + 1):  
        want_floor = [0] * (n + 1)  # 현재 층의 사람 수를 저장할 리스트 초기화
        # 각 호수별 사람 수 계산
        for j in range(1, n + 1):
            want_floor[j] = want_floor[j - 1] + floors[floor - 1][j]
        floors.append(want_floor)
    
    results.append(floors[k][n])

for result in results:
    print(result)
