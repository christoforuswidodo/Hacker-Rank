
def findReverseIndex(N, K):
	if (K < int(N / 2)):
		return 1 + 2*K
	else:
		return 2*(N-1-K)


t = int(input())
for case in range(t):
	inputs = input().split()
	N = int(inputs[0])
	K = int(inputs[1])
	print(findReverseIndex(N, K))
