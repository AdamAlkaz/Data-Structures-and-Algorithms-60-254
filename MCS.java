//DSA Lab 3
//Two different algorithms are made to calculate maximum contiguous
//subsequences (MCS) and compare their space time complexities
import java.util.*;

public class MCS {
	private int maxsum = 0, start = -1, end = -1, iterations;
	private int a[];
	public MCS(){
	}
	public void print(){
		System.out.println("Max is " + maxsum + ", start index is " + (start + 1) + ", end index is " + (end + 1) + ", number of iterations " + iterations);
		//System.out.println(iterations);
	}

	public void MCS_BruteForce(int a[]){
		this.a = a;
		int sum;
		iterations = 0;
		for (int i = 0; i < a.length; i++){
			sum = 0;
			for (int j = i ; j < a.length; j++){
				sum += a[j];
				if (sum > maxsum){
					maxsum = sum;
					start = i;
					end = j;
				}
				iterations+=1;
			}
		}
	}

	public void MCS_Improved(int a[]){
		this.a = a;
		int sum = 0, i = 0;
		start = -1;
		end = -1;
		iterations = 0;
		for (int j = i ; j < a.length ; j++){
			sum += a[j];
			if (sum > maxsum){
				maxsum = sum;
				start = i;
				end = j;
			}
			if (sum < 0){
				i = j + 1;
				sum = 0;
			}
			iterations += 1;
		}
	}

	public static void main (String arg[]){
		MCS calc = new MCS();
		int a[];
		for (int i = 1; i <= 100; i++){
			a = new int [i];
			for (int j = 0; j < i; j++){
				a[j] = (int)(Math.random() * 201 - 100);
			}
			calc.MCS_Improved(a);
			calc.print();
		}
		System.out.println("\n\n\n\n");
		for (int i = 1; i <= 100; i++){
			a = new int [i];
			for (int j = 0; j < i; j++){
				a[j] = (int)(Math.random() * 201 - 100);
			}
			calc.MCS_BruteForce(a);
			calc.print();
		}
	}
}
