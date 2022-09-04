
def calculate_index(index, until):
    temp = index
    while temp >= until:
        temp -= until
    return temp

def main():
    n, k = map(int, input().split(' '))

    print('<', end=' ')
    queue = list(map(str, range(1, n+1)))
    index = 0
    while len(queue) != 1:
        index += k-1
        if index < len(queue):
            print(queue[index]+',', end=' ')
        else:
            index = calculate_index(index, len(queue))
            print(queue[index]+',', end=' ')
        del queue[index]

    print(queue[0]+'>', end=' ')

main()
# 1 2 3 4 5 6 7