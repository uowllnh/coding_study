# 정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.

# 명령은 총 다섯 가지이다.
# push X: 정수 X를 스택에 넣는 연산이다.
# pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
# size: 스택에 들어있는 정수의 개수를 출력한다.
# empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
# top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.

import sys

# 첫번째 줄을 입력받아 명령의 갯수를 파악
commands = sys.stdin.readline()
# 스택 정의
stack = []
# 명령에 도움을 줄 리스트 생성
lst = []

for _ in ragne(commands):
    lst = sys.stdin.readline().split()
    if lst[0] == "push":
        stack.append(lst[1])
    elif lst[0] == "pop":
        if len(stack) == 0:
            print(-1)
        else:
            stack.pop()
    elif lst[0] == "empty":
        if len(stack) == 0:
            print(1)
        else:
            print(0)
    elif lst[0] == "top":
        if len(stack) == 0:
            print(-1)
        else:
            print(stack[0])
