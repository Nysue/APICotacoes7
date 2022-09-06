
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
    visited.add(start-1)
    vertex = start - 1
    while 1:
        answer.append(vertex + 1)

        if len(visited) == n:
            break
        for i in range(len(g[vertex])):
            if g[vertex][i] == 1 and i not in visited:
                vertex = i
                visited.add(vertex)
                break
        else:
            break

    print(*answer)

    answer = []
    queue = [start - 1]
    visited = set()
    while queue:
        vertex = queue.pop(0)
        if vertex in visited:
            break

        visited.add(vertex)
        answer.append(vertex + 1)

        for i in range(len(g[vertex])):
            if g[vertex][i] == 1 and i not in visited:
                queue.append(i)

    print(*answer)


user_input = '''
1000 1 1000
999 1000
'''

expected = '''
1000 999
1000 999
'''

T.runningTest(user_input.strip(), expected.lstrip(), main)