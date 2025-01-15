input_str = input()
counts = [0] * 26  # 알파벳 개수 저장 배열 초기화

for ch in input_str:
    counts[ord(ch) - ord('a')] += 1  # 알파벳 위치에 따라 증가

print(" ".join(map(str, counts)))  # 결과 출력
