import math

def find_optimal_box(n):
    W = float('inf')  # 초기값을 최대값으로 설정, float('int')는 무한대를 나타냄
    A, B, C = 0, 0, 0

    for a in range(1, int(n ** (1/3)) + 2):  # a는 1부터 세제곱근까지, range()는 끝 값을 포함하지 않으므로 +2
        if n % a == 0:
            for b in range(a, int(math.sqrt(n // a)) + 2): 
                if (n // a) % b == 0:  
                    c = n // (a * b)
                    surface_area = 2 * (a * b + b * c + a * c)  # 겉넓이 계산
                    if surface_area < W:  # 최소 겉넓이를 갱신
                        min_surface_area = surface_area
                        A, B, C = a, b, c
    
    return A, B, C

# 값 입력
n = int(input())

# 함수 호출
A, B, C = find_optimal_box(n)
print(A, B, C)
