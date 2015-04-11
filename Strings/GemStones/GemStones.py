
def count_gem(words):
	init_set = set()
	for char in words[0]:
		init_set.add(char)
	for word in words:
		ret_set = set()
		for letter in word:
			if letter in init_set:
				ret_set.add(letter)
		init_set = ret_set
	return len(init_set)

n = int(input())
words = []
for word in range(n):
	words.append(input())
print(count_gem(words))

