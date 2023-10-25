package week3.day1;

import java.util.Arrays;


public class MissingElement {
	
public static void main(String[] args) {
	

	
	int[] input = {1,2,3,4,7,6,8};
	  int n = input.length + 1;
	  int m = sum(n);
	  int Array1 = Array2(input);
	  int missingNumber = m - Array1; 
	  System.out.println("Missing number in an array is : " 
              + missingNumber);
}
public static int sum(int n){
    int sum = (n*(n+1))/2;
    return sum;
}

public static int Array2(int[] input){
    int sum = 0;
    for(int i=0; i < input.length ;i++){
        sum = sum + input[i];
    }
    return sum;
}

}
	

	
	 