import time
from threading import *



class Server(Thread):
    def __init__(self):
        Thread.__init__(self)
        self.running = True

    def run(self):
        while self.running:
            with open("sf.txt", "w+") as f:
                for line in f.read():
                    if '0' in line:
                        contents = f.read()
                        contents.replace("0", "-1")
                        f.write(contents)
                        print(contents)

                    if '1' in line:
                        contents = f.read()
                        contents.replace("1", "-1")
                        f.write(contents)
                        print(contents)

                    if '2' in line:
                        contents = f.read()
                        contents.replace("2", "-1")
                        f.write(contents)
                        print(contents)

                    if '3' in line:
                        contents = f.read()
                        contents.replace("3", "-1")
                        f.write(contents)
                        print(contents)

                    if '4' in line:
                        contents = f.read()
                        contents.replace("4", "-1")
                        f.write(contents)
                        print(contents)

                    if '5' in line:
                        contents = f.read()
                        contents.replace("5", "-1")
                        f.write(contents)
                        print(contents)

                    if '6' in line:
                        contents = f.read()
                        contents.replace("6", "-1")
                        f.write(contents)
                        print(contents)

                    if '8' in line:
                        contents = f.read()
                        contents.replace("8", "-1")
                        f.write(contents)
                        print(contents)

                    if '9' in line:
                        contents = f.read()
                        contents.replace("9", "-1")
                        f.write(contents)
                        print(contents)

                    if '10' in line:
                        contents = f.read()
                        contents.replace("10", "-1")
                        f.write(contents)
                        print(contents)

                    if '7' in line:
                        exit(1)
                f.close()
                time.sleep(7)

    def stop(self):
        self.running = False


a = Server()
a.start()
