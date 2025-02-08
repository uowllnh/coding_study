def prime_factorization(n):
    div = 2
    while n > 1:
        while n % div == 0:
            print(div)
            n //= div
        div += 1

n = int(input())
if n != 1:
    prime_factorization(n)
