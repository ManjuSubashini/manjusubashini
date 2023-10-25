package week3.day1;

public class Palindrome {

	 public static void main(String[] args) {
		
	        String input = "madam";
	        String reversed = "";
	        char[] cs =input.toCharArray();
	        for (int i =cs.length- 1; i >= 0; i--) {
	            reversed = reversed +cs[i];
	        }
	        if (input.equals(reversed))
	       
        {
            System.out.println("Input "+" is a palindrome.");
        } else {
            System.out.println( "Input" +" is not a palindrome.");
        }
    }
}


