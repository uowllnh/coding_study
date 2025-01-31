a, b = map(int, input().split())

m = int(input())

a_digits = list(map(int, input().split()))

# A진법 -> 10진법 변환
value = 0
for digit in a_digits:
    value = value * a + digit

# 10진법 -> B진법 변환
b_digits = []
while value > 0:
    b_digits.append(value % b)
    value //= b

# 변환된 B진법 숫자는 역순이므로 뒤집어서 출력
print(*b_digits[::-1])
