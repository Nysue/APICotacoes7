class Queen:
    n = int(input())
    ans = 0
    col = [0 for i in range(15)]

    def possible(row):
        for i in range(0, row):
            if col[i] == col[row]:
                return False

            if abs(col[i] - col[row]) == abs(i - row):
                return False
        else:
            return True

    def dfs(row):
        if row == n:
            ans[0] += 1
        else:
            for i in range(0, n):
                col[row] = i
                if possible(row):
                    dfs(i + 1)

    def main():
        dfs(0)
        print(ans[0])



