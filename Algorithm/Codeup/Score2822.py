idx = [i+1 for i in range(8)]
score = [int(input()) for i in range(8)]
print(idx)
print(score)


dic= dict()
print(type(dic))


for i in range(len(idx)):
    dic[idx[i]]=score[i]

print(dic.items())
sorted(dic, key = lambda x : x[0])

print(dic.items())
