# 약수 구하는 함수
def find_divisors(n):
    divisors = []   
    for i in range(1, int(n**0.5) + 1): #제곱근에서 소수점 버린 정수까지 (반 나눔)
        if n % i == 0: #나머지 없는 수 = 약수
            divisors.append(i)
            if i != n // i:  # 대칭되는 약수 추가
                divisors.append(n // i)
    divisors.sort()  # 오름차순 정렬
    return divisors

# 메시지 입력받기
message = input()
N = len(message) # 메세지 글자 수를 길이 변수에 넣음

# 약수 구해서 R과 C 찾기
#이 함수가 있는 이유 = 여러개가 있을 경우 r이 가장 큰 것으로 선택해야하기 떄문이다.

divisors = find_divisors(N) # 입력 받은 길이로 함수 사용
R, C = 0, 0 #초기값 설정
for r in divisors: # 약수 리스트가 범위
    c = N // r # 임시 c 값 = 길이 값 / 약수 리스트 요소 값의 몫
    if r <= c:  # 조건 R 가로 <= C 세로
        R, C = r, c 
        
# 메시지를 칸에 넣는 과정 / 넣을 땐 왼쪽 세로부터, 읽을 땐 맨위 가로부터
real_message = []
index = 0
for i in range(R): #가로 길이만큼 반복한다
    real_message.append(message[index:index + C]) #세로 길이만큼 잘라서 왼쪽부터 넣음 
    index += C #세로 길이만큼 인덱스 더하기

# 가로로 메세지 읽기
result = "" #빈 문자열 생성
for i in range(C): #세로만큼 반복
    for j in range(R): #가로만큼 반복
        result += real_message[j][i] # ex) [1][0] = 첫째줄의 두번째 글자

# 결과 출력
print(result)
