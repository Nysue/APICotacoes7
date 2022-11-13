def main():
    n = int(input())

    card_price = [int(i) for i in input().split(' ')]
    dp = [0 for i in range(n+1)]
    card_price.insert(0, 0)
    for i in