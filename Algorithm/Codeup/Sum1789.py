s = int(input())
max =0
cnt= 0
while max < s:
    cnt+=1
    max+=cnt

print(cnt-1)




#n * (n + 1) / 2는 1부터 n까지의 합의 공식이다.


# s = int(input())
# n = 1
# while n * (n + 1) / 2 <= s:
#
#     n += 1
# print(n - 1)