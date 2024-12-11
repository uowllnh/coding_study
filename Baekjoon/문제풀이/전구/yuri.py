# 전구의 개수 N, 명령어 개수 M
N, M = map(int, input().split())
N_list = list(map(int, input().split()))  # 초기 전구 상태 리스트로 저장

# 전체 명령 리스트
cmd_list = []

for _ in range(M):
    cmd = list(map(int, input().split()))
    cmd_list.append(cmd)

# 명령 처리
for i in range(len(cmd_list)):
    if cmd_list[i][0] == 1:  # 특정 전구 상태 변경
        N_list[cmd_list[i][1] - 1] = cmd_list[i][2]
    elif cmd_list[i][0] == 2:  # 범위 반전
        N_list[cmd_list[i][1] - 1:cmd_list[i][2]] = [
            1 - x for x in N_list[cmd_list[i][1] - 1:cmd_list[i][2]]
        ]
    elif cmd_list[i][0] == 3:  # 범위에서 1을 0으로 변경
        N_list[cmd_list[i][1] - 1:cmd_list[i][2]] = [
            0 if x == 1 else x for x in N_list[cmd_list[i][1] - 1:cmd_list[i][2]]
        ]
    elif cmd_list[i][0] == 4:  # 범위에서 0을 1로 변경
        N_list[cmd_list[i][1] - 1:cmd_list[i][2]] = [
            1 if x == 0 else x for x in N_list[cmd_list[i][1] - 1:cmd_list[i][2]]
        ]

print(*N_list)  # 최종 전구 상태 출력
