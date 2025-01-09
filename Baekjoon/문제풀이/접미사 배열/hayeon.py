text = input().strip()
suffixes =[]

for i in range(len(text)):
    suffixes.append(text[i:])
suffixes.sort()

for suffix in suffixes:
    print(suffix)
