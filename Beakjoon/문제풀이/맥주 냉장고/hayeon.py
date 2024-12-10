# 만들 냉장고 : a * b * c
# n개의 맥주 박스 -> 1*1*1인 정육면체
# 입력: n(냉장고 용량)

# (n의 약수들로 이루어진 곱) = n 이 되는 것중 a,b,c의 겉넓이의 최솟값 구하기

# 겉넓이 : (a*b + b*c + a*c) * 2

import sys
input = sys.stdin.readline

n = int(input().strip())

min_surface = float('inf')
optimal_a, optimal_b, optimal_c = 0, 0, 0

# 겉넓이
def surface_area(a, b, c):
    return 2 * (a * b + b * c + a * c)

for a in range(1, int(n**0.5) + 1): 
    if n % a == 0:
        for b in range(a, n // a + 1):
            if (n // a) % b == 0:
                c = n // (a*b)
                current_surface = surface_area(a, b, c)
                if current_surface < min_surface:  # 최소값
                    min_surface = current_surface
                    optimal_a, optimal_b, optimal_c = a, b, c

print(optimal_a, optimal_b, optimal_c)
