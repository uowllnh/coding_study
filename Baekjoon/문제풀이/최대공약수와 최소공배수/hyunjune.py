a, b = map(int, input().split())
num = a * b

if a > b:
    while b != 0:
        a, b = b, a % b

    print(a)   
    print(num // a) 
else:
    while a != 0:
        b, a = a, b % a
    print(b)
    print(num // b)
