# 백준 1157번 파이썬 문제풀이
# 문자열을 입력받고 해당 문자열에서 가장 많이 사용된 문자를 도출하여 아래와 같이 출력.
# 단수개일 경우 해당 문자를 반환, 복수개일 경우 "?"를 출력하도록 설계
# 문자의 대소문자를 구분하지 않음. 

# upper나 반대 함수 사용하여 대소문자 중 하나로 통일.
word = input().upper()
# set함수를 이용해서 word에서 중복된 문자열을 제거하고 리스트로 변환.
word_lst = list(set(word)) 
# 빈 리스트를 하나 생성하고 리스트에 문자열의 index와 일치하게끔 하여 문자별 사용 빈도수를 저장.
num_lst = []

# word_list 안의 i(문자)별로 word 안에서 count하여 num에 저장
for i in word_list:
    num = word.count(i)
    num_lst.append(num)

# num_list 내의 max 값이 복수인지 아닌지 체크
if num_lst.count(max(num_lst)) >= 2:
    print("?")
else :
    print(word_lst[num_lst.index(max(num_lst))])
