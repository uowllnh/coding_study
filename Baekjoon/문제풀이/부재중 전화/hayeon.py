# N: 총 노래 곡 수
# L: 모든 노래 길이
# 노래와 노래 사이 5초의 공백 존재
# D: D초에 한번씩 1초동안 전화벨 울림

# 총 노래 길이: L*N + (N-1)*5
# L+D+(song-1)초를 D로 나눴을 경우 0이 되는 시간을 구하기  // song=현재 듣고 있는 노래 순서 

n, l, d = map(int,input("N, L, D 입력: ").split())

if not (1 <= n <= 20 and 1 <= l <= 180 and 1 <= d <= 20):
    print("범위 초과")
else:
    total_time = n * l + (n - 1) * 5

    time = 0
    song = 1

    while time <= total_time:
        song_start = (song - 1) * (l + 5)
        song_end = song_start + l

        if song_start <= time < song_end:
            pass
        else:
            print(time)
            break

        time += d
        if time >= song_end and song < n:
            song += 1

    else:
        print(time)
