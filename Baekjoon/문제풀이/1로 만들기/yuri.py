def one(num):
 num = num - 1
 return num

def two(num):
 if num % 2 != 0:
  value = False
  return value
 else:
  num = num / 2
  value = True
  return num

def three(num):
 if num % 3 != 0:
   value = False
   return value
 else:
  num = num / 3
  value = True
  return num

num = int(input())

if type(three(num-1)) == int:
 #미완성ㅠ
