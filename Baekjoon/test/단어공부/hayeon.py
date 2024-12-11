# 1. 모든 알파벳 대문자로 변경
# 2. 리스트를 만들어 같은 문자끼리 모아둠
# 3. 리스트에 담긴 문자 갯수 확인
# 4. 리스트 길이가 긴 것이 2개이상이면 ?/ 아니면 해당 리스트 알파벳 출력

alpa = input("문자 입력:").upper()  #입력받은 문자 대문자로 변경
alpa_list = list(set(alpa))  #알파벳 리스트에 넣기
list = [] # 갯수확인할 리스트

for i in alpa_list : 
    count = alpa.count(i)
    list.append(count)

if list.count(max(list))>= 2 :
    print("?")
else : 
    print(alpa_list[list.index(max(list))])
