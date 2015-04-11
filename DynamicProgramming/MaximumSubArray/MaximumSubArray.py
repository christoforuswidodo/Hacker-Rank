input_integer = []
cache = {}
max_list = []

def maxSubArray(integer_array):
	maximum = integer_array[0]
	max_list.append(maximum)
	cache[0] = [integer_array[0]]
	for index in range(1,len(integer_array)):
		accumulate_max = maximum + integer_array[index]
		if (max(accumulate_max, integer_array[index]) == accumulate_max):
			cache[index] = cache[index-1] + [integer_array[index]]
			maximum = accumulate_max
		else:
			cache[index] = [integer_array[index]]
			maximum = integer_array[index]
		max_list.append(maximum)

def findMaxSub():
	maxVal = max(max_list)
	maxIndex = max_list.index(maxVal)
	return cache[maxIndex]

def sumAbs(integer_array):
	sums = 0
	for num in integer_array:
		if num >= 0:
			sums += num
	return sums 

# initialize the input array
t = int(input())
for i in range(t):
	n = int(input());
	inputs = input().split();
	for num in inputs:
		input_integer.append(int(num))
	maxSubArray(input_integer)
	maxSub = findMaxSub()
	print(max(max_list), sumAbs(maxSub))
	input_integer = []
	cache = {}
	max_list = []

