def main():
    correct = True
    result = []

    c2 = input().strip()

    while True:
        c1 = c2
        c2 = input().strip()

        if c2 == '#':
            if c1 == '#':
                break
            else:
                if correct:
                    result.append("Correct")
                else:
                    result.append("Incorrect")
                correct = True
                continue
        
        if c1 == '#':
            continue
        
        if correct:
            if len(c1) != len(c2):
                correct = False
                continue
            count = 0
            for i in range(len(c1)):
                if c1[i] != c2[i]:
                    count += 1
            if count != 1:
                correct = False

    print("\n".join(result))

if __name__ == "__main__":
    main()
