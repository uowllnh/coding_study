# 1. 문자 s 입력받은 후 list로 저장
# 2. '<'와 '>' 사이에 있는 문자는 뒤집지 않고 그대로 출력
# 3. '<' 전에 있는 문자끼리, '>' 뒤에 있는 문자끼리 뒤집기 실행
# 4. 공백은 그대로 출력

import sys
input = sys.stdin.readline

s = input().strip()

result = []  
temp = [] 
in_tag = False

for char in s:
    if char == '<': 
        if temp: 
            result.extend(temp[::-1]) 
            temp = []
        in_tag = True
        result.append(char)  
    elif char == '>':
        in_tag = False
        result.append(char) 
    elif in_tag:
        result.append(char) 
    elif char == ' ':
        if temp: 
            result.extend(temp[::-1])  
            temp = [] 
        result.append(char)  
    else: 
        temp.append(char)

if temp:
    result.extend(temp[::-1])

print("".join(result))
