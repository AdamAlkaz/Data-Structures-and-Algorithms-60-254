//This program uses three circle queues to simulate three lines waiting for three bank tellers
//Each customer waits 1 to 5 seconds before entering the smallest line
//Each teller randomly takes 1 to 5 seconds to finish with a customer
//The program outputs the average time each customer was waiting in a line

import java.util.Random;

public class ThreeLines {
	private int TotalTime = 0;
	private CircleQueue Line1 = new CircleQueue (100);
	private CircleQueue Line2 = new CircleQueue (100);
	private CircleQueue Line3 = new CircleQueue (100);
	private int teller1 = 0;
	private int teller2 = 0;
	private int teller3 = 0;
	private int CustomerSpot = 0;
	private Random rn = new Random ();
	private boolean done = false;
	private int CustomerArray[];

	public ThreeLines(){
		CustomerArray = new int [100];
	}
	public void store(int val, int address){
		CustomerArray[address] = val;
	}
	public void OneSecond (){
		if (CustomerSpot < 100){
			CustomerArray[CustomerSpot]--;
			if (CustomerArray[CustomerSpot] == 0){
				if (Line1.size() < Line2.size() && Line1.size() < Line3.size()){
					Line1.enqueue(CustomerArray[CustomerSpot]);
				}
				else if (Line2.size() < Line1.size() && Line2.size() < Line3.size()){
					Line2.enqueue(CustomerArray[CustomerSpot]);
				}
				else Line3.enqueue(CustomerArray[CustomerSpot]);
				CustomerSpot++;
			}
		}
		else if (Line1.isEmpty() && Line2.isEmpty() && Line3.isEmpty()){
			done = true;
		}
		TotalTime += Line1.size() + Line2.size() + Line3.size();
		if (teller1 == 0 && !Line1.isEmpty()){
			teller1 = rn.nextInt(4) + 1;
			Line1.dequeue();
		}
		else if (teller1 > 0)
			teller1--;
		if (teller2 == 0 && !Line2.isEmpty()){
			teller2 = rn.nextInt(4) + 1;
			Line2.dequeue();
		}
		else if (teller2 > 0)
			teller2--;
		if (teller3 == 0 && !Line3.isEmpty()){
			teller3 = rn.nextInt(4) + 1;
			Line3.dequeue();
		}
		else if (teller3 > 0)
			teller3--;
	}
	public boolean isDone(){
		if (done)
			System.out.println("Average a customer waited for three lines is " + (float)(TotalTime/100.0));
		return done;
	}
}
