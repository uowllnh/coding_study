text=input()
result=[]

for _ in range(len(text)):
    result.append(text)
    text=text[1:]

result=sorted(result, key=lambda x : x)

for i in result:
    print(i)
