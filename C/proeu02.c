#include<stdio.h>

int main() {
	int sequence[50];
	int i, sum;
	sequence[0] = 1;
	sequence[1] = 2;
	sum = 2;
	for(i = 2; (sequence[i] = sequence[i-1]+sequence[i-2]) < 4000000; i++)
		if(sequence[i]%2 == 0) sum += sequence[i];
	printf("%d\n", sum);
	return 0;
}
