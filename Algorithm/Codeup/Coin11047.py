import sys

n, m = map(int, sys.stdin.readline().split())
coin_unit = [int(sys.stdin.readline()) for _ in range(n)]  # for문 n번 돌아갈 동안 값을 넣어줌
#  quotient : 몫 , remainder : 나머지
quotient = 0
remainder = m
cnt = 0
while remainder != 0:
    temp = coin_unit.pop(-1) # 동전 500
    quotient = int(remainder / temp) # 몫
    if (quotient >= 1):  # 나눌수 있다면
        cnt += int(remainder / temp)
        remainder = remainder- (temp*quotient)  # 나눈 나머지를 다음턴에 사용
print(cnt)