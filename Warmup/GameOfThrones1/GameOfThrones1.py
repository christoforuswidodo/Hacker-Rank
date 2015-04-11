char_to_count = {}
def is_palindrome(anagram):
	anagram_length = len(anagram)
	num_of_odds = 0
	for char in anagram:
		if char not in char_to_count:
			char_to_count[char] = 1
		else:
			char_to_count[char] += 1
	for key in char_to_count:
		if (char_to_count[key] % 2 == 1):
			num_of_odds += 1
	if anagram_length % 2 == 1 and num_of_odds == 1:
		return True
	elif anagram_length % 2 == 0 and num_of_odds == 0:
		return True
	return False

anagram = input()
if is_palindrome(anagram):
	print('YES')
else:
	print('NO')
