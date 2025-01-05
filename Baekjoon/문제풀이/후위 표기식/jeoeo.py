def postfix(infix):
    rank = {'+': 1, '-': 1, '*': 2, '/': 2, '(': 0}  
    stack = [] 
    result = [] 

    for char in infix:
        if char.isalpha():  
            result.append(char)
        elif char == '(': 
            stack.append(char)
        elif char == ')':  
            while stack and stack[-1] != '(':
                result.append(stack.pop())
            stack.pop() 
        else: 
            while stack and rank[stack[-1]] >= rank[char]:
                result.append(stack.pop())
            stack.append(char)

   
    while stack:
        result.append(stack.pop())

    return ''.join(result)


infix = input().strip()  
print(postfix(infix))  
