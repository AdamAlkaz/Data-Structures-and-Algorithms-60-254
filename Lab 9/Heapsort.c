
/*
#include <stdio.h>
#include <stdlib.h>
*/

#include "BuildHeap.c"

void Heapsort (int *A, int size){
	for (int i = size - 1; i >= 1; i--){
		swap (A, A + i);
		heapify (A, 0, i - 1);
	}
}
