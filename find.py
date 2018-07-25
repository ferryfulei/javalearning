
def find(a,b,sum):
    if len(a) == len(b):
        return sum
    elif a[: len(b)] == b:
        sum += 1
        a = a[1:]
        return find(a,b,sum)
    elif  a[-len(b):] == b:
        sum += 1
        a = a[:-1]
        return find(a,b,sum)
    elif (a[0] == b[0] and a[-1] == b[-1]) or (a[0] == b[-1] and a[-1] == b[0]):
        a = a[1:]
        return find(a,b,sum)
    else:
        a = a[:-1]
        return find(a,b,sum)
def search(a,b,index):
    if index == 1:
        b = b[::-1]
    sum = 0
    print("string:")
    print(a)
    print("substring:")
    print(b)
    print("number found")
    if index == 1:
        print("direction: from right to left")
    else:
        print("direction from left to right")
    print("number found")
    print(find(a,b,sum))
search('ababababab','aba',0)
