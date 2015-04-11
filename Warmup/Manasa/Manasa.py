
def buildStones(numCP, a, b):
	final_stones = []
	for stone in range(numCP):
		final = a*(numCP-1-stone) + b*stone
		if (final not in final_stones):
			final_stones.append(final)
	return sorted(final_stones)

def constructString(sortedz):
	retString = ""
	for item in sortedz:
		retString += str(item) + " "
	return retString


t = int(input())
for case in range(t):
	n = int(input())
	a = int(input())
	b = int(input())
	finals = buildStones(n, a, b)
	print(constructString(finals))
