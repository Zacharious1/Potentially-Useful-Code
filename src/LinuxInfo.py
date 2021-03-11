import os
import time

print("Please select option 1 or 2")
print("1: Print Processor type, Kernel version, Memory info, and System up time")
print("2: Print other values")
selection = int(input())


def get_num(x):
    return float(''.join(ele for ele in x if ele.isdigit()))


if selection == 1:
    m = ""
    memTotal = ""
    memFree = ""
    models = []
    temp = os.popen('cat /proc/cpuinfo').read()
    lines = temp.split("\n")
    for line in lines:
        if ("model name" in line):
            models.append(line.split(":")[1][1:])
    for model in models:
        m = model

    version = os.popen("cat /proc/version_signature").read()

    memoryT = []
    temp = os.popen('cat /proc/meminfo').read()
    lines = temp.split("\n")
    for line in lines:
        if ("MemTotal" in line):
            memoryT.append(line.split(":")[1][1:])

    for memT in memoryT:
        memTotal = memT

    memoryF = []
    temp = os.popen('cat /proc/meminfo').read()
    lines = temp.split("\n")
    for line in lines:
        if ("MemFree" in line):
            memoryF.append(line.split(":")[1][1:])

    for memF in memoryF:
        memFree = memF

    print()
    print("Total memory: ")
    print(memTotal.strip())
    print()
    print("Free memory: ")
    print(memFree.strip())
    print()
    print("Processor Model: ")
    print(m.strip())
    print()
    print("Uptime: ")
    uptime = os.system("cat /proc/uptime")
    print()
    print("Kernel Version: ")
    print(version.strip())
    print()


if selection == 2:
    while True:
        time.sleep(5)
        m = ""
        memTotal = 0
        memFree = 0
        memoryT = []
        temp = os.popen('cat /proc/meminfo').read()
        lines = temp.split("\n")
        for line in lines:
            if ("MemTotal" in line):
                memoryT.append(line.split(":")[1][1:])

        for memT in memoryT:
            memTotal = memT
        memoryF = []
        temp = os.popen('cat /proc/meminfo').read()
        lines = temp.split("\n")
        for line in lines:
            if ("MemFree" in line):
                memoryF.append(line.split(":")[1][1:])
        for memF in memoryF:
            memFree = memF

        mf = get_num(memFree)
        mt = get_num(memTotal)
        print("Percent Free: ", (mf/mt), "%")
        print()
        os.system("cat /proc/1/status")
        print()
        os.system("top -n 1")
        print()


