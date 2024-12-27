s = input().strip()
result = []
temp = []
inside_tag = False

for c in s:
    if c == '<':
        if temp:
            result.append(''.join(temp[::-1]))
            temp = []
        inside_tag = True
        result.append(c)
    elif c == '>':
        inside_tag = False
        result.append(c)
    elif inside_tag:
        result.append(c)
    elif c == ' ':
        result.append(''.join(temp[::-1]))
        result.append(c)
        temp = []
    else:
