import math

n, s = map(int, input().split())
locs = list(map(int, input().split())) 
diffs = []

for loc in locs:
    diffs.append(abs(s - loc))

result = diffs[0]
for diff in diffs[1:]:
    result = math.gcd(result, diff)

print(result) 
