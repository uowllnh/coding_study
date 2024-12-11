# N = 조약돌 갯수
# l = 한변의 길이(line)
import sys
N = int(sys.stdin.readline())

if N == 1:
    print(4)
else:
    l = 0
    sum = 0
    while pow(l, 2) < N:
        l += 1
    if (l - 1) * l > N:
        sum = (l - 2 + l - 1) * 2
        print(sum)
    else:
        sum = (l - 1) * 4
        print(sum)
