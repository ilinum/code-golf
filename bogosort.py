import sys,random
a=map(int,sys.argv[1:])
while(sorted(a)!=a):
 random.shuffle(a)
print a
