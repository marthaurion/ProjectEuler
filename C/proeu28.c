#include<stdio.h>
#include<stdlib.h>

int main() {
	int** sp = (int**)malloc(1001*sizeof(int*));
	int i, j, k, count, iter;
	int sum = 0;

	for(i = 0; i < 1001; i++)
		*(sp+i) = (int*)malloc(1001*sizeof(int));
	i = 500;
	j = 500;
	count = 1;
	iter = 1;
	sp[i][j] = count;
	count++;
	while(iter < 1001) {
		j++;
		sp[i][j] = count;
		count++;
		for(k = 0; k < iter; k++) {
			i++;
			sp[i][j] = count;
			count++;
		}
		for(k = 0; k <= iter; k++) {
			j--;
			sp[i][j] = count;
			count++;
		}
		for(k = 0; k <= iter; k++) {
			i--;
			sp[i][j] = count;
			count++;
		}
		for(k = 0; k <= iter; k++) {
			j++;
			sp[i][j] = count;
			count++;
		}
		iter += 2;
	}
	i = 0;
	j = 0;
	while(i < 1001) {
		if(i != 1000-i) {
			sum += sp[i][j];
			sum += sp[1000-i][j];
		}
		else sum += sp[i][j];
		i++;
		j++;
	}
	printf("%d\n", sum);
	for(k = 0; k < 1001; k++)
		free(*(sp+k));
	free(sp);
	return 0;
}