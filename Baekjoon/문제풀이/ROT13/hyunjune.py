T = input()
result = []

for char in T:
    
    if 'A' <= char <= 'Z':
        rotated = chr((ord(char) - ord('A') + 13) % 26 + ord('A'))
        result.append(rotated)
    
    elif 'a' <= char <= 'z':
        rotated = chr((ord(char) - ord('a') + 13) % 26 + ord('a'))
        result.append(rotated)
   
    else:
        result.append(char)

print(''.join(result))
