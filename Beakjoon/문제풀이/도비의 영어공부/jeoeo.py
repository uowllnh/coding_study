while True:
    input_str = input()

    if input_str == "#":
        break

    # 공백을 기준으로 알파벳과 문장 분리
    parts = input_str.split(" ", 1)
    a = parts[0].lower()
    b = parts[1].lower()

    count = 0
    for char in b:
        if char == a:
            count += 1

    # f-string을 사용한 문자열 포매팅
    print(f"{a} {count}")
