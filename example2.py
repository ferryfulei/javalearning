def f(n):
    n = int(n)
    for i in range(2,int(1+n/2)):
        if n%i==0:
            print(i,end = "*"),
            return f(n/i)
    print(n,end = "\n")
for i in range(1,101):
    print(i,end = "=")
    f(i)
