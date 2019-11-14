import math

days = int(input())
koreanPages = int(input())
mathPages = int(input())
maxForKo = int(input())
maxForMa = int(input())

if koreanPages // maxForKo < mathPages // maxForMa:
    print(days - math.ceil(mathPages / maxForMa))
else:
    print(days - math.ceil(koreanPages / maxForKo))
