def main():
    N, L, D = map(int, input().split())

    total_time = N * L + (N - 1) * 5
    answer = D
    
    # 노래의 구간을 순차적으로 확인하여 전화를 받을 수 있는 첫 번째 시간을 찾음
    while answer <= total_time:
        can_answer = True  # 전화벨을 받을 수 있는지 여부
        
        for i in range(N):
            start = i * (L + 5)       #시작 시간
            end = (i + 1) * L + i * 5 #끝 시간

            # 전화벨 시간이 노래 시간에 포함되면 전화를 받을 수 없음
            if start < answer < end:
                can_answer = False
                break
        
        if can_answer:
            print(answer)
            return
        
        # 다음 전화벨 울리는 시간으로 증가
        answer += D

    print(answer)

##코드 안됨