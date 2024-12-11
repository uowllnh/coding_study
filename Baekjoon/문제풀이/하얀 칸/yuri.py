

#체스판 칸은 총 64칸, 그 중 흰색 32칸 / 검은색 32칸
# 0*0은 흰색 / 0*1은 검은색이므로 유추했을 때 두 수의 합이 0포함 짝수는 흰색 / 홀수는 검은색임을 알 수 있음
#0부터 시작한다고 가정한다면 0.0 ~ 7.7이다.
#총 8줄을 입력받고, 한줄씩 검사하는 방식 사용

i=0
count=0
for i in range(8):
    i+=1
    if i%2==1:
        string=input()
        last = 0
        for i in range(8):
            idx = string.find('f',last)
            if idx >= 0 & idx%2==0:
                count+=1
                last=idx+1
            else :
                break
    else :
        string=input()
        last = 0
        for i in range(8):
            idx = string.find('f',last)
            if idx >= 0 & idx%2==1:
                count+=1 
                last=idx+1
            else :
                break
        
print(count)

##아직 제대로 못풀어서 수정 예정ㅠ
