/* This programs tests the insertion sort and quick sort algorithms
two arrays are filled in descending order (worst case test)
sorting algorithms will make the arrays in ascending order
*/

#include <stdio.h>
#include <stdlib.h>

#include "insertion_sort.c"
#include "quick_sort.c"

void printArray (int *array, int size){
	for (int i = 0; i < size; i++)
		printf("%d   ", array[i]);
}

int main(){
	int *a = (int*) malloc (5 * sizeof (int));
	int *b = (int*) malloc (5 * sizeof (int));
	for (int i = 0 ; i < 5 ; i++){
		a[i] = 5 - i;
		b[i] = 5 - i;
	}	
	insertSort (a, 5);
	printArray (a, 5);
	free(a);
	a = NULL;

	printf ("\n");

	quickSort (b, 0, 5);
	printArray (b, 5);
	free(b);
	b = NULL;

	return 0;
}
