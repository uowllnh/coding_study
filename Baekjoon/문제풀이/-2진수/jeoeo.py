N = int(input())

if N == 0:
    print("0")
else:
    result = []
    while N != 0:
        remainder = N % -2
        N = N // -2
        
        if remainder < 0:
            remainder += 2
            N += 1
        
        result.append(str(remainder))
    
    print("".join(result[::-1]))