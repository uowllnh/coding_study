import sys

left = list(sys.stdin.readline().strip())
right = []

for _ in range(int(sys.stdin.readline())):
  word = sys.stdin.readline().split()

  if word[0] == 'L' and left:
    right.append(left.pop())
  
  elif word[0] == 'D' and right:
    left.append(right.pop())
  
  elif word[0] =='B' and left:
    left.pop()
  
  elif word[0] == 'P':
    left.append(word[1])

answer = left + right[::-1]
print(''.join(answer))