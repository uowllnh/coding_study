import sys
from collections import deque

n, k = map(int, input().split())

circle = deque([i for i in range(1, n + 1)])

res = []
for _ in range(n): 
    for _ in range(k - 1): 
        circle.append(circle.popleft())
    res.append(str(circle.popleft()))

print('<' + ', '.join(res) + '>')
