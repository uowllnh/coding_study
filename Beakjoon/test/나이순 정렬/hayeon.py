# 1. 유저 리스트를 나이(공백)이름 으로 받아와 리스트에 저장
# 2. 나이 순, 나이가 같으면 가입한 순으로 한 줄에 한 명씩 나이와 이름을 공백으로 정렬
# 3. 출력

import sys

# 유저 리스트
user = []
i = 0 # 가입 순

for access in sys.stdin:
    age, name = access.split()
    user.append((int(age), name, i))
    i += 1  

# 정렬함수 - 나이, 가입 순
user.sort(key=lambda x: (x[0], x[2]))

# 정렬된 값 출력
for age, name, _ in user:
    print(age, name)
