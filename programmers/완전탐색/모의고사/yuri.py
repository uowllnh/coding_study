def solution(answers):
    answer = []  /문제를 가장 많이 맞춘 사람을 담을 배열
    ans1 = [1,2,3,4,5] /5 반복
    ans2 = [2,1,2,3,2,4,2,5] /8 반복
    ans3 = [3,3,1,1,2,2,4,4,5,5] /10 반복
    
    math_length = answers.length
    
    crt_ans1=ans1*(math_length // ans1.length)
    Remainder1=math_length % ans1.length
        
    if Remainder1 !=0:
        ans1.append(ans1[0:Remainder1-1])
        
        
    crt_ans2=ans2*(math_length // ans2.length)
    Remainder2=math_length % ans2.length
        
    if Remainder2 !=0:
        ans2.append(ans2[0:Remainder2-1])
        
        
    crt_ans3=ans3*(math_length // ans3.length)
    Remainder3=math_length % ans3.length
        
    if Remainder3 !=0:
        ans3.append(ans3[0:Remainder3-1])
        
    
    int ans==1
    if ans==1:
        int crt_num==1:
        while crt_num <= math_length
            if answers[crt_num]==crt_ans1[crt_num]:
                correct_1 +=1
                crt_num+=1
            
            elif answers[crt_num]==crt_ans2[crt_num]:
                correct_2 +=1
                crt_num+=1
                    
            elif answers[crt_num]==crt_ans3[crt_num]:
                correct_3 +=1
                crt_num+=1
            else :
                 crt_num+=1
    

    return answer
