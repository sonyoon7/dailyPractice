numOfSchedule = int(input())

eachSchedule = [list(map(int, input().split())) for i in range(numOfSchedule)]
eachSchedule = sorted(eachSchedule, key=lambda x: x[1])
starter = eachSchedule.pop(0)  # [[1, 4]
sum = 1
for i in eachSchedule:  # [3, 5], [0, 6], [5, 7], [3, 8], [5, 9], [6, 10], [8, 11], [8, 12], [2, 13], [12, 14]]
    if i[0] < starter[1]: continue
    # print(i)
    sum+=1
    starter=i

print(sum)