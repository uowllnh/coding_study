def factorial(n):
    N = 1
    # 1부터 n까지 곱하기
    for i in range(2, n+1):
        N *= i
    # n이 0일 때 처리
    if n == 0:
        N = 0
    return N

def combin(n, r):
    # nCr = n! / (r! * (n-r)!)
    C = int(factorial(n) / (factorial(r) * factorial(n-r)))
    return C

# 입력
num = int(input())

# 초기값(2×2 블록을 전혀 사용하지 않는 경우) 누적
count = 1  

for i in range(2, num + 1, 2):
    count += combin(num, i)

# 결과 출력
print(count)
