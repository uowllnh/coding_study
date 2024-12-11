T = int(input())

for _ in range(T):
  k = int(input())
  n = int(input())

  # 0층 사람 수 초기화
  # n=3이라면 people = [1, 2, 3]
  people = [i for i in range(1, n+1)]

  # 현재 호수의 사람 수에, 바로 아래 호수까지의 사람 수를 더함
  for _ in range(k): # k번 반복, range는 k를 포함 X -> k-1층까지
    for i in range(1,n): # 각 층마다 1호부터 n호까지 계산
      people[i] += people[i-1] # i호 사람 수 = (i-1)호 사람 수 + i호 사람 수
  
  print(people[n-1])