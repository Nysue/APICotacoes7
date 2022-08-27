from collections import defaultdict

def main():
    voca = input()
    mymap = defaultdict(lambda: 0)
    for ch in voca:
        mymap[ch] += 1
    for i in range(97, 97+26):
        print(mymap[chr(i)], end=' ')

main()