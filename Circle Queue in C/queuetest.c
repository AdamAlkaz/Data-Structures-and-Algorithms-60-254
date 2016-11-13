#include <stdio.h>
#include <stdlib.h>
#include "circle_queue.c"

int main () {
	struct queue Queue;
	struct queue *circleQueue;
	circleQueue = &Queue;
	makeQueue(circleQueue, 4);
	enqueue (circleQueue, 3);
	printf("%d   %d   %d\n", dequeue(circleQueue), circleQueue -> front, circleQueue -> array[circleQueue -> front]);
	enqueue (circleQueue, 6);
	enqueue (circleQueue, 5);
	enqueue (circleQueue, 2);
	printf("%d   %d   %d\n", dequeue(circleQueue), circleQueue -> front, circleQueue -> array[circleQueue -> front]);

	printf("%d   %d   %d\n", dequeue(circleQueue), circleQueue -> front, circleQueue -> array[circleQueue -> front]);
	enqueue (circleQueue, 8);
	printf("%d   %d   %d\n", dequeue(circleQueue), circleQueue -> front, circleQueue -> array[circleQueue -> front]);
	printf("%d   %d   %d\n", dequeue(circleQueue), circleQueue -> front, circleQueue -> array[circleQueue -> front]);
	freeSpace (circleQueue);
}