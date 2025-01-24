def count_factors(n, factor):
    count = 0
    while n >= factor:
        count += n // factor
        n //= factor
    return count

n, m = map(int, input().split())

count_2 = count_factors(n, 2) - count_factors(m, 2) - count_factors(n - m, 2)
count_5 = count_factors(n, 5) - count_factors(m, 5) - count_factors(n - m, 5)

print(min(count_2, count_5))
