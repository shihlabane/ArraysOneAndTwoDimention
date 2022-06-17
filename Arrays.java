package Arrays;

import java.lang.*;
import java.util.Arrays;

public class TwoLargestAndSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		  Write a program to find the largest 2 numbers and
		   the smallest 2 numbers in the given array
		 */
		
		int[] arr = new int[] {8,4,5,2,3,9};
		
		
	     Arrays.sort(arr);
	
		
		int length = arr.length;
		System.out.println("Two lagest "  + arr[length-1]+ " and "+  arr[length-2]);
		System.out.println("Two smallest: "  + arr[0]  + " and "+  arr[1]);
        
        

	}

}


_______________________________________________________________________________

package Arrays;

public class SumOnGivenCondion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 
		 Write a program to print the sum of the elements of the array with the given
		 below condition. If the array has 6 and 7 in succeeding orders, ignore 6 and 7 and
		 the numbers between them for the calculation of sum.
         Eg1) Array Elements - 10,3,6,1,2,7,9
         O/P: 22  
         [i.e 10+3+9]
         Eg2) Array Elements - 7,1,2,3,6
         O/P:19
         Eg3) Array Elements - 1,6,4,7,9
          m   O/P:10
		 
		 */
		
		
		int[] arr = new int[] {10,3,6,1,2,7,9};
		int sum =0;
		
		for(int i =0; i < arr.length; i++)
		{
			if(arr[i] == 6) {
				i++;
				int temp = arr.length;
				int count = temp-1;
				for(int x = i; x< count;x++ ) {
					i++;
					if(arr[i] == 7)
						continue;
				}
				
			}else if(arr[i]  == 7) {
				
			}
			
			sum += arr[i];
			
		}
		System.out.println(sum);
	}

}


_____________________________________________________________________________


package Arrays;
import java.util.*;
public class ReveserdDimentionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*Write a program to reverse the elements of a given 2*2 array. Four integer numbers needs to be passed as Command Line arguments.
		Example1:
		 C:\>java Sample 1 2 3
		      O/P Expected: Please enter 4 integer numbers
		Example2:
		 C:\>java Sample 1 2 3 4
		 O/P Expected:
		The given array is:
		1 2
		3 4
		The reverse of the array is:
		4 3
		2 1*/
		
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[2][2] ;
		int count=1;
		final int col = 2;
		do {
			
			for(int i =0; i<2; i++) {
				
				for(int x =0; x<2; x++) {
					
					int num = sc.nextInt();
					arr[i][x] = num;
					count++;
				}
				
			}
			
		}while(count == 4);
		
		int my_rows = arr.length;
	    int my_cols = arr.length;
	    
	    for(int i = my_rows-1; i >= 0; i--) {
	        for(int j = my_cols-1; j >= 0; j--) {
	            arr[my_rows-1-i][my_cols-1-j] =arr[i][j];
	        }
	    }
	    for(int i = 0; i < my_rows; i++) {
	        for(int j = 0; j < my_cols; j++) {
	            System.out.print(arr[i][j]+" ");
	            }
	     }
		
		for(int i = 0; i< arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
                System.out.println();

        }
		
		
		
	}

}

__________________________________________________________________




package Arrays;

import java.util.Arrays;

public class RemoveDuplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 . Write a program to remove the duplicate elements in an array and print
           Eg) Array Elements--12,34,12,45,67,89
           O/P : 12,34,45,67,89
		 */
		
		int[] arr = new int[] {12,34,12,45,67,89};
 
		
		int no_unique_elements = arr.length;
        
    
         
        for (int i = 0; i < no_unique_elements; i++) 
        {
            for (int j = i+1; j < no_unique_elements; j++)
            {
                
                 
                if(arr[i] == arr[j])
                {
                    
                     
                    arr[j] = arr[no_unique_elements-1];
                     
                    no_unique_elements--;
                     
                    j--;
                }
            }
        }
        
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+"\t");
        }
        
        
	}

}



__________________________________________

package Arrays;

import java.util.Arrays;

public class PrintedSortedFashion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 6. Write a program to initialize an array and print them in a sorted fashion
		 */
		
		int[] arr = new int[] {4,6,12,8,3};
		
		Arrays.sort(arr);
		for(int i =0; i < arr.length; i++)
			System.out.print(arr[i]);
	}

}

_________________________________________________


package Arrays;

public class NumberThatHasRepeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
    int[] arr = new int[] {12,34,10,45,67,10};
 
		
		int no_unique_elements = arr.length,temp=0;;
        
    
         
        for (int i = 0; i < no_unique_elements; i++) 
        {
            for (int j = i+1; j < no_unique_elements; j++)
            {
                
                 
                if(arr[i] == arr[j])
                {
                    
                     
                    arr[j] = arr[no_unique_elements-1];
                     temp = arr[i];
                    no_unique_elements--;
                     
                    j--;
                }
            }
        }
        
       System.out.print(temp);
	}

}



