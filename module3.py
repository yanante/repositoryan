s=0
a=0

def dcf(speed):
    def rast(v1,v2,t,a):
        speed(v1,v2,t,a)
        s=(v1*t)+((a*t*t)/2)
        print('раст.',s)
    return rast

def speed(v1,v2,t,a):
    a=(v1-v2)/t
    print('ускор.',a)

try:
    v1=float(input('нач скорость'))
    v2=float(input('кон скорость'))
    t=float(input('время'))
    speed=dcf(speed)
    speed(v1,v2,t,a)

except ValueError:
    print('числа писать надо, брат')
except ZeroDivisionError:
    print('время не то, брат')


