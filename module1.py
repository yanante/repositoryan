with open('Perepis.txt','r') as f:
    k=0
    a=int(input())
    b=int(input())
    for i in f:
        s=i[-5:]
        y=int(s)
        l=i.split()
        if (a<=y<=b) or (a>=y>=b):
            print(l[0],l[1],l[2],l[3])
            k+=1
print()
print('Кол-во вилиджеров:',k)
