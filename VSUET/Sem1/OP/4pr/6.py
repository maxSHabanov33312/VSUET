def F(n):
    sum = 1
    for i in range(1,n+1):
        sum = sum*i
    print(sum)
F(n = int(input()))