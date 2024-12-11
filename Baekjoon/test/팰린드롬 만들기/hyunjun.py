# 첫째 줄에 문자열 S가 주어진다. S는 알파벳 소문자로만 이루어져 있고, 길이는 최대 50이다.
# 첫째 줄에 만들 수 있는 가장 짧은 팰린드롬의 길이를 출력한다.

import sys

S = sys.stdin.readline().strip()

for i in range(len(S)):
    if S[i:] == S[i:][::-1]:
        print(len(S) + i)
