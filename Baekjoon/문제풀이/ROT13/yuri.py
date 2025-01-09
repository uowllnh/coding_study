Str = input().split()
result = []

for a in range(len(Str)):

    j = 0
    list_str = list(Str[a])
    text = list_str[j]

    for _ in range(len(Str[a])):

        if 65 <= ord(text) <= 90 or 97 <= ord(text) <= 122:
                    
                    if 90 < ord(list_str[j]) + 13 < 104 or 122 < ord(list_str[j]) + 13:
                        i = chr(ord(list_str[j]) - 13)
                        result.append(i)
            
                    else:
                        i = chr(ord(list_str[j]) + 13)
                        result.append(i)
                
            
        else:
            result.append(list_str[j])

        j+=1

    result.append(" ")

print(''.join(result))
        
