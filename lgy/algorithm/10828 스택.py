def push(my_list, data):
    my_list.append(data)

def empty(my_list):
    return 0 if len(my_list) else 1

def pop(my_list):
    ret = 0
    if len(my_list):
        ret = my_list[-1]
        del my_list[-1]
    else:
        ret = -1
    return ret

def size(my_list):
    return len(my_list)


def top(my_list):
    if len(my_list):
        return my_list[-1]
    else:
        return -1




def main():
    my_list = []
    for x in range(int(input())):
        line = input().split(' ')
        if line[0] == "push":
            push(my_list, line[1])
        elif line[0] == "pop":
            print(pop(my_list))
        elif line[0] == "size":
            print(size(my_list))
        elif line[0] == "empty":
            print(empty(my_list))
        elif line[0] == "top":
            print(top(my_list))

main()