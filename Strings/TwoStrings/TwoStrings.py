
def is_common_substring(A, B):
	count = 0
	for chr in A:
		if chr in B:
			count += 1
	if (count > 0):
		return True
	return False

t = int(input())
for case in range(t):
	A = input()
	B = input()
	if (is_common_substring(A,B)):
		print('YES')
	else:
		print('NO')