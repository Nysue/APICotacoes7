def push(my_list, data):
    my_list.append(data)

def empty(my_list):
    return 0 if len(my_list) else 1

def pop(my_list):
    ret = 0
    if len(my_list):
        ret = my_list[-1]
      