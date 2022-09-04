
import sys

def main():
    for ch in input():
        if ch <= 'm' and ch >= 'a':
            print(chr(ord(ch) + 13), end='')
        elif ch >= 'n' and ch <= 'z':
            print(chr(ord(ch) - 13), end='')
        elif ch <= 'M' and ch >= 'A':
            print(chr(ord(ch) + 13), end='')
        elif ch >= 'N' and ch <= 'Z':
            print(chr(ord(ch) - 13), end='')
        elif (ch >= '0' and ch <= '9') or ch == ' ':
            print(ch, end='')

main()