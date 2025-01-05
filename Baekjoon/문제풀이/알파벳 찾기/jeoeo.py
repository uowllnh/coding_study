s = input().strip() 
positions = [-1] * 26  

for i in range(len(s)):
    index = "abcdefghijklmnopqrstuvwxyz".index(s[i]) 
    if positions[index] == -1: 
        positions[index] = i

print(' '.join(map(str, positions)))
