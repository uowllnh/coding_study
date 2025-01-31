import sys

def prime(n):
    if n < 2:
        return False
    for i in range(2, int(n ** 0.5) + 1):
        if n % i == 0:
            return False
    return True

input_list = []

while True:
    num = int(sys.stdin.readline().strip())
    if num == 0:
        break
    input_list.append(num)

result_list = []

for a in input_list:
    found = False
    for n in range(2, a // 2 + 1):
        if prime(n) and prime(a - n):
            result_list.append(f"{a} = {n} + {a - n}")
            found = True
            break
        
    if not found:
        result_list.append(f"No representation found for {a}")

# 결과 출력
for res in result_list:
    print(res)
