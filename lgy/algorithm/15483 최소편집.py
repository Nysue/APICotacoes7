import sys
sys.path.append('.')

from lgy.algorithm.StdIOTestContainer import StdIOTestContainer as T


def main():
    v1 = input()
    v2 = input()

    ans = 0
    dp = [0 for i in range()]
    for i in range(len(v1)):
        for j in range(len(v2)):
            pass

user_input = '''
abc
ab
'''

expected = '''
1
'''

user_input2 = '''
ca
abc
'''

expected2 = '''
3
'''

T.runningTest(user_input.strip(), expected.lstrip(), main)
T.runningTest(user_input2.strip(), expected2.lstrip(), main)