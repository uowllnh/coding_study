num = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ" 

n, b = input().split() 
answer = 0 
for i, j in enumerate(n[::-1]): 
    answer += int(b) ** i * num.index(j) 
print(answer)  
