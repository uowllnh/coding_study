# 스택으로 생각하면
# 첫 출발: a_list.append(cursor) 
# L: pop + 커서 push
# D: pop 계속하다가 커서까지만 pop하고 한번 push + 커서 push + 나머지 push 
# B: 커서 나올때까지 pop + 한번 더 pop후 그 문자열 삭제 + 다시 차례로 push 
#    => a_list.pop() : 리스트의 맨 뒤에 요소를 꺼내고 리스트에서 삭제함
# P $: 커서까지 pop + $ push + 차례로 push

from collections import deque
import sys

def main(command, left, right):
    if command[0] == 'L' and left:
        right.append(left.pop())
    elif command[0] == 'D' and right:
        left.append(right.pop())
    elif command[0] == 'B' and left:
        left.pop()
    elif command[0] == 'P':
        left.append(command[1])

input = sys.stdin.read
data = input().splitlines()

left = list(data[0])
right = deque()
m = int(data[1])
commands = data[2:2 + m]

for command in commands:
    command = command.split()
    main(command, left, right)

print(''.join(left + list(right)))
