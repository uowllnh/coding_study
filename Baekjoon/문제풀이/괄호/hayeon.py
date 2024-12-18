def is_vps(string):
    open = 0
    close = 0

    for char in string:
        if char == '(': 
            if close > 0:
                return "NO"
            open += 1
        elif char == ')':
            if open > 0:
                open -= 1
            else:
                return "NO"
    
    return "YES" if open == 0 else "NO"

T = int(input())
results = []

for _ in range(T):
    paren = input().strip()
    results.append(is_vps(paren))

for result in results:
    print(result)