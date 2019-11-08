

# 첫째 줄에 카드의 개수 N(3 ≤ N ≤ 100)과 M(10 ≤ M ≤ 300,000)이 주어진다. 둘째 줄에는 카드에 쓰여 있는 수가 주어지며, 이 값은 100,000을 넘지 않는다.
# 합이 M을 넘지 않는 카드 3장을 찾을 수 있는 경우만 입력으로 주어진다.
# 5 21
# 5 6 7 8 9

# N장의 카드를 모두 숫자가 보이도록 바닥에 놓는다. 그런 후에 딜러는 숫자 M을 크게 외친다.
# 이제 플레이어는 제한된 시간 안에 N장의 카드 중에서 3장의 카드를 골라야 한다. 블랙잭 변형 게임이기 때문에, 플레이어가 고른 카드의 합은 M을 넘지 않으면서 M과 최대한 가깝게 만들어야 한다.
# N장의 카드에 써져 있는 숫자가 주어졌을 때, M을 넘지 않으면서 M에 최대한 가까운 카드 3장의 합을 구해 출력하시오.

# import sys
# import itertools
#
# numberOfcard, blackjack = map(int, sys.stdin.readline().split())
# cards=[int(i) for i in  map(int, sys.stdin.readline().split())]
# min =21
#
# for threeCard in itertools.combinations(cards, 3): # 조합 구해주기
#     if blackjack < sum(threeCard) :continue
#     if 0<= blackjack-sum(threeCard) < min:
#         min = blackjack-sum(threeCard)
#         result = sum(threeCard)
# print(result)
#


from itertools import combinations

card_num, target_sum = map(int, input().split())
card_list = list(map(int, input().split()))
biggest_sum = 0

for cards in combinations(card_list, 3):
    temp_sum = sum(cards)
    if biggest_sum < temp_sum <= target_sum:
        biggest_sum = temp_sum

print(biggest_sum)