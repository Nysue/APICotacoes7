def main():
    ans = 0
    mystack = []
    flag = False
    paren = input()
    intstack = []
    answer = 0
    last = 0
    for idx, ch in enumerate(paren):  # O(n)
        if ch == '(':
            mystack.append(ch)
            intstack.append(1)
            flag = True

        if ch == '