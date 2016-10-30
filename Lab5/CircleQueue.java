//This is a simple program that uses an Array to implement a circle queue

import java.util.Iterator;
public class CircleQueue{
   private int size;
   private int front, rear;
   private Object[] queue;



   public CircleQueue (int size)
   {
      front = 0;
      rear = 0;
      queue = new Object[size];
      this.size = size;
   }

   public void enqueue (Object element)
   {
	  if (isFull()){
		  System.out.print("Queue full ");
	  }
	  else{
		  queue[rear] = element;
		  rear = (rear+1) % size;
	  }
   }


   public Object dequeue(){
      if (isEmpty()){
    	  System.out.print("Queue is Empty");
    	  return null;}

      Object result = queue[front];
      queue[front] = null;
      front = (front+1) % size;
      return result;
   }

   public Object front(){
      if (isEmpty()){
        System.out.print("Queue is empty ");
      	return null;}

      return queue[front];
   }

   public boolean isEmpty()
   {
	  if (front == rear)
		  return true;
	  return false;
   }

   public int size()
   {
      return (rear - front + size)% size;
   }

   public boolean isFull(){
	   if ((rear + 1)% size == front)
		   return true;
	   return false;
   }
}
