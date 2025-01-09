import sys

for line in sys.stdin:
    line = line.rstrip()
    lowercase = sum(c.islower() for c in line)
    uppercase = sum(c.isupper() for c in line)
    digits = sum(c.isdigit() for c in line)
    spaces = line.count(' ')

    print(lowercase, uppercase, digits, spaces)
