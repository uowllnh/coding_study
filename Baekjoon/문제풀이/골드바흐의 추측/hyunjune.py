import sys
import math

def find_decimal(n):
    decimal_lst = [True for _ in range(n + 1)] 
    decimal_lst[0] = decimal_lst[1] = False

    for i in range(2, int(math.sqrt(n)) + 1):
        if decimal_lst[i]:
            decimal_lst[i * i : n + 1 : i] = [False] * ((n - i * i) // i + 1)

    return decimal_lst


decimal_lst = find_decimal(1000000)

while True:
    T = int(sys.stdin.readline().strip())

    if T == 0:
      break

    for i in range(3, T//2 + 1, 2):
        if decimal_lst[i] and decimal_lst[T-i]:
            print(f"{T} = {i} + {T-i}")
            break
        
    else:
        print("Goldbach's conjecture is wrong.")
