
def sumModSeries(N, m):
	wrapping_sum = (m) * (m-1) // 2
	left = N % m
	return wrapping_sum * (N // m) + left * (left+1) // 2

t = int(input())
for case in range(t):
	tokens = input().split()
	N = int(tokens[0])
	m = int(tokens[1])
	print(sumModSeries(N, m))
