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
            if location[i] - index >= mid:
                cnt += 1
                index = location[i]

        if cnt >= count:
            ans = mid
            left = mid + 1
        else:
            right = mid - 1

    print(ans)

user_input = '''
5 3
1
2
8
4
9
'''

expected = '''
3
'''

T.runningTest(user_input.strip(), expected.lstrip(), main)