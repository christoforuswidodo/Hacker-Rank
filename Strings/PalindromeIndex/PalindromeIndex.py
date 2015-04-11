
def palindromeIndex(sentence, flipped):
	if sentence == flipped:
		return -1;
	for index in range(len(sentence)):
		newSen = sentence[0:index] + sentence[index+1:]
		newFlip = flipped[0:len(sentence) - 1 - index] + flipped[len(sentence) - index:]
		if (newSen == newFlip):
			return index

t = int(input())
for num in range(t):
	sentence = input()
	flip = sentence[::-1]
	print(palindromeIndex(sentence, flip))

