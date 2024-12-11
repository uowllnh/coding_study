A, B, C = map(int, input().split())
I, J, K = map(int, input().split())

#최대 칵테일의 양
max = min(A/I, B/J, C/K)

orange = A - max * I
apple = B - max * J
pineapple = C - max * K

print(orange, apple, pineapple)