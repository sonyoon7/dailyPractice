numOfPeople =int(input())
result =[]
for i in range( numOfPeople):
    result.append(int(input()))
if numOfPeople -sum(result) < sum(result): #귀여운것
    print("Junhee is cute!")
else:
    print("Junhee is not cute!")

# cnt[0,0]
# 카운트 활용해도 좋을듯