from collections import deque
import sys

input = sys.stdin.read
data = input().split('\n')
N = int(data[0])
commands = data[1:N+1]
dq = deque()

result = []
for command in commands:
    if command.startswith("push_front"):
        _, x = command.split()
        dq.appendleft(int(x))
    elif command.startswith("push_back"):
        _, x = command.split()
        dq.append(int(x))
    elif command == "pop_front":
        result.append(str(dq.popleft() if dq else -1))
    elif command == "pop_back":
        result.append(str(dq.pop() if dq else -1))
    elif command == "size":
        result.append(str(len(dq)))
    elif command == "empty":
        result.append('1' if not dq else '0')
    elif command == "front":
        result.append(str(dq[0] if dq else -1))
    elif command == "back":
        result.append(str(dq[-1] if dq else -1))

print("\n".join(result))
