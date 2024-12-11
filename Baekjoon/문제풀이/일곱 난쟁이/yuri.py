dwarf_list = []
for i in range(9):  # 9명의 난쟁이 키 입력
    dwarf_list.append(int(input()))

total_sum = sum(dwarf_list)  # 전체 키의 합

found = False  # 찾았는지 여부
for i in range(9):
    for j in range(i + 1, 9):  # 중복되지 않도록 j는 i+1부터 시작
        if total_sum - (dwarf_list[i] + dwarf_list[j]) == 100:
            not_dwarf1 = dwarf_list[i]
            not_dwarf2 = dwarf_list[j]
            found = True
            break
    if found:
        break

# 두 난쟁이를 제외
dwarf_list.remove(not_dwarf1)
dwarf_list.remove(not_dwarf2)

# 결과 정렬 및 출력
dwarf_list.sort()
for height in dwarf_list:
    print(height)
