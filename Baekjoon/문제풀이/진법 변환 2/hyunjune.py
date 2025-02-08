import sys

N, B = map(int, sys.stdin.readline().split())

result = ""

while N > 0:
    N, remainder = divmod(N, B)  
    if remainder < 10:
        result += str(remainder)  
    else:
        result += chr(remainder - 10 + ord('A')) 

print(result[::-1])
