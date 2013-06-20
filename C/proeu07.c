#include<stdio.h>
#include<stdlib.h>

int main() {
	int* table = (int*)malloc(10000000*sizeof(int));
	int i, j, k, b;
	for(i = 0; i < 10000000; i++)
		*(table+i) = 1;
	*table = 0;
	*(table+1) = 0;
	i = 2;
	j = 1;
	b = 2;
	while(j < 10001) {
		for(k = b*i; k < 10000000; k = b*i) {
			*(table+k) = 0;
			b++;
		}
		j++;
		i++;
		while(*(table+i) == 0)
			i++;
		b = 2;
	}
	printf("%d\n", i);
	return 0;
}