def F(n):
    sum = 0
    for i in range(0,n+1):
        sum = sum + i**3
    print(sum)
F(n = int(input()))