# 입력: 알파벳 소문자 하나, 문장(1~250)
# 입력의 마지막: # -> #이 입력되면 입력 종료

# 1. 입력 받기
# 2. 문장을 모두 소문자로 변경
# 3. 문장안에 입력받은 소문자의 갯수 세어 출력

import sys

input = sys.stdin.readline

lines = []

while True:
    line = input().strip()
    if line == "#":
        break
    lines.append(line)

for line in lines:
    try:
        # 입력을 공백 기준으로 분리
        parts = line.split(maxsplit=1)
        if len(parts) != 2:
            print("다시 입력하세요.")
            continue

        alpa, sent = parts
        # alpa 조건
        if len(alpa) != 1 or not alpa.islower():
            print("첫 번째 입력은 알파벳 소문자 1자리여야 합니다. 다시 입력하세요.")
            continue
        # 문장 조건
        if not (1 <= len(sent) <= 250):
            print("문장의 길이는 1~250자여야 합니다. 다시 입력하세요.")
            continue

        sent_lower = sent.lower()
        cnt = sent_lower.count(alpa)
        print(f"{alpa} {cnt}")

    except Exception as e:
        print(f"오류 발생: {e}")
        break

