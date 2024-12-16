#단어 순서 변경 불가, 알파벳으로만 이루어짐
#테스트 케이스 먼저 받고 -> 단어 쭉 입력, 반대로 나와야하니 스택을 사용하면 된다!

def push(stack, data):
        stack.append(data)

def pop(stack):
    if stack[-1] == 0:
         print("stack is empty")
    else:
            stack.pop()
    
def peek(stack):
    print(stack[-1])


T=int(input())
list = []
for _ in range(T):
    text=input()
    text_list=text.split()
    string = []
    for n in text_list:
        n = n[::-1]
        for i in n:
            push(string,i)
        push(string,' ')
    reverse_str= ''.join(string)
    list.append(reverse_str)
str='\n'.join(list)
print(str)
