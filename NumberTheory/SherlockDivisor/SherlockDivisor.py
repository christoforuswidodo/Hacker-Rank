
def count_divisor_div_2(n):
	if (n <= 1):
		return 0;
	else:
		i = 2;
		while (i <= n):
			if (n % i == 0):
				return 1 + 

t = int(input())
for case in range(t):
	n = int(input())
	print(count_divisor_div_2(n))