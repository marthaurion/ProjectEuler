#include<stdio.h>
#include<stdlib.h>

long iterate(long, int*, int*, long*);

int main() {
	long* problems = (long*)malloc(1000001*sizeof(long));
	int booleans[1000001] = {0};
	long max = 0L;
	long i = 1L;
	int count = 0;
	while(i < 1000001) {
		if(booleans[i] == 1) i++;
		else {
			iterate((long)i, &count, booleans, problems);
			count = 0;
			i++;
		}
	}
	i = 0;
	while(i < 1000001) {
		if(problems[i] > max) {
			max = problems[i];
			count = i;
		}
		i++;
	}
	printf("%d\n", count);
	return 0;
}

long iterate(long x, int* count, int* booleans, long* problems) {
	if(x == 1L) {
		(*count)++;
		return x;
	}
	if(x%2 == 0) iterate(x/2, count, booleans, problems);
	else iterate(3*x+1, count, booleans, problems);
	(*count)++;
	if(x < 1000001) {
		booleans[(int)x] = 1;
		problems[(int)x] = (long)*count;
	}
	return x;
}