def Fubonacchi(N):
    X = 0
    list = []
    a = 1
    y = 0
    for i in range(1, N):
        b = a
        a = b + y
        y = b
        list.append(b)
    list.insert(0, 0)
    print(sum(list))
Fubonacchi(N = int(input()))