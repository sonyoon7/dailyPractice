import sys

hour, minute = map(int, sys.stdin.readline().split())

if minute > 44:  # 44보다 클때  45 ~59
    print(hour, minute - 45)
elif minute <= 44 and 1 <= hour:  # 0~44 , 1~23
    print(hour - 1, minute + 15)
else:  # 0,0 일때
    print(23, minute + 15)


