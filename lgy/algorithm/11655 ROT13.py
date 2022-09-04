
import sys

def main():
    for ch in input():
        if ch <= 'm' and ch >= 'a':
            print(chr(ord(ch) + 13), end='')