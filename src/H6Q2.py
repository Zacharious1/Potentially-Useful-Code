import time
from random import randrange
from threading import *


class Client(Thread):
    def __init__(self):
        Thread.__init__(self)
        self.running = True

    def run(self):
        while self.running:
            with open("sf.txt", "w+") as f:
                for line in f.read():
                    if '-1' in line:
                        contents = f.read()
                        contents.replace("-1", str(randrange(10)))
                        f.write(contents)
                        print(contents)
                    if '7' in line:
                        exit(1)
                    f.close()
                    time.sleep(5)

    def stop(self):
        self.running = False


b = Client()
b.start()
