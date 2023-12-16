package week1.day2;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
							
	int[]	scores = {100, 45, 67, 34, 43};
    System.out.println("Before sorting my score looks like");
		for(int i=0;i<scores.length;i++) {
			System.out.println(scores[i]);
		}
		// give me sorted array
		
		Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));
        System.out.println("After sorting my score looks like");
    	for(int i=0;i<scores.length;i++) {
			System.out.println(scores[i]);
		}

		
		// give me least number
    	
        System.out.println("Least number is "+scores[0] );
		// give me largest number
    	
        System.out.println("Largest number is "+scores[scores.length-2] );
         
    	
		
	
	}


	
}


