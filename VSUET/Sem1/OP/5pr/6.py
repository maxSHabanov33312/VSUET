def F(x):
    list = [x]
    while x != 0:
        list.append(x)
        x = int(input('>> '))
    a = len(list) - 1
    s = sum(list) // a
    print('Среднее занчение:', s)
F(x = int(input('Введите целые неотрицательные числа, '
              'для завершения введите 0:\n>> ')))