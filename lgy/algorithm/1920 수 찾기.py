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
      