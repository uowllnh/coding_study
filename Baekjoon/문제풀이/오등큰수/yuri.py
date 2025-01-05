# 입력 받기
num = int(input())
num_list = input().split()
dupl_list = [int(i) for i in num_list]

# 숫자와 빈도수를 저장
element_list = [[0, 0] for _ in range(num)]
for j, a in enumerate(dupl_list):
    element_list[j][0] = a  # 숫자
    element_list[j][1] = dupl_list.count(a)  # 빈도수

# 결과 리스트
result = []

# 오등큰수 찾기
for i in range(num):
    found = False
    for j in range(i + 1, num):
        if dupl_list[i] != element_list[j][0] and element_list[i][1] < element_list[j][1]:
            result.append(element_list[j][0])
            found = True
            break
    if not found:
        result.append(-1)

# 결과 출력
print(" ".join(map(str, result)))
