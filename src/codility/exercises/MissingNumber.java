package codility.exercises;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,1,6,2,4,3};
		System.out.println(solution(arr));
	}
	
	public static int solution(int[] A) {
		//sort the array first
		Arrays.sort(A);
		
		int minPositiveInt = 1; //assign minimum positive integer as 1
		int arrayLength = A.length;
		
		//loop into the sorted array 
		for(int i = 0;i<arrayLength;i++) {
			//check if A[i] is equal to the minimum positive integer
			if(A[i] == minPositiveInt) {
				/*if A[i] is equal to the current
				 * minimum positive integer,
				 * increment the minimum positive integer.
				 */
				minPositiveInt++;  
			}
		}
		return minPositiveInt;
	}

}
