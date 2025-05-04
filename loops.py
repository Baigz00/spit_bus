# loops.py
# this program uses the nested for loops
numb = 5
for i in range(numb + 1):
    for j in range(i):
        print(i, end = " ")
    print(" ")

numb = 5
for i in range(numb + 1):
    for j in range(numb - i, 0, -1):
        print(j, end = " ")
    print(" ")

numb = 5
for i in range(1, numb + 1):
    for j in range(numb, 0, -1):
        if i < j:
            print(" ", end = " ")
        else:
            print(i, end = " ")
    print(" ")