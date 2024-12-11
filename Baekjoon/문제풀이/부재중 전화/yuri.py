N, L, D = map(int, input().split())

# 제한 조건 확인
while not (1 <= N <= 20 and 1 <= L <= 180 and 1 <= D <= 20):
    print("error")
    N, L, D = map(int, input().split())

# 전체 재생 시간 계산
total_time = N * (L + 5) - 5  # 마지막 노래 이후에는 조용한 구간 없음

Crt_D = 0  # 전화벨 초기 시간 설정

# 벨소리가 노래 중 들리지 않는 가장 빠른 시간 찾기
while Crt_D <= total_time:
    is_in_song = False
    for i in range(N):
        start_time = i * (L + 5)
        end_time = start_time + L
        if start_time <= Crt_D < end_time:  # 벨소리가 노래 재생 중
            is_in_song = True
            break
    if not is_in_song:  # 노래 중이 아니면 벨소리가 들림
        print(Crt_D)
        break
    Crt_D += D  # 벨소리 간격 추가

# 벨소리가 들리지 않았으면 앨범 끝 이후 출력
if Crt_D > total_time:
    print(Crt_D)
