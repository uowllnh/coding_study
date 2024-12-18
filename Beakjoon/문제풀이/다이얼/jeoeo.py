def calculate_dial_time(word):
    total_time = 0

    for c in word:
        if c in 'ABC':
            total_time += 3  # A, B, C -> 3초
        elif c in 'DEF':
            total_time += 4  # D, E, F -> 4초
        elif c in 'GHI':
            total_time += 5  # G, H, I -> 5초
        elif c in 'JKL':
            total_time += 6  # J, K, L -> 6초
        elif c in 'MNO':
            total_time += 7  # M, N, O -> 7초
        elif c in 'PQRS':
            total_time += 8  # P, Q, R, S -> 8초
        elif c in 'TUV':
            total_time += 9  # T, U, V -> 9초
        elif c in 'WXYZ':
            total_time += 10 # W, X, Y, Z -> 10초

    return total_time

word = input()

print(calculate_dial_time(word))
