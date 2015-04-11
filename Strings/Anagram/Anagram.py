
first_words = {}
second_words = {}



def initialize_dict() :
	starter = ord('a')
	while(starter <= ord('z')):
		first_words[chr(starter)] = 0
		second_words[chr(starter)] = 0
		starter += 1

def anagramed(word):
	total_length = len(word)
	first_length = total_length // 2
	second_length = total_length - first_length
	if (first_length != second_length):
		return -1

	for index in range(first_length):
		first_words[word[index]] += 1
		second_words[word[total_length - 1 - index]] += 1
	
	count = 0
	for key in second_words:
		count += abs(first_words[key] - second_words[key])
	return count // 2

t = int(input())
for n in range(t):
	to_be_anagramed = input()
	initialize_dict()
	print(anagramed(to_be_anagramed))



