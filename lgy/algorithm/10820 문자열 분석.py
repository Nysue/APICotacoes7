
import sys
def main():
    for x in sys.stdin:
        res = [0, 0, 0, 0]
        for ch in x:
            if ch >= 'a' and ch <= 'z':
                res[0] += 1
            elif ch >= 'A' and ch <= 'Z':
                res[1] += 1
            elif ch.isdecimal():
                res[2] += 1
            elif ch == ' ':
                res[3] += 1


        print(*res)

main()