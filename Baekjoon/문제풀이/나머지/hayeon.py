a,b,c = map(int, input().split())

result1 = (a+b)%c
result2 = ((a%c) + (b%c))%c
result3 = (a*b)%c
result4 = ((a%c) * (b%c))%c

print(f"{result1} {result2} {result3} {result4}")
