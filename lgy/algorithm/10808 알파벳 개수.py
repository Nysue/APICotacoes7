from collections import defaultdict

def main():
    voca = input()
    mymap = defaultdict(lambda: 0)
    for ch in voca:
        mymap[ch] += 1
    