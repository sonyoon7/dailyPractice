import operator


idx = [i + 1 for i in range(8)]
score = [int(input()) for i in range(8)]

dic = dict()
# print(type(dic))

for i in range(len(idx)):
    dic[score[i]] = idx[i]

# print(dic.items())
# print(sorted(dic.items(), key=operator.itemgetter(0), reverse=True))
# print(sorted(dic.items(), key=lambda x: x[0]))
sortedDic = sorted(dic.items(), key=operator.itemgetter(0), reverse=True)
topFive=[]
sum=0
for i in range(5):
    tempList= list(sortedDic.pop(0))
    sum+=tempList[0]
    topFive.append(tempList[1])
print(sum)
print(' '.join(str(x) for x in sorted(topFive)))
