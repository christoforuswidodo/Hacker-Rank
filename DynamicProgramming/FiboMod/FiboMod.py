def fibo_mod(first, second, N):
	result = 0
	for num in range(N-2):
		temp = second**2
		result = first + temp
		first = second
		second = result
	return result

input_strings = input()
integers = input_strings.split()
A = int(integers[0])
B = int(integers[1])
N = int(integers[2])
print(fibo_mod(A,B,N))


