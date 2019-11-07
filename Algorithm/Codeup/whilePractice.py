# num=1;
# while num <=100:
#     print(num)
#     num+=1
#
# family = ['mother', 'father', 'gentleman', 'sexy lady']
#
# for x in family:
#     print('%s %s'%(x,len(x)))

# a = [4, 5, 6, 7]
# for i in a:
#     print(i)
#
# for i in range(4, 8): # 4~8인 값
#     print(i)
# a=1
# b=3
# def hap(a, b):
#     print(a * b)
#
# hap(a,b)


def countdown(n):
    if n == 0:
        print("Blastoff!")
    else:
        print(n)
        countdown(n-1)
countdown(10)
