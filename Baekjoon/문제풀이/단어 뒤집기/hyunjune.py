import sys

# 테스트 케이스의 갯수를 입력받음
T = int(sys.stdin.readline())
# 테스트 케이스의 갯수만큼 이중 리스트를 만듬
sentence = [[] for _ in range(T)]
# 뒤집어서 저장할 리스트
reverse = []

# 리스트 안에 문장별로 담음
for i in range(T):
    sentence[i] = sys.stdin.readline().strip()

for i in range(T):
    # 매 줄마다 띄어쓰기를 기준으로 나눠서 단어만 정렬
    line = sentence[i].split()
    # 단어별로 역순으로 정렬하고 단어별로 공백을 주고 문장 형태로 저장
    reverse.append(" ".join([word[::-1] for word in line]))

for i in range(T):
    print(reverse[i])