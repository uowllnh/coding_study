n = int(input()) # 피연산자 개수
postfix = input() # 후위 표기식
values = [int(input()) for _ in range(n)]  # 변수 값 입력, 정수 변환

stack = []
for ch in postfix:
    if ch.isalpha():
        stack.append(values[ord(ch) - ord('A')])  # 아스키 코드 값으로 변환해서 빼기 / A=65 
                                                  # A부터 순서대로 변수 선언하기 때문에 A값을 빼면 변수가 입력된 리스트에서의 인덱스 값을 구할 수 있음
    else:
        b = stack.pop()
        a = stack.pop()
        if ch == '+':
            stack.append(a + b)  # 덧셈
        elif ch == '-':
            stack.append(a - b)  # 뺄셈
        elif ch == '*':
            stack.append(a * b)  # 곱셈
        elif ch == '/':
            stack.append(a / b)  # 나눗셈

print(f"{stack[0]:.2f}")  # 결과 출력
