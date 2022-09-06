
import sys
sys.path.append('.')

from lgy.algorithm.StdIOTestContainer import StdIOTestContainer as T

def main():
    n, m, start = map(int, input().split(' '))
    g = [[0 for i in range(n)] for j in range(n)]

    for i in range(m):
        a, b = map(int, input().split(' '))
        g[a-1][b-1] = 1
        g[b-1][a-1] = 1

    answer = []

    visited = set()