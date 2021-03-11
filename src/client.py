import dns.resolver
import socket
port = 8082
host = "zachandsam.ddns.net"
ip = socket.gethostbyname(host)
print("The IP of the host is: ")
print(ip + "\n")
s = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
s.sendto(b"It's working now :)", (host, port))


