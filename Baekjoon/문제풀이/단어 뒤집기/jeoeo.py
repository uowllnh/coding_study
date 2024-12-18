T = int(input())

for _ in range(T):
    sentence = input().split() 
    reversed_words = [] 
    
    for word in sentence:
        reversed_word = ''.join(reversed(word))
        reversed_words.append(reversed_word) 
    
    print(" ".join(reversed_words))
