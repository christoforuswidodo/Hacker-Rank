from math import pow

def closest_number(a,b,x):
	powered = int(pow(a,b))
	if (powered < 1):
		return 0
	difference_negative = powered % x
	difference_positive = x - difference_negative
	if (difference_negative == difference_positive):
		return powered - difference_negative
	elif (min(difference_positive, difference_negative) == difference_negative):
		return powered - difference_negative
	else:
		return powered + difference_positive

t = int(input())
for case in range(t):
	tokens = input().split()
	a = int(tokens[0])
	b = int(tokens[1])
	x = int(tokens[2])
	print(closest_number(a,b,x))