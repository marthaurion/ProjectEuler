n = 600851475143

def isPrime(x):
	i = 3
	while i < x:
		if x%i == 0:
			return False
		i = i + 2
	return True

max = 1
i = 3

while i < n:
	if isPrime(i) and n%i == 0:
		max = i
		print i
	i = i + 2

print max