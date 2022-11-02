
import sys
sys.path.append('.')

from lgy.algorithm.StdIOTestContainer import StdIOTestContainer as T


def main():
    n, price = [int(i) for i in input().split(' ')]

    coins = [0]
    for i in range(n):