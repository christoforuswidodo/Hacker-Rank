def calculate_chocolate(money, price, bonus):
	init_chocolate = int(money / price)
	total = init_chocolate + additional_chocolate(init_chocolate, bonus)
	return total

def additional_chocolate(start_wrapper, bonus):
	if (start_wrapper < bonus):
		return 0
	else:
		wrapper_left = start_wrapper % bonus
		add_choc = int(start_wrapper/bonus)
		return add_choc + additional_chocolate(wrapper_left + add_choc, bonus)


t = int(input())
for num in range(t):
	nums = input().split()
	n = int(nums[0])
	c = int(nums[1])
	m = int(nums[2])
	print(calculate_chocolate(n, c, m))
