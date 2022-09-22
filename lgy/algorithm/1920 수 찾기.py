import sys
sys.path.append('.')

from lgy.algorithm.StdIOTestContainer import StdIOTestContainer as T

def main2():
    n = int(input())

    numbers = [int(i) for i in input().split(' ')]

    m = int(input())

    mumbers = [int(i) for i in input().split(' ')]

    numbers.sort()
    sorted_m = sorted(mumbers)
    index = dict(zip(mumbers, [0 for i in range(len(mumbers))]))


    for i in numbers:
        for j in sorted_m:
            if j > i:
                break
            if j < i:
                continue
            if j == i:
                index[j] = 1

    for i in index.values():
        print(i)



def main():
    n = int(input())

    numbers = [int(i) for i in input().split(' ')]

    m = int(input())

    mumbers = [int(i) for i in input().split(' ')]


    number_dict = set(numbers)
    index = dict(zip(mumbers, [0 for i in range(len(mumbers))]))


    for i in mumbers:
        if i in number_dict:
            index[i] = 1

    for i in index.values():
        print(i)



user_input = '''
2
0 5
2
0 5
'''

expected = '''
1
1
'''

T.runningTest(user_input.strip(), expected.lstrip(), main)