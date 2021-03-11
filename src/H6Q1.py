from threading import *
import numpy as np


def populate():
    array = []
    while True:
        entry = input('Item number : ')
        if entry == 'q':
            break

        try:
            array.append(int(entry))
        except:
            print("Not a valid number")
    return array


def avg(arr):
    print(np.mean(arr))


def min_val(arr):
    print(min(arr))


def max_val(arr):
    print(max(arr))


inputs = populate()
t0 = Thread(target=avg, args=(inputs,))
t1 = Thread(target=min_val, args=(inputs,))
t2 = Thread(target=max_val, args=(inputs,))

t0.start()
t1.start()
t2.start()

t0.join()
t1.join()
t2.join()

