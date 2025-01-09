
result_list=[]

while True:
    try:
        result=[0,0,0,0]
        str=list(input())

        for a in str:
            if 97<=ord(a)<=122:
                result[0]+=1

            elif 65<=ord(a)<=90:
                result[1]+=1

            elif ord(a)==32:
                result[3]+=1
                
            else:
                result[2]+=1
            
        print(result)
    except:
        break
