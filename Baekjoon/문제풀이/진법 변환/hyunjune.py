import sys

N, B = sys.stdin.readline().split()
B = int(B)

result = 0
for i, digit in enumerate(N[::-1]):  
    if '0' <= digit <= '9': 
        value = int(digit)
    else:  
        value = ord(digit) - ord('A') + 10  

    result += value * (B ** i)

print(result)
