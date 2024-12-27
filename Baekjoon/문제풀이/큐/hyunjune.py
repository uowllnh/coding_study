import sys
from collections import deque
input = sys.stdin.read

data = input().split('\n')
N = int(data[0])
queue = deque()
results = []

for i in range(1, N + 1):
    command = data[i].split()
    if command[0] == "push":
        queue.append(int(command[1]))
    elif command[0] == "pop":
        if not queue:
            results.append("-1")
        else:
            results.append(str(queue.popleft()))
    elif command[0] == "size":
        results.append(str(len(queue)))
    elif command[0] == "empty":
        results.append("1" if not queue else "0")
    elif command[0] == "front":
        results.append("-1" if not queue else str(queue[0]))
    elif command[0] == "back":
        results.append("-1" if not queue else str(queue[-1]))

print("\n".join(results))
