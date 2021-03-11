import dns.resolver
import socket
port = 8082
host = "zachandsam.ddns.net"
clients = "wast3land.hopto.org"
ip = socket.gethostbyname(host)
print("The IP of the host is: ")
print(ip + "\n")
s = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
s.sendto(b"It's working now :)", (clients, port))
while 1:
    # Receive up to 1,024 bytes in a datagram
    data, addr = s.recvfrom(8082)
    print("Received: ", data, "from", addr)
