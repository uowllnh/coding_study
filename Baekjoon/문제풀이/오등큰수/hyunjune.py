import sys
from collections import Counter

input = sys.stdin.read
data = list(map(int, input().split()))
T = data[0]  
arr = data[1:] 

distinct_arr = Counter(arr)

result = [-1] * T
stack = []

for i in range(T):
    while stack and distinct_arr[arr[stack[-1]]] < distinct_arr[arr[i]]:
        result[stack.pop()] = arr[i]
    stack.append(i)

# 결과 출력
print(' '.join(map(str, result)))
