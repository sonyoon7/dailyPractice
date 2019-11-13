n = int(input())

ads = [list(map(int, input().split())) for i in range(n)]


for i in ads:
    if i[0]<i[1]-i[2]:
        print('advertise')
    elif i[0]==i[1]-i[2]:
        print('does not matter')
    else:
        print('do not advertise')