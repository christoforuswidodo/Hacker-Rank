
def minPrice(black, white, b_price, w_price, shift_price):
	if b_price == w_price:
		return black*b_price + white*w_price
	else:
		min_price = min(b_price, w_price)
		if (min_price == b_price):
			sp_or_wp = min(b_price + shift_price, w_price)
			if sp_or_wp == (b_price + shift_price):
				init_price = black*b_price + white*(b_price+shift_price)
			else:
				init_price = black*b_price + white*w_price
		else:
			sp_or_wp = min(w_price + shift_price, b_price)
			if sp_or_wp == (w_price + shift_price):
				init_price = black*(w_price+shift_price) + white*w_price
			else:
				init_price = black*b_price + white*w_price
	return init_price


t = int(input())
for case in range(t):
	candies = input().split()
	black = int(candies[0])
	white = int(candies[1])
	prices = input().split()
	b_price = int(prices[0])
	w_price = int(prices[1])
	shift_price = int(prices[2])
	print(minPrice(black, white, b_price, w_price, shift_price))

