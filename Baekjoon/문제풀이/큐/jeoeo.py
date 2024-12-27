import sys

input = sys.stdin.read
lines = input().splitlines()

queue = []
result = []

for line in lines[1:]:
    command = line.split()

    if command[0] == "push":
        queue.append(int(command[1]))
    elif command[0] == "pop":
        result.append(queue.pop(0) if queue else -1) 
    elif command[0] == "size":
        result.append(len(queue)) 
    elif command[0] == "empty":
        result.append(0 if queue else 1) 
    elif command[0] == "front":
        result.append(queue[0] if queue else -1)  
    elif command[0] == "back":
        result.append(queue[-1] if queue else -1)

print("\n".join(map(str, result)))
