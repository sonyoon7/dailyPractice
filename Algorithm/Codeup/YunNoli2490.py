numList = [list(map(int, input().split())) for play in range(3)]
# print(numList)
grade = ['E', 'A', 'B', 'C', 'D']  # 0, 1 , 2, 3, 4
for i in numList:
    # print(len(grade) - (sum(i) + 1))
    print(grade[len(grade) - (sum(i) + 1)])