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