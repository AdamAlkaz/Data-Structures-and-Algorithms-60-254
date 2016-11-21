//Swap algorithm to be used in other programs

//#include <stdio.h>

void swap (int *A, int *B){
	int temp = *A;
	*A = *B;
	*B = temp;
}

//Example use
/*
int main (){
	int a = 2;
	int b = 3;
	swap (&a, &b);
	printf ("a = %d and b = %d", a, b);
	return 0;
}
*/

//Returns a = 3 and b = 2