bugers = [ int(input()) for i in range(3)]
beverage = [ int(input()) for i in range(2)]

min = 2000
for i in bugers:
    for j in beverage:
       if (i+j-50)<min:
           min =i+j-50


print(min)