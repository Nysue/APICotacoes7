
def main():
    for x in range(int(input())):
        mystack = []
        paren = input()
        for idx, ch in enumerate(paren):
            if ch == '(':
                mystack.append(ch)

            if idx == 0 and ch == ')':
                print('NO')
                break

            if ch == ')' and len(mystack) == 0:
                print('NO')
                break

            if ch == ')':
                mystack.pop()
        else:
            if len(mystack) == 0:
                print('YES')
            else:
                print('NO')

main()