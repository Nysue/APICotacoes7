import sys
sys.path.append('.')

from lgy.algorithm.StdIOTestContainer import StdIOTestContainer as T

def main():
    newin = [0 for i in range(32001)]

    ans = []
    n, m = map(int, input().split(' '))
    edge = [[] for i in range(n + 1)]
    for i in range(m):
        a, b = [int(i) for i in input().split(' ')]
        edge[a].append(b)
        newin[b] += 1

    queue = []
    for i in range(1, n+1):
        if not newin[i]:
            queue.append(i)

    while queue:
        t = queue.pop(0)

        ans.append(t)

        for k in edge[t]:
            newin[k] -= 1
            if newin[k] == 0:
                queue.append(k)

    print(*ans)



user_input = '''
3 2
1 3
2 3
'''

expected = '''
1 2 3
'''

T.runningTest(user_input.strip(), expected.lstrip(), main)