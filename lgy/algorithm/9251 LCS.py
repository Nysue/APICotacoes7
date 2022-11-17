
import sys
sys.path.append('.')

from lgy.algorithm.StdIOTestContainer import StdIOTestContainer as T

def main():
    v1 = input()
    v2 = input()

    length = max(len(v1), len(v2))
    dp = [[0 for i in range(len(v2) + 1)] for j in range(len(v1) + 1)]

    ans = 0
    for i in range(1, len(v1) + 1):
        for j in range(1, len(v2) + 1):
            if v1[i-1:i] == v2[j-1:j]:
                dp[i][j] = dp[i-1][j-1] + 1

            else:
                dp[i][j] = max(dp[i][j-1], dp[i-1][j])

    print(dp[len(v1)][len(v2)])


print("ab"[0])
user_input = '''
ACAYKP
CAPCAK
'''

expected = '''
4
'''

T.runningTest(user_input.strip(), expected.lstrip(), main)