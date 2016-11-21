
/*
#include <stdio.h>
#include <stdlib.h>
*/

#include "heapify.c"

void BuildHeap (int *A, int size){
	for (int i = size / 2 - 1; i >= 0; i--)
		heapify (A, i, size - 1);
}

/*
int main (){
	int A [] = {4, 2, 1, 8, 6, 5, 10, 9, 11, 16};
	heapify(A, 0, 9);
	printIntArray (A, 10);
	int B [] = {12, 10, 15, 19, 8, 7, 20};
	BuildHeap (B, 7);
	printIntArray (B, 7);
	return 0;
}
*/