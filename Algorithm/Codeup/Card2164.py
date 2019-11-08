# 예를 들어 N=4인 경우를 생각해 보자. 카드는 제일 위에서부터 1234 의 순서로 놓여있다.
# 1을 버리면 234가 남는다. 여기서 2를 제일 아래로 옮기면 342가 된다.
# 3을 버리면 42가 되고, 4를 밑으로 옮기면 24가 된다. 마지막으로
# 2를 버리고 나면, 남는 카드는 4가 된다.
import sys
import collections

card_deque= collections.deque([i+1 for i in range(int(sys.stdin.readline()))])

# while len(card_deque) != 1:
#     card_deque.pop(0) # 버리기
#     card_deque.append(card_deque[0]) # 추가하기
#     card_deque.pop(0) # 버리기
#


while len(card_deque) != 1:
    card_deque.popleft()
    card_deque.rotate(-1)
print(card_deque[0])