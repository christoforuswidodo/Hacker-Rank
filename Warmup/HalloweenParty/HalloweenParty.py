def squareBars(cuts):
	vertical = int(cuts/2)
	horizontal = cuts - vertical
	return vertical * horizontal

t = int(input())
for n in range(t):
	n = int(input())
	print(squareBars(n))