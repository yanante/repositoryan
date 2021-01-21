file=open('Perepis.txt','r+')
with open('Perepis.txt') as f:
    a=f.readlines()
    for i in range(1,len(a)):
        print(a[i])