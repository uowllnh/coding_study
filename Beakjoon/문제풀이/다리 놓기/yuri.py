import math

T = int(input())  # 테스트 케이스 개수
all_list = []

for _ in range(T):
    N, M = map(int, input().split())
    if N > M:  # N이 M보다 크면, 입력을 다시 받는 것이 아니라 스왑
        N, M = M, N
    all_list.append((N, M))  # 각 케이스의 N과 M을 튜플로 저장

for t in range(T):
    N, M = all_list[t]  # N, M 가져오기
    # 조합 계산: mCn
    com = math.comb(M, N)
    print(com)
