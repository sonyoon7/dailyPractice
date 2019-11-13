import math

while True:
    triangle = list(map(int, input().split()))

    if sum(triangle) == 0: break
    if int(math.sqrt((triangle[0] ** 2) + (triangle[1] ** 2))) == triangle[2]:
        print('right')
    else:
        print('wrong')


# ============================================== 무슨 차이야?

while True:
        a = list(map(int, input().split()))
        max_num = max(a)
        if sum(a) == 0:
                break
        a.remove(max_num)
        if a[0] ** 2 + a[1] ** 2 == a[2] ** 2:
                print('right')
        else:
                print('wrong')
