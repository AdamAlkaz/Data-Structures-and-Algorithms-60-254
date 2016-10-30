//This program creates an array of 100 customers then puts the same array in the OneLine and ThreeLines program
//This will then output which how long each process took

import java.util.Random;
public class MainSimulation {
	public static void main (String args[]){
		Random rn = new Random ();
		int val;
		OneLine Test1 = new OneLine ();
		ThreeLines Test2 = new ThreeLines();
		for (int i = 0 ; i < 100; i++){
			val = rn.nextInt(4) + 1;
			Test1.store(val, i);
			Test2.store(val, i);
		}
		while (!Test1.isDone() || !Test2.isDone()){
			Test1.OneSecond();
			Test2.OneSecond();
		}
	}
}
