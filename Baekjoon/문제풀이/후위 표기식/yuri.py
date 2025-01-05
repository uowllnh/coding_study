input_str = input()
result = []
stack = []

for ch in input_str:
    if ch.isalpha():
        result.append(ch)  # 알파벳은 결과 리스트에 바로 추가
    elif ch == '(':
        stack.append(ch)  # 여는 괄호는 스택에 추가
    elif ch == ')':
        while stack and stack[-1] != '(':
            result.append(stack.pop())  # 여는 괄호가 나올 때까지 팝
        stack.pop()  # 여는 괄호 제거
    else:
        while stack and stack[-1] in "*/+-" and "*/".find(stack[-1]) >= "*/".find(ch):
            result.append(stack.pop())  # 우선순위 높은 연산자 제거
        stack.append(ch)  # 현재 연산자 추가

while stack:
    result.append(stack.pop())  # 남은 연산자 추가

print("".join(result))
