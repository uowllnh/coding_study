# 치킨 쿠폰 n장  chicken
# 도장 k개 -> 치킨 쿠폰 1장   stamp
# 1 < k ≤ n ≤ 1,000,000,000
# 처음 가지고 있는 치킨 쿠폰 + 도장으로 바뀐 n/k + .. 누적

import sys
input = sys.stdin.readline

lines = []
while True:
    line = input().strip()
    if line == "":
        break
    lines.append(line)

for i, line in enumerate(lines, start=1):
    try:
        n, k = map(int, line.split())
        chicken = n + (n//k) 
        # 도장갯수가 k보다 적을때까지 실행
        while n>= k:
        	# 쿠폰사용으로 얻은 도장으로 구매한 치킨 + 사용못한 남은 도장
            n = (n//k) + (n%k) 
            chicken += n//k # 도장->쿠폰 치킨 구매
        print(chicken)
    except Exception as e:
        print("다시 입력해주세요.")
        break