import sys
input = sys.stdin.readline

#테스트 케이스 입력
T = int(input().strip())

#결과 저장할 리스트 생성
results = [] 

for _ in range(T):
    sentence = input().strip()
    words = sentence.split() 
    rev = [word[::-1] for word in words] #단어 뒤집기
    result = ' '.join(rev) #뒤집은 단어를 다시 조인
    results.append(result)

print("\n".join(results))