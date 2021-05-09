/*
Find and return the count of the adjacent occurrence of a number 
in the numbers array passed to the findTotalCount() method. 
Implement the logic inside findTotalCount() method.

Test the functionalities using the main method of the Tester class.

Sample Input and Output
Input  : { 1, 1, 5, 100, -20, 6, 0, 0 }
Output : 2

Input  : { 5, 6, 6, 6, 12, 1, 1, 0, 0 }
Output : 4
*/

package Assignments;

public class AdjacentNumberRepeatCount {
	public static int findTotalCount(int[] numbers) {
		//Implement your code here and change the return value accordingly
        int cur=0,prev=0,count=0;
        //Arrays.sort(numbers);
        for(int i=0;i<numbers.length;i++){
        	if(i==0){
        		cur=prev=numbers[i];
        		continue;
        	}
        	else{
        		cur=numbers[i];
        		if(cur==prev){
        			count++;
        		}
        		else{
        			prev=cur;
        		}
        	}
        }
		return count;
	}

	public static void main(String[] args) {
		int[] numbers = { 1, 1, 5, 100, -20, 6, 0, 0 };
		System.out.println("Count of adjacent occurrence: "+findTotalCount(numbers));
	}
}
