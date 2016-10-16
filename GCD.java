//gets greatest common denominator and checks its time space complexity
import java.util.*;

public class GCD {
	private int n;
	private int m;
	private int gcd;
	private int iterations;

	public GCD(){
	}

	public void GCDcalc (int m, int n){
		this.n = n;
		this.m = m;
		gcd = processRec(m,n);
		iterations = processRecIterations (m,n);
	}

	private int processRec(int m, int n){
		if (m % n != 0)
			return 0 + processRec (n, m % n);
		else
			return n;
	}

	private int processRecIterations(int m, int n){
		if (m % n != 0)
			return 1 + processRecIterations (n, m % n);
		else
			return 1;
	}

	public int getGCD(){
		return gcd;
	}
	public int getIterations(){
		return iterations;
	}

	public static void main (String a[]){
		GCD ans = new GCD ();
		int max [];
		max = new int [100];
		for (int m = 1 ; m < 101; m++){
			for (int n = 1; n <= m; n++){
				ans.GCDcalc(m, n);
				if (max[n-1] < ans.getIterations() - 1)
					max[n-1] = ans.getIterations() - 1;
			}
		}
		for (int i = 0; i<100; i++){
			System.out.println(max[i]);
		}
	}
}
