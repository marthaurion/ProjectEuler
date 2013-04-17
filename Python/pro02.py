i = 0
j = 2
sum = 2
numbers = [1, 2]

while i <= 4000000:
	i = numbers[j-1]+numbers[j-2]
	if i%2 == 0:
		sum = sum + i
	numbers.append(i)
	j = j + 1

print "%d" % sum