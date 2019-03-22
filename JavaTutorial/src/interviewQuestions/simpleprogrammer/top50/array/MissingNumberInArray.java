package interviewQuestions.simpleprogrammer.top50.array;

import java.util.Arrays;
import java.util.BitSet;

public class MissingNumberInArray {
	
	private static int findunique(int[] arrA) {
		
		int x = arrA[0];
		
		for(int i=1;i< arrA.length;i++) {
			x=x^arrA[i];
		}
		
		return x;
		
	}
	 
    public static void main(String args[]) {

        // one missing number
        printMissingNumber(new int[]{1, 2, 3, 4, 6}, 6);
        
        System.out.println(getMissingNo(new int[]{1, 2, 3, 4, 6}, 6));
 
        // two missing number
        printMissingNumber(new int[]{1, 2, 3, 4, 6, 7, 9, 8, 10}, 10);
 
        // three missing number
        printMissingNumber(new int[]{1, 2, 3, 4, 6, 9, 8}, 10);
 
        // four missing number
        printMissingNumber(new int[]{1, 2, 3, 4, 9, 8}, 10);
 
        // Only one missing number in array
        int[] iArray = new int[]{1, 2, 3, 5};
        int missing = getMissingNumber(iArray, 5);
        System.out.printf("Missing number in array %s is %d %n", 

                           Arrays.toString(iArray), missing);
        
        System.out.println(findunique(new int[] {1,3,1,3,4,5,6,5,6}));
    }

   /**
    * A general method to find missing values from an integer array in Java.
    * This method will work even if array has more than one missing element.
    */
    private static void printMissingNumber(int[] numbers, int count) {
        int missingCount = count - numbers.length;
        BitSet bitSet = new BitSet(count+1);
 
        for (int number : numbers) {
            bitSet.set(number);
        }
 
        System.out.printf("Missing numbers in integer array %s, with total number %d is %n",
        Arrays.toString(numbers), count);
        int lastMissingIndex = 1;

        for (int i = 0; i < missingCount; i++) {
            lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
            System.out.println(lastMissingIndex);
            lastMissingIndex++;
        }
 
    }

   /**
    * Java method to find missing number in array of size n containing

    * numbers from 1 to n only.
    * can be used to find missing elements on integer array of 

    * numbers from 1 to 100 or 1 - 1000
    */
    private static int getMissingNumber(int[] numbers, int totalCount) {
        int expectedSum = totalCount * ((totalCount + 1) / 2);
        int actualSum = 0;
        for (int i : numbers) {
            actualSum += i;
        }
 
        return expectedSum - actualSum;
    }
    
    static int getMissingNo (int a[], int n) 
    { 
        int x1 = a[0];  
        int x2 = 1;  
          
        /* For xor of all the elements  
           in array */
        for (int i = 1; i < a.length; i++) 
            x1 = x1 ^ a[i]; 
                  
        /* For xor of all the elements  
           from 1 to n+1 */         
        for (int i = 2; i <= n; i++) 
            x2 = x2 ^ i;          
          
        return (x1 ^ x2); 
    } 
 
}
