import re

def L(str, num):
    if str.find("△")==-1:
       cursor = num - 1
       str = str[0:cursor-1]+"△"+str[cursor:]

    elif str.find("△")==0:
       return
    
    else:
        now_cursor = str.find("△")
        cursor = now_cursor - 1
        re.sub("△", "", str)
        str = str[0:cursor-1]+"△"+str[cursor:]

    

def D(str, num):
    if str.find("△")==-1 or str.find("△")==0:
       cursor = num
    
    else:
        now_cursor = str.find("△")
        cursor = now_cursor + 1
        re.sub("△", "", str)
        str = str[0:cursor]+"△"+str[cursor+1:]


def B(str, num):
   if str.find("△")==-1:
       str = str[0:num-1]
       cursor = num-1

   elif str.find("△")==0:
       return
    
   else:
        now_cursor = str.find("△")
        cursor = now_cursor - 1
        str = str[0:now_cursor-2]+"△"+str[now_cursor:]

def P(str, num, text):
   if str.find("△")==-1:
       str = str + text + "△"
       cursor = num+1

   elif str.find("△")==0:
       str = text + str
       cursor = 1
    
   else:
        now_cursor = str.find("△")
        cursor = now_cursor + 1
        str = str[0:now_cursor-1]+text+str[now_cursor:]

      

   str = input()
   T = int(input())  # 테스트 케이스 개수

   for _ in range(T):
       command = input()

       if command == D:
           D(str,len(str)-1)
      
       elif command == L:
            L(str,len(str)-1)

       elif command == B:
            B(str,len(str)-1)

       else:
            if str.find("P")==-1:
               "해당 명령어는 존재하지 않음"
            else:
               text=str.split()[1]
               P(str, len(str)-1, text)

   print(str)     
