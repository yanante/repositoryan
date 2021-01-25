with open('Perepis.txt','r') as f:
    k=0
    for i in f:
        s=i[-5:]
        y=int(s)
        l=i.split()
        if y<1978:
            print(l[0])
            k+=1

print(k)
