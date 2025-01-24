T = input()
ten = 0

if T == '0':
    print(0)
    exit()

for i in range(len(T), 0, -1):
    ten += int(T[i]) * (8 ** (len(T) - i - 1))

result = []
while ten >= 1:
    if ten % 2 == 0:
        result.append(0)
        ten //= 2
    elif ten % 2 == 1:
        result.append(1)
        ten //= 2
    elif ten == 1:
        result.append(1)
        break

print(''.join(map(str, result[::-1])))


# 이진수 변환 함수
T = input()

if T == '0':
    print(0)
else:
    print(bin(int(T, 8))[2:])
