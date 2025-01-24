def get_factorial(n):
    answer = 1
    for i in range(2, n + 1):
        answer *= i
    return answer

T = int(input())
result = str(get_factorial(T))[::-1]
ans = 0
for i in range(len(result)):
    if result[i] == '0':
        ans += 1
    else:
        break

print(ans)
