n,b = map(int, input().split())
s = ''
num = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"

while n:
    s += str(num[n%b])
    n //= b

print(s[::-1])
