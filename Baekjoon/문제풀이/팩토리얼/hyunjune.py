T = int(input())
if T == 0 or T == 1:
    print(1)
else:
    answer = 1
    for i in range(2, T+1):
        answer *= i
    print(answer)
