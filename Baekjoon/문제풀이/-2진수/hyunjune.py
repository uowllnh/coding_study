T = int(input())

if T == 0:
    print(0)
else:
    result = []
    while T != 0:
        temp = T % -2
        T //= -2

        if temp < 0:
            temp += 2
            T += 1
        
        result.append(str(temp))
    
    print(''.join(result[::-1]))
