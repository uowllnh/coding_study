#sys.stdin.readLine()을 사용하면 대량의 입력을 처리할 때
#속도가 빠르고 공백 처리에도 유리 -> 런타임 에러 해결
#import sys
#input  = sys.stdin.readline

#입력값을 한번에 받아서 int형으로 저장
#운동시간,최소(초기),최대,증가,감소
N,m,M,T,R = map(int, input().split())

#운동을 시작할 수 없으면 -1
if m+T > M :
  print(-1)
else :
  pulse = m #맥박
  Ntime = 0 #운동횟수
  result = 0

  while Ntime < N :
    if pulse+T <= M :
      pulse += T
      Ntime += 1
    else :
      pulse -= R
      if pulse < m :
        pulse = m

    result +=1

  print(result)