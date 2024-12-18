def is_vps(s):
    vps = 0
    for char in s:
        if char == '(':
            vps += 1
        else:
            vps -= 1
        if vps < 0: 
            return False
    return vps == 0


T = int(input())  
for _ in range(T):
    S = input()  
    print("YES" if is_vps(S) else "NO")