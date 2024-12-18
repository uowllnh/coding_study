# 1, 아홉난쟁이의 키의 값 입력
# 2. 그중 7개의 숫자를 경우의 수(조합)을 이용하여 합이 100인 경우 찾아내어 오름차순으로 출력

import itertools

height= list(map(int, input("아홉 난쟁이의 키 입력: ").split()))
# itertools.combinations(height,7)

seven=[]
for comb in itertools.combinations(height, 7):
    if sum(comb) == 100:
        seven = sorted(comb)
        break

print(seven)
