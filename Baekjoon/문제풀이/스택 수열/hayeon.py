import sys
input = sys.stdin.readline

n = int(input("n 입력: "))

class stack:
    def __init__(self):  # 스택 객체 생성
        self.items = []

    def push(self, item):  # 스택 요소 추가 push(.append())
        self.items.append(item)

    def pop(self):  # 스택 맨 뒤 요소 삭제하고 리턴 pop()
        return self.items.pop()

    def peek(self):  # 스택 맨 뒤 요소 리턴
        return self.items[-1]

    def isEmpty(self):  # 스택이 비었는지 확인(비었으면 True 리턴)
        return not self.items

stk = stack()

숫자를 확인하고 그 숫자보다 같거나 작은 수 모두 작은순으로 입력
....