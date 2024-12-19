n = int(input())
T = [int(input()) for _ in range(n)]

stack = []
result = []
now = 1

for i in T:
    while i >= now:
        stack.append(now)
        result.append('+')
        now += 1

    if stack[-1] == i:
        stack.pop()
        result.append('-')
    else:
        print('NO')
        break

else:
    print('\n'.join(result))