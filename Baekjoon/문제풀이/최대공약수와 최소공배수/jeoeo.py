a, b = map(int, input().split())

def max(a, b):
    while b > 0:
        a, b = b, a % b
        
    return a

def min(a, b):
    return a * b // max(a, b)

print(max(a, b))
print(min(a, b))