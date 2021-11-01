/**
TNPG: Beetle Bug (Ben Beloster and Anjini Katari)
APCS
HW27: FOR the Love of Strings
2021-10-29
time spent: 1.5
DISCO:
 * Syntax: initialize string before for loop, then assign it a val after
 * Substring is not like Python slicing! Using -1 will not give you the last character in the string
 * An empty string return length of 0
QCC:
 * Is there a java version of slicing?
**/


public class Rof {
	public static void main(String[] args) {
	//fenceF
		System.out.println(fenceF(3));
                System.out.println(fenceF(1));
                System.out.println(fenceF(0));

	//reverseF
		System.out.println(reverseF("four"));
		System.out.println(reverseF("Anjini"));
                System.out.println(reverseF("Ben"));
                System.out.println(reverseF("stressed"));
	}

//fenceF(int posts) takes non-negative integer posts, and returns a String representation of a fence with the specified number of posts. Uses a
	public static String fenceF(int posts) {
		String fence;
		for (fence = ""; posts > 0; posts = posts - 1) {
			if (posts == 1) {
				fence += "|";
			}
			else {
				fence += "|--";
			}
		}
		return fence;
	}

//a non-empty String s and returns s with its letters reversed. Uses a FOR loop.

	public static String reverseF(String s) {
		int len = s.length();
		int less;
		String reverse;
		
		for (reverse = ""; len > 0; len = len - 1) {
			less = len - 1;
			reverse += s.substring (less, len); 
		}
		return reverse;
	}

}
