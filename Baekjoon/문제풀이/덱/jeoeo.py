import sys

input = sys.stdin.read
commands = input().splitlines()[1:]

deque = []
result = []

for command in commands:
    if "push_front" in command:
        deque.insert(0, int(command.split()[1]))
    elif "push_back" in command:
        deque.append(int(command.split()[1]))
    elif command == "pop_front":
        result.append(deque.pop(0) if deque else -1)
    elif command == "pop_back":
        result.append(deque.pop() if deque else -1)
    elif command == "size":
        result.append(len(deque))
    elif command == "empty":
        result.append(0 if deque else 1)
    elif command == "front":
        result.append(deque[0] if deque else -1)
    elif command == "back":
        result.append(deque[-1] if deque else -1)

print("\n".join(map(str, result)))
