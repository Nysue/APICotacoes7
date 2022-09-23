import sys
sys.path.append('.')

from lgy.algorithm.StdIOTestContainer import StdIOTestContainer as T

def main():
    n, count = map(int, input().split(' '))
    location = []
    for i in range(n)