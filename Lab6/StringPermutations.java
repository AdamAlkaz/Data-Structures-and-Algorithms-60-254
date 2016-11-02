/* This program uses recursion to take a string and
output al the possible permutations of its letters*/

import java.util.Scanner;
public class StringPermutations {
	private char temp;
	public StringPermutations (String a){
		Mutate (a.substring(0,1), a.substring(1));
	}
	public void Mutate (String beginning, String rest){
		if (rest.length() == 0){
			System.out.println(beginning);
		}
		else{
			Mutate (beginning + rest.charAt(0), rest.substring(1));
			for (int i = 0; i < rest.length(); i++){
				temp = rest.charAt(i);
				rest = rest.substring(0,i) + beginning.charAt(beginning.length() - 1) + rest.substring(i + 1);
				beginning = beginning.substring(0, beginning.length() -1) + temp;
				Mutate (beginning + rest.charAt(0), rest.substring(1));
			}
		}
	}
	public static void main (String arg[]){
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Enter a String");
		StringPermutations Lab6 = new StringPermutations (keyboard.nextLine());
	}
}
