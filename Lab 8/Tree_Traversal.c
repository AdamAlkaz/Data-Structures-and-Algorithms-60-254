//Program shows traversal types of a tree

#include <stdio.h>
#include <stdlib.h>

void printPreorder (int *a, int i, int n);
void printInorder (int *a, int i, int n);
void printPostorder (int *a, int i, int n);

int main(){
	int a[] = {0,1,2,3,4,5,6,7,8,9};
	printf("Pre Order: ");
	printPreorder (a, 0, 10);
	printf ("\n\nIn Order: ");
	printInorder (a, 0, 10);
	printf ("\n\nPost Order: ");
	printPostorder (a, 0, 10);

	return 0;
}

void printPreorder (int *a, int i, int n){
	if (i == 0)
		printf("%d ",  a[i]);

	if (2 * i + 1 < n ){
		printf("%d ", a[2 * i + 1]);
		printPreorder (a, 2 * i + 1, n);
		if ( 2 * i + 2 < n){
			printf("%d ",  a[2 * i + 2]);
			printPreorder (a, 2 * i + 2, n);
		}
	}
}

void printInorder (int *a , int i, int n){
	if (2 * i + 1 <= n && 2 * i + 1 != 0)
		printInorder (a, 2 * i + 1, n);
	printf ("%d ", a[i]);
	if ( 2 * i + 2 < n){
		printInorder (a, 2 * i + 2, n);
	}
	
}

void printPostorder (int *a, int i, int n){
	if (2 * i + 1 < n)
		printPostorder (a, 2 * i + 1, n);
	if (2 * i + 2 < n)
		printPostorder (a, 2 * i + 2, n);
	printf ("%d " , a[i]);
}