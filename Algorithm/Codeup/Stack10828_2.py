a = int(input());
print(a)

while a > 0:
    a = a-1
    b = input().split(' ');
    # print(b[0])
    if(b[0]=='push'):
        print(b[1] ,'****')
        # print(b[0] , a)
    elif(b[0]=='pop'):
        print('pop')
    # a-=1





