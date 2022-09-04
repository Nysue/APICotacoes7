def solve():
    n = int(input())

    dp = [1,1]

    for i in range(2, n+1):
        dp.append(dp[i-1] + dp[i-2])

    print(dp[-1]%10007)



solve()