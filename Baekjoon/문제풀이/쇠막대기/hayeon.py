parentheses = list(input().strip())
stk = []
cnt = 0 

for i in range(len(parentheses)):
    if parentheses[i] == "(":
        stk.append("(")
    else :
        if parentheses[i-1]=="(":
            stk.pop()
            cnt+=len(stk) 
        else :
            stk.pop()
            cnt+=1 

print(cnt)
