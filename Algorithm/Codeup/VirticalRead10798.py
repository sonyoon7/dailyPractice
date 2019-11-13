rows = [list(input()) for row in range(5)]
# ['A', 'A', 'B', 'C', 'D', 'D']
# ['a', 'f', 'z', 'z']
# ['0', '9', '1', '2', '1']
# ['a', '8', 'E', 'W', 'g', '6']
# ['P', '5', 'h', '3', 'k', 'x']
# print(max([len(e) for e  in rows]))
for i in range(max([len(e) for e in rows])):
    for j in range(5):
        if i < len(rows[j]):
            print(rows[j][i], end="")

