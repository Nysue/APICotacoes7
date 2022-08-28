
def main():
    voca = input()
    mymap = {}

    for idx, ch in enumerate(voca):
        if ch not in mymap.keys():
            mymap[ch] = idx

    for i in range(97, 97+26):
        if chr(i) in mymap.keys():
            print(my