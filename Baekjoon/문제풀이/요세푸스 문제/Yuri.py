
def L(str):
    if  str.find("△")>0:
        now_cursor = str.find("△")
        cursor = now_cursor - 1
        str = str.replace("△", "")
        str = str[0:cursor]+"△"+str[cursor:]
        return str, cursor

    else:
       cursor = 0
       return str,cursor

def D(str, num):
    if str.find("△")==0:
       cursor = num
    
    else:
        now_cursor = str.find("△")
        cursor = now_cursor + 1
        str = str.replace("△", "")
        str = str[0:cursor]+"△"+str[cursor:]
        return str, cursor


def B(str, num):
   if str.find("△")==0:
       return str, num
    
   else:
        now_cursor = str.find("△")
        cursor = now_cursor - 1
        str = str.replace("△", "")
        str = str[0:now_cursor-1]+"△"+str[now_cursor:]
        return str, cursor

def P(str, num, text):
    if str.find("△")==0:
       str = text + str
       cursor = 1
       return str, cursor
    
    else:
        now_cursor = str.find("△")
        cursor = now_cursor + 1
        str = str.replace("△", "")
        str = str[0:now_cursor]+text+"△"+str[now_cursor:]
        return str, cursor

    
    
str = input() + "△"
T = int(input())  # 테스트 케이스 개수

for _ in range(T):
       
       command = input().split()
       if command[0] == 'D':
           str, cursor =D(str,len(str)-1)
      
       elif command[0] == "L":
            str, cursor = L(str)

       elif command[0] == "B":
            str, cursor = B(str,len(str)-1)

       elif command[0] == "P":
            text = command[1]
            str, cursor = P(str,len(str)-1,text)
       else:
            print("해당 명령어는 존재하지 않음")
            

print(str.replace("△", ""))     
