s = input() 
alphabet = 'abcdefghijklmnopqrstuvwxyz' 
result = []

for char in alphabet:
    result.append(str(s.find(char))) 

print(' '.join(result))
