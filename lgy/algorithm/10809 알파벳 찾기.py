
def main():
    voca = input()
    mymap = {}

    for idx, ch in enumerate(voca):
        if ch not in mymap.keys():
            mymap[c