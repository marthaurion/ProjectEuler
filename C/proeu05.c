#include<stdio.h>

int check(int);

int main() {
	int num = 2520;
	while(check(++num) == 0);
	printf("%d\n", num);
	return 0;
}

int check(int a) {
	int i = 1;
	int ret = 1;
	while(i <= 20)
		if(a%i++ != 0){
			ret = 0;
			break;
		}
	return ret;
}
