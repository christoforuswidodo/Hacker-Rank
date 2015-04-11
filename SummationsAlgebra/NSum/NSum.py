
def calcSeries(n):
	return ((n % 1000000007) * (n % 1000000007)) % 1000000007

t = int(input())
for case in range(t):
	n = int(input())
	print(calcSeries(n))
