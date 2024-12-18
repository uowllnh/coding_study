## 입력을 여러개 받은 후, 2가지 케이스를 각각 출력해야 한다
## n의 합공식 (n*(n+1))/2 를 이용한다

def in_people(n):
       return (n*(n+1))//2

T = int(input())

k_L= []  # k 값 저장
n_L= []  # n 값 저장


for _ in range(T):
    k_L.append(int(input()))
    n_L.append(int(input()))

for i in range(T):
    crt_people=n_L[i]
    for _ in range(k_L[i]):
        crt_people=in_people(crt_people)
    print(crt_people)

for i in range(T):
     
     for j in range(k_L(i)):
         if j==0:
          floor_0 = []
          floor_0.append(i)

         else:
                 for a in range ()
                 sum(floor_{j})-floor_{j-1}[a]
                 globals()[f'floor_{j}'].append


## 진짜 개어려움 포기요,,ㅠ

#for i in range(T):
#    for j in range(1,n_L[i]):
  #      floor_0 = []
   #     floor_0.append(j)
##  for a in range(1,n_L[i]):
       # globals()[f'floor_{a}'].append(sum(floor_(a-1)))
