with open('mat_dv.txt','r') as file:
    pob8=0
    pob9=0
    pob10=0
    pob11=0

    for i in file:
        k=0
        a8=i[-4:]
        g8=i[-5:]
        x=int(a8)
        y=int(g8)
        l=i.split()
        print(l[0],l[1],l[2],l[3],l[4])
        for i in l:
            if pob8<