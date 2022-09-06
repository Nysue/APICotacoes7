
def main():
    input_string = list(input())
    count = int(input())

    index = len(input_string)
    for x in range(count):
        command = input()
        if command[0] == 'L':
            if index != 0:
                index -= 1
        elif command[0] == 'D':
            if index < len(input_string):
                index += 1
        elif command[0] == 'B':
            if index > 1:
                del input_string[0]
        elif command[0] == 'P':
            input_string.insert(index, command[2])
            index += 1
    else:
        print(''.join(input_string))

main()