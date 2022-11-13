def main():
    n = int(input())

    card_price = [int(i) for i in input().split(' ')]
    dp = [0 for i in range(n+1)]
    card_price.insert(0, 0)
    for i in range(1, n+1):
        for j in range(1, i+1):
            dp[i] = max(dp[i], dp[i-j] + card_price[j])

    print(dp[n])

main()

