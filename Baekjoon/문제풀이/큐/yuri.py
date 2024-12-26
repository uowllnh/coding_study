#큐는 선입선출!!

T=int(input())
Queue=[]
for _ in range(T):
    command = input().split()
    
    if command[0]=="push":
        Queue.append(command[1])

    elif command[0]=="pop":
        if not Queue :
            print(-1)
        else:
            print(Queue[0])
            del Queue[0]

    elif command[0]=="size":
        print(len(Queue))

    elif command[0]=="empty":
        if not Queue :
            print(1)
        else :
            print(0)
    
    elif command[0]=="front":
        if not Queue :
            print(-1)
        else:
            print(Queue[0])

    else: #back 명령어일 경우
        if not Queue :
            print(-1)
        else:
            print(Queue[-1])