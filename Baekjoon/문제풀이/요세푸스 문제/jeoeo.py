import sys
from collections import deque

input = sys.stdin.read
N, K = map(int, input().strip().split())

def josephus(N, K):
    queue = deque(range(1, N + 1)) 
    result = []

    while queue:
        queue.rotate(-(K - 1)) 
        result.append(queue.popleft())  

    print("<" + ", ".join(map(str, result)) + ">")

josephus(N, K)
