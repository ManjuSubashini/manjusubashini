package week3.day1;


import java.util.Arrays;

public class PrintDuplicates {
	
	public static void main(String[] args) {
		int[] array = {14,12,13,11,15,14,18,16,17,19,18,17,20};
	
		 Arrays.sort(array);
		 int i,j,frequency;
		 
	      System.out.println("These elements are repeated");
	
	      for(i=0; i<array.length; i++){
	          frequency = 1;
	          for(j=i+1; j<array.length; j++){
	             if(array[j] == array[i]){
	                frequency++;
	             } else {
	                break;
	             }
	          }
	          i=j-1;
	          if(frequency > 1){
	          
	             
	             System.out.println(array[i] + " " + frequency);
	          }
	       }
	    }
	    
	 }
