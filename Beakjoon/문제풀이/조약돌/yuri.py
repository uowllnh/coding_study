import math

dot=0
# 입력받기
while dot <= 0 or dot > 500_000_000:
   dot = int(input())

if  dot == 1:
    print(4)  # 조약돌 하나는 1x1 정사각형, 둘레는 4
else:
    width = int(math.isqrt(dot))  # 가장 큰 정사각형의 한 변 (가로) 길이
    remainder = dot - (width ** 2)  # 남은 조약돌 개수

    # 정사각형일 경우
    if remainder == 0:
        print(4 * (width-1))
    else:
        # 남은 조약돌로 최소 높이 계산
        height = math.ceil(dot / width)  # 전체 dot를 width로 나눈 세로 길이
        # 둘레를 계산하여 출력
        print(2 * (width + height-2))
