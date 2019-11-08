import sys

cnt = int(sys.stdin.readline())
stack = [];
while (0 < cnt):
    n = int(sys.stdin.readline())
    if (n == 0):
        stack.pop(- 1)
    else:
        stack.append(n)  # 추가
    cnt -=1
print(sum(stack))



