s = input()
alphabet = 'abcdefghijklmnopqrstuvwxyz'  
result = []

for char in alphabet:
    result.append(s.count(char))  

print(' '.join(map(str, result)))  
