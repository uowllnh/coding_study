import sys
input = sys.stdin.read

data = input().split()
for s in data[1:]:
    count = 0
    is_vps = True
    for char in s:
        if char == '(':
            count += 1
        elif char == ')':
            count -= 1
        if count < 0:
            is_vps = False
            break
    if count == 0 and is_vps:
        print("YES")
    else:
        print("NO")
