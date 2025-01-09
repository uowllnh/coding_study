text = input().strip()
suffixes =[]

for i in range(len(text)):     #for i in range(input(text))
    suffixes.append(text[i:])
suffixes.sort()

for suffix in suffixes:
    print(suffix)
