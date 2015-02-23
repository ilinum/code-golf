import sys
from random import shuffle
a=map(int,sys.argv[1:])
while(sorted(a)!=a):
	shuffle(a)
print a