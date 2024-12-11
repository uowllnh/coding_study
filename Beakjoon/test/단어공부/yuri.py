voca = input()
a = voca.lower()
for alpha in a:
    ascii_code = ord(alpha)
    list.append(ascii_code)

max = 0
max_i = 0


for i in set(list):
 if list.count(i) > max_i:
    max, max_i = i, list.count(i)
    else (list.count(i)=max_i) and (i!=max):
    print('?')

