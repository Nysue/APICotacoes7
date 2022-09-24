import sys
sys.path.append('.')

from lgy.algorithm.StdIOTestContainer import StdIOTestContainer as T

def main():
    n, count = map(int, input().split(' '))
    location = []
    for i in range(n):
        location.append(int(input()))

    location.sort()

    left = 1
    right = location[n-1] - location[0]

    mid = 0
    ans = 0
    while left <= right:
        mid = (left + right)//2
        cnt = 1
        index = location[0]

        for i in range(1, n):
         