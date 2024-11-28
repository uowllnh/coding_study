# 온라인 저지에 가입한 사람들의 나이와 이름이 가입한 순서대로 주어진다. 
# 이때, 회원들을 나이가 증가하는 순으로, 나이가 같으면 먼저 가입한 사람이 앞에 오는 순서로 정렬하는 프로그램을 작성하시오.
# 첫째 줄에 온라인 저지 회원의 수 N이 주어진다. (1 ≤ N ≤ 100,000)
import sys
# 첫째 줄로 입력받는 회원 수를 변수에 저장 
num_member = sys.stdin.readline()
# 정렬할 user 리스트를 정의
user = []
# 회원 수만큼 반복되는 for 문을 통해 이중 리스트로 user 안에 저장
for i in range(num_member):
    age, name = input().split()
    user.append([int(age),name])

# for 문을 수행하면 user 리스트 자동 정렬, 그 후 print 문으로 출력
for i in sorted(user,key=lambda x : x[0]):
    print(i[0],i[1])