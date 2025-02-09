

def factorial(n):
    N = 1
    for i in range(2,n+1):
        N *= i
    if n == 0:
        N = 0
    return N

def combin(n,r):
    C = int(factorial(n) / (factorial(r) * factorial(n-r)))
    return C

num = int(input())
count = 1 # 가로 타일을 뽑지 않는 경우의 수 미리 누적

for a in range(2, num + 1, 2):
    count += combin(num , a)

print(count)
