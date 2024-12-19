import sys

input = sys.stdin.readline
n = int(input().strip())

stack = []
current = 1
result = []

for _ in range(n):
    value = int(input().strip())

    while current <= value:
        stack.append(current)
        result.append("+")
        current += 1

    if stack[-1] == value:
        stack.pop()
        result.append("-")
    else:
        print("NO")
        exit()

print("\n".join(result))
