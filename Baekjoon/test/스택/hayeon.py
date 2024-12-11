# push X: 정수 X를 스택에 넣는 연산이다.
# pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
# size: 스택에 들어있는 정수의 개수를 출력한다.
# empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
# top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.

import sys

# 입력받기
n = int(sys.stdin.readline())

stack = []

for _ in range(n):
    # 공백으로 분리
    st = sys.stdin.readline().split() 

    if st[0] == 'push':
        stack.append(st[1])
    elif st[0] == 'pop':
        if len(stack) > 0: 
            print(stack.pop())
        else: 
            print(-1)
    elif st[0] == 'size':
        print(len(stack))
    elif st[0] == 'empty':
        if len(stack) == 0: 
            print(1)
        else: 
            print(0)
    elif st[0] == 'top':
        if len(stack) > 0: 
            print(stack[-1])
        else: 
            print(-1)
