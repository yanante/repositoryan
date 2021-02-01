def speed():
    a=(v1-v2)/t
    print(a)

def dcf(speed):
    def rast():
        def speed():
          s=(v1*t)+(a*t*t)
    return rast

try:
    v1=float(input('нач скорость'))
    v2=float(input('кон скорость'))
    t=float(input('время'))

except TypeError:
    print('числа писать надо, брат')
except ZeroDivisionError:
    print('время не то, брат')