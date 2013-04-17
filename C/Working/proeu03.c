#include<stdio.h>
#include<stdlib.h>
#include<math.h>

#define INPUT_NUM 600851475143

int isPrime(int x);

int main() {
	long long in = (long long)INPUT_NUM;
	int i;
	for(i = 3; i < in; i+=2) {
		if(isPrime(i) == 1 && in%i == 0) {
			in /= i;
			i -= 2;
		}
	}
	printf("%d\n", in);
	return 0;
}

int isPrime(int x) {
	int i;
	for(i = 3; i < sqrt(x); i+=2) {
		if(x%i == 0)
			return 0;
	}
	return 1;
}