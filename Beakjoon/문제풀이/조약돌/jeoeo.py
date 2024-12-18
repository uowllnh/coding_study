import math

N = int(input())
min_perimeter = float('inf')  # 최소 둘레를 매우 큰 값으로 초기화

# a * b >= N을 만족해야 하므로 N의 약수를 이용하여 최소 둘레 계산
for i in range(1, int(math.sqrt(N)) + 1):
    if N % i == 0:  # i가 N의 약수라면
        a = i
        b = N // i
        perimeter = 2 * (a + b)
        # 최소 둘레로 갱신, min()을 사용하여 작은 값 찾기
        min_perimeter = min(min_perimeter, perimeter)

print(min_perimeter)