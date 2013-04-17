#include<stdio.h>

int main() {
	int sum1 = 0;
	int sum2 = 0;
	int i;
	for(i = 0; i <= 100; i++) {
		sum1 += i;
		sum2 += i*i;
	}
	printf("%d\n", sum1*sum1-sum2);
	return 0;
}
