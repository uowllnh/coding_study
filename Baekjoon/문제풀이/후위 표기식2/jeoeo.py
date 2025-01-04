import sys

input = sys.stdin.read
data = input().split()
N = int(data[0]) 
postfix = data[1] 
values = list(map(int, data[2:2+N]))


stack = []

for c in postfix:
    if c.isalpha():
        stack.append(values[ord(c) - ord('A')])
    else: 
        b = stack.pop()
        a = stack.pop()
        if c == '+':
            stack.append(a + b)
        elif c == '-':
            stack.append(a - b)
        elif c == '*':
            stack.append(a * b)
        elif c == '/':
            stack.append(a / b)

print(f"{stack.pop():.2f}")
