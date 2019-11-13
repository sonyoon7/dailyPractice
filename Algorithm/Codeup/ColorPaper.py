numOfPaper = int(input())
colorPaperList = [list(map(int, input().split())) for paper in range(numOfPaper)]

white = [[0] * 101 for i in range(101)]
# white = [[0] * 101]
# print(white)
# print(white[100][100])
for i in colorPaperList:  # [3, 7], [15, 7], [5, 2]

    for j in range(i[0], i[0] + 10): #3,4,5,6,7,8,9,10,11,13
        for k in range(i[1], i[1] + 10): # 7.8.9.10,11,12,13,14,15,16,17
            white[j][k] += 1
    ret = 0
    for i in range(101):
        for j in range(101):
            if white[i][j] != 0:
                ret += 1
print(ret)

