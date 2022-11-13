
import sys
sys.path.append('.')

from lgy.algorithm.StdIOTestContainer import StdIOTestContainer as T

'''https://penglog.tistory.com/28'''
def main():
    n, length = [int(i) for i in input().split(' ')]

    heights = [int(i) for i in input().split(' ')]

    heights.sort(reverse=True)

    sum = 0
    ans = heights[0] - 1
    index = 0
    while 1:
        while heights[index] - ans > 0:
            sum += (heights[index] - ans)
            index += 1

        if sum < length: # 3
            ans -= 1
            sum += index
        else:
            break

    print(ans)

user_input = '''
4 7
20 15 10 17
'''

expected = '''
15
'''

T.runningTest(user_input.strip(), expected.lstrip(), main)