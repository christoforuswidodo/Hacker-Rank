def largestDecent(decents, n):
	if (len(decents) == 0):
		return -1;
	maxComb = min(decents)
	strMax = "5"*(n - maxComb) + "3"*maxComb
	return strMax


def decentCombination(n):
	combination = []
	i = 0
	while(i <= n):
		if ((n - i) % 5) == 0:
			combination.append(n-i)
		i += 3
	return combination


t = int(input())
for case in range(t):
	n = int(input())
	print(largestDecent(decentCombination(n), n))
