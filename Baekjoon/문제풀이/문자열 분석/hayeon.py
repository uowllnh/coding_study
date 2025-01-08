while True:
    try:

        char = input()

        lower, upper, num, gap = 0, 0, 0, 0
        for i in char:
            if i.islower():
                lower += 1
            elif i.isupper():
                upper += 1
            elif i.isdigit():
                num += 1
            elif i.isspace():
                gap += 1

        print(lower, upper, num, gap)
    except EOFError:
        break
