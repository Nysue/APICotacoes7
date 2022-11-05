
import sys
sys.path.append('.')

from lgy.algorithm.StdIOTestContainer import StdIOTestContainer as T


def main():
    n, price = [int(i) for i in input().split(' ')]

    coins = [0]
    for i in range(n):
        coins.append(int(input()))

    dp = [[0 for i in range(price + 1)] for j in range(n + 1)]

    for i in range(n + 1):
        dp[i][0] = 1


    for i in range(1, n + 1):
        for j in range(1, price + 1):
            if coins[i] <= j:
                dp[i][j] = dp[i][j - coins[i]] + dp[i - 1][j]
            else:
                dp[i][j] = dp[i-1][j]


    print(dp[n][price])


user_input = '''
3 10
1
2
5
'''

expected = '''
10
'''

T.runningTest(user_input.strip(), expected.lstrip(), main)