# queue.put(x) - 큐에 x삽입
# queue.get() - 큐에서 데이터 삭제후 반환
# q.queue[0] / q.queue[-1] - 큐 맨앞/맨뒤 데이터값 반환
# q.empty() - 큐에 원소가 없으면 true, 있으면 false
# q.qsize - 큐 원소 개수 확인

from collections import deque
import sys

def main(command, queue):
    if command.startswith('push'):
        _, x = command.split()  # push와 x 분리
        queue.append(int(x))
    elif command == 'pop':
        return queue.popleft() if queue else -1
    elif command == 'size':
        return len(queue)
    elif command == 'empty':
        return 1 if not queue else 0
    elif command == 'front':
        return queue[0] if queue else -1
    elif command == 'back':
        return queue[-1] if queue else -1

n = int(input().strip())
input = sys.stdin.read
commands = input().strip().split('\n')
queue = deque()

results = []
for command in commands:
    result = main(command, queue)
    if result is not None:
        results.append(result)

print("\n".join(map(str, results)))
