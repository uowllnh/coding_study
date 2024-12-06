# N:운동할 시간
# m:초기 맥박
# M:최대 맥박
# T:운동할 때 증가되는 맥박
# R:휴식때 감소되는 맥박

N, m, M, T, R = map(int, input("N, m, M, T, R 입력: ").split())

current_m = m 
exercise_time = 0 
total_time = 0 

if not (1 <= N <= 200 and 1 <= T <= 200 and 1 <= R <= 200 and 50 <= m <= M <= 200):
    print("범위 초과")
else:
    if m + T > M: 
        print(-1)
    else:
        while exercise_time < N:
            if current_m + T <= M:
                current_m += T
                exercise_time += 1
            else:
                current_m -= R
                if current_m < m: 
                    current_m = m
            total_time += 1 

        print(total_time)
