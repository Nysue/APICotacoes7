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

        if ch == ')':
            mystack.pop()
            if flag:
                if len(mystack) == 0:
                    intstack.pop()

                    continue
                intstack.pop()
                ans += len(intstack)

            else:
                ans += intstack[-1]
                intstack.pop()

            flag = False
    print(ans)


main()