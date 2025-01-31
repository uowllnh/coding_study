import sys

A, B = map(int, sys.stdin.readline().split())
m = int(sys.stdin.readline())
nums = list(map(int, sys.stdin.readline().split()))

sum_val = 0

for i in range(m):
    sum_val += nums[i] * (A ** (m - 1 - i))
