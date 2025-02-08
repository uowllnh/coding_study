n = int(input())
res = ''
if n==0:
    print(0)
    exit()
    
while n!=0:
    if n%(-2)!=0:
        res +='1'
        # -2로 나누어 떨어지지 않는 경우 몫을 구하기 위해 1을 더함
        n=n//(-2)+1
    else:
        res +='0'
        n=n//(-2)

print(res[::-1])
