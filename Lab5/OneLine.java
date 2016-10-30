//This program uses a circle queue to simulate a bank where there are three tellers and one Line
//Each customer randomly waits 1 to 5 seconds before entering the line and each teller randomly takes
// 1 to 5 seconds to finish with a Customer
//The program outputs the average time each customer waited in line

import java.util.Random;

public class OneLine {
	private CircleQueue Line = new CircleQueue(100);
	private int teller1 = 0, teller2 = 0, teller3 = 0;
	private int CustomerSpot = 0;
	private int TotalTime = 0;
	private Random rn = new Random();
	private boolean done = false;
	private int [] CustomerArray;
	public OneLine (){
		CustomerArray = new int [100];
	}
	public void store (int val, int address){
		CustomerArray[address] = val;
	}
	public void OneSecond (){
		if (CustomerSpot < 100){
			CustomerArray[CustomerSpot]--;
			if (CustomerArray[CustomerSpot] == 0){
				Line.enqueue(CustomerArray[CustomerSpot]);
				CustomerSpot++;
			}
		}
		else if (Line.isEmpty())
			done = true;
		if (!Line.isEmpty()){
			TotalTime += Line.size();
		}
		if (teller1 == 0 && !Line.isEmpty()){
			Line.dequeue();
			teller1 = rn.nextInt(4) + 1 ;
		}
		else if (teller1 > 0)
			teller1--;
		if (teller2 == 0 && !Line.isEmpty()){
			Line.dequeue();
			teller2 = rn.nextInt(4) + 1;
		}
		else if (teller2 > 0)
			teller2--;
		if (teller3 == 0 && !Line.isEmpty()){
			Line.dequeue();
			teller3 = rn.nextInt(4) + 1;
		}
		else if (teller3 > 0)
			teller3--;
	}
	public boolean isDone(){
		if (done)
			System.out.println("The average time a customer waited in Line for 1 queue was: " + (float)(TotalTime/100.0));
		return done;
	}
}
