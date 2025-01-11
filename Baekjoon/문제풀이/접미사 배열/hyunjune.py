S = input()

suffixes = [S[i:] for i in range(len(S))]

suffixes.sort()

for i in suffixes:
    print(i)
