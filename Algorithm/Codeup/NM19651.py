import itertools

N, M = map(int, input().split())
num_list = [i for i in range(1, N + 1)]
# print(num_list)

for num in itertools.permutations(num_list, M): # 범위(1, 2, 3) , 배열 사이즈 2
    # print("num  ",num)
    for i in num:
        print(i, end=' ')
    print(end='\n')