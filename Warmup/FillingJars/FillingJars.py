tokensNM = input().split()
n = int(tokensNM[0])
m = int(tokensNM[1])
total_candies = 0
for num in range(m):
	jars = input().split()
	a = int(jars[0])
	b = int(jars[1])
	k = int(jars[2])
	total_candies += (b-a+1) * k

print(int(total_candies / n))
