
## 운동 선택 시 T 추가 (맥시멈 M)
## 휴식 선택 시 R 감소 (미니멈 m)
## 운동을 N분 하는 데에 필요한 시간 최솟값 계산
## 최솟값이므로 운동을 최대한 많이, 휴식을 적게 취해야 함
## 운동시간 N, 최소맥박 m, 최대맥박 M, 맥박 증가수 T, 맥박 감소수 R 한번에 입력

# 입력 받기
N, m, M, T, R = map(int, input().split())

# 현재 운동 시간과 소요 시간 초기화
Crt_N = 0  # 현재 운동 시간
Crt_t = 0  # 현재 소모 시간
Crt_m = m  # 현재 맥박수

# 운동이 불가능한 경우
if m + T > M:
    print(-1)
else:
    while Crt_N < N:
        if Crt_m + T <= M:
            Crt_m += T  # 운동으로 맥박 증가
            Crt_N += 1  # 운동 시간 증가
            
            
        else:
            Crt_m = max(m, Crt_m - R)  # 휴식으로 맥박 감소, 최소 m까지
        Crt_t += 1  # 시간 경과 
    print(Crt_t)
