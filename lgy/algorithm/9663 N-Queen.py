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
