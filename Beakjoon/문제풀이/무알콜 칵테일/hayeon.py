# A: 오렌지 주스
# B: 사과 주스
# C: 파인애플 주스
# I: 오렌지 주스 비율
# J: 사과 주스 비율
# K: 파인애플 주스 비율

# 오렌지 주스 : A*I(I+J+K)
# 사과 주스 : B*J(I+J+K)
# 파인애플 주스 : C*K(I+J+K)

# 만들 수 있는 최대 칵테일 수 : total

a, b, c = map(int, input("오렌지, 사과, 파인애플 용량을 차례로 입력 (1 ≤ A, B, C ≤ 500): ").split())
i, j, k = map(int, input("오렌지, 사과, 파인애플 비율을 차례로 입력 (1 ≤ I, J, K ≤ 50): ").split())

if not (1 <= a <= 500 and 1 <= b <= 500 and 1 <= c <= 500):
    print("오렌지, 사과, 파인애플 용량은 1 이상 500 이하의 값을 입력해야 합니다.")
    exit()

if not (1 <= i <= 50 and 1 <= j <= 50 and 1 <= k <= 50):
    print("오렌지, 사과, 파인애플 비율은 1 이상 50 이하의 값을 입력해야 합니다.")
    exit()

# 최대 칵테일 수 계산
total = min(a // i, b // j, c // k)

# 남는 재료 계산
remain_a = a - total * i
remain_b = b - total * j
remain_c = c - total * k

print(remain_a, remain_b, remain_c)
