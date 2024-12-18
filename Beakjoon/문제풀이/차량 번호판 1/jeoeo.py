def main():
    format_str = input().strip()
    total = 1
    prev = None
    
    for char in format_str:
        if char == 'c':
            if prev == 'c':
                total *= 25
            else:
                total *= 26
            prev = 'c'
        elif char == 'd':
            if prev == 'd':
                total *= 9
            else:
                total *= 10
            prev = 'd'
    
    print(total)

if __name__ == "__main__":
    main()
