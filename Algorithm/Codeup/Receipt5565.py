totalAmount = int(input())
receipt = [int(input()) for i in range(9)]
print(totalAmount - sum(receipt))
