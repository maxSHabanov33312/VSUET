def F(A,B):
    C = B + 1
    D = B - 1
    if A < B:
        for i in range(A,C):
            print(i,end=";")
    else:
        for i in range(A,D,-1):
            print(i,end=";")
F(A = int(input()),B = int(input()))