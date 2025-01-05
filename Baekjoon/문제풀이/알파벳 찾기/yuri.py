input_str = input()
positions = [-1] * 26  # 모든 위치를 -1로 초기화

for i, ch in enumerate(input_str):
    idx = ord(ch) - ord('a') # 아스키 코드로 변환해서 인덱스 값 알아내기
    if positions[idx] == -1:
        positions[idx] = i  # 알파벳 처음 등장 위치 저장

print(" ".join(map(str, positions)))  # 결과 출력
