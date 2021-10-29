public class Rof {
	public static void  main(String[] args) {
		System.out.println(reverseF("four"));
} 
	public static String reverseF(String s) {
		int len = s.length();
		int less;
		String reverse;
		for ( reverse = ""; len > 0 ; len = len - 1) {
			less = len - 1 ;
			reverse = s.substring (less, len) ; 
		}
		return reverse;
	}
	}
 
