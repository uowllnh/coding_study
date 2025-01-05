import sys

s = sys.stdin.read().strip()
result = []
temp = []
inside_tag = False

for c in s:
    if c == '<':
        if temp:
            result.append(''.join(reversed(temp)))
            temp = []
        inside_tag = True
        result.append(c)
    elif c == '>':
        inside_tag = False
        result.append(c)
    elif inside_tag:
        result.append(c)
    elif c == ' ':
        result.append(''.join(reversed(temp)))
        result.append(c)
        temp = []
    else:
        temp.append(c)

if temp:
    result.append(''.join(reversed(temp)))

print(''.join(result))
