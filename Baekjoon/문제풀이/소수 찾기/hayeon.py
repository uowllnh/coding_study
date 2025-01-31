def is_prime(num):
    if num < 2:
        return False
    for i in range(2, int(num ** 0.5) +1):
        if num % i == 0:
            return False
    return True

n = int(input())
nums = []

for _ in range(n):
    num = int(input())
    nums.append(num)

cnt = 0
for num in nums:
    if is_prime(num):
        cnt+=1

print(cnt)
