//prints an integer array
// void printIntArray (pointer to array of integers, intger of the last size of the array)

void printIntArray (int *A, int size){
	for (int i = 0; i < size; i++)
		printf ("%d ", A[i]);
	printf("\n");
}