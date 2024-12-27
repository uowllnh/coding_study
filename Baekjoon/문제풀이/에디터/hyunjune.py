import sys
input = sys.stdin.read
data = input().strip().split('\n')
test_string = data[0]
commands = data[2:]  

left_stack = list(test_string)
right_stack = []

for command in commands:
    if command[0] == 'L' and left_stack:
        right_stack.append(left_stack.pop())
    elif command[0] == 'D' and right_stack:
        left_stack.append(right_stack.pop())
    elif command[0] == 'B' and left_stack:
        left_stack.pop()
    elif command[0] == 'P':
        left_stack.append(command[2])

print(''.join(left_stack + right_stack[::-1]))
