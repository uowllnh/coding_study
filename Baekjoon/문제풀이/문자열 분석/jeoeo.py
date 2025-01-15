N = int(input())

for _ in range(N):
    line = input().rstrip()
    lower = sum(c.islower() for c in line)
    upper = sum(c.isupper() for c in line)
    digit = sum(c.isdigit() for c in line)
    spaces = line.count(' ')

    print(lower, upper, digit, spaces)