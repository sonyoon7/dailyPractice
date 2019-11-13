import sys

money = 1000
payAmount = int(sys.stdin.readline())
changes = money - payAmount
coins = [500, 100, 50, 10, 5, 1]

cnt = 0;

while changes > 0:
    for i in coins:
        cnt += int(changes // i)
        changes = int(changes % i)

print(int(cnt))


