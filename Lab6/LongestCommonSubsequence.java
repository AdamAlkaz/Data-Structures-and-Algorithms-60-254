/*This program takes two strings and uses recursion to output the string
of the longest common subsequence and the two initial strings*/

public class LongestCommonSubsequence {
	public String LCS_String = "";
	public String a;
	public String b;
	public LongestCommonSubsequence(String A, String B) {
		a = new String(A);
		b = new String (B);
		LCS(A,B);
	}
	public int LCS (String A, String B){
		if (A.length() == 0 || B.length() == 0){
			return 0;
		}
		int lenA = A.length();
		int lenB = B.length();
		if (A.charAt(lenA - 1) == B.charAt(lenB - 1)) {
			if (!LCS_String.matches("(.*)[A.charAt(lenA - 1)](.*)"))
					LCS_String += A.charAt(lenA - 1);
			return 1 + LCS(A.substring(0, lenA - 1), B.substring(0, lenB - 1));
		} else {
			return Math.max(
					LCS(A.substring(0, lenA - 1), B.substring(0, lenB)),
					LCS(A.substring(0, lenA), B.substring(0, lenB - 1)));
		}
	}
	public static void main (String arg[]){
		LongestCommonSubsequence lab6 = new LongestCommonSubsequence ("made", "adam");
		System.out.println("Between Strings " + lab6.a + " and " + lab6.b + " the longest common subesequence is " + lab6.LCS_String);
	}
}
