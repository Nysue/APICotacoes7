import sys
sys.path.append('.')

from lgy.algorithm.StdIOTestContainer import StdIOTestContainer as T

def main():
    newin = [0 for i in range(32001)]

    ans = []
    n, m = map(int, input().split(' ')