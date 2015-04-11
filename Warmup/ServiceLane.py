vehicle = [3, 2, 1]

def maximumVehicleWidth(service_width, i, j):
	for trans in vehicle:
		fitted = True
		for width in service_width[i:j+1]:
			if trans > width:
				fitted = False
				break
		if fitted:
			return trans
	return 0
				

opening = input().split()
N = int(opening[0])
T = int(opening[1])
str_service_lane = input().split()
num_service_lane = [int(num) for num in str_service_lane]
for case in range(T):
	i_and_j = input().split()
	i = int(i_and_j[0])
	j = int(i_and_j[1])
	print(maximumVehicleWidth(num_service_lane, i, j))
