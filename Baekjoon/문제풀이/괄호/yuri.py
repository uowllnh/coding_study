t = int(input())

for _ in range(t):
    stack = []
    is_valid = True
    brackets = input()
    
    for char in brackets:
        if char == "(":
            stack.append(char)
        elif char == ")":
            if stack:
                stack.pop()
            else:
                is_valid = False
                break
    
    if is_valid and not stack:
        print("YES")
    else:
        print("NO")
