s = input().strip() 
counts = [0] * 26 

for char in s:
    index = "abcdefghijklmnopqrstuvwxyz".index(char)  
    counts[index] += 1

print(' '.join(map(str, counts)))
