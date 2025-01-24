# nCr =          n!
#         { (n-r)! * r ! }
# 분모, 분자에서 각각 2와 5의 지수를 각각 구해주고 빼주기
# 그리고 2와 5의 지수 중 더 작은 값이 0의 개수

 
def cnt2(n):
    two = 0
    while n != 0:
        n = n//2
        two += n
    return two

def cnt5(n):
    five = 0
    while n != 0:
        n = n//5
        five += n
    return five

n, m = map(int,input().split())

two_cnt = cnt2(n) - cnt2(n-m) - cnt2(m)
five_cnt = cnt5(n) - cnt5(n-m) - cnt5(m)

print(min(two_cnt, five_cnt))
