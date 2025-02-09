def factorial(n):
    N = 1
    if n == 0:
        return N
    else:
        for i in range(2, n+1):
         N *= i
        return N

def combin(n,r):
    C = int(factorial(n) / (factorial(r) * factorial(n-r)))
    return C

def two(n):
    count = 0

    while n - 2 > 0:
        n -= 2
        count += 1

    return count
    


T = int(input())
result_list = []
for _ in range(T):
    number = int(input())
    result = 0

if 0 < number < 3:
    result = 1
    result_list.append(result)
    
elif 3 <= number < 6:
      for a in range(2): #3이 1번 들어갈 경우 / 0번
        two_max = two(number - 3 * a)

        for x in range(two_max + 1):
            result += factorial(number - 3 * a + 1 - 1 * x) / factorial(3 * a) * factorial (2 * x) * factorial (number - 3 * a - 2 * x)
      
      result_list.append(result)

elif 6 <= number < 9: #3이 2번 들어갈 경우 / 1번 / 0번
      for a in range(3):
        two_max = two(number - 3 * a)

        for x in range(two_max + 1):
            result += factorial(number - 3 * a + 1 - 1 * x) / factorial(3 * a) * factorial (2 * x) * factorial (number - 3 * a - 2 * x)
      result_list.append(result)

else: #10일 경우
    for a in range(4):
        two_max = two(number - 3 * a)

        for x in range(two_max + 1):
            result += factorial(number - 3 * a + 1 - 1 * x) / factorial(3 * a) * factorial (2 * x) * factorial (number - 3 * a - 2 * x)

    result_list.append(result)

print(result_list)



