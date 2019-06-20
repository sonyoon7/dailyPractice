try:
    a, b = input().split();
    a = int(a);
    b = int(b);
    if a > b:
        print(1);
    elif a == b or b > a:
        print(0);
except Exception as e:
    print(e);