import math

dot = int(input())
sqrt = math.sqrt(dot)

if sqrt.is_integer():
   print((sqrt-1)*4)

else:
        largest = int(sqrt)**2 
        result = dot - largest
    if result < sqrt-1:
