/* This segment code is here to get a basis of understanding arrays and using the Arrays class
 * This program does the following:
 	- Sums values within an array (Complete)
 	- Finds a specific value within the array (Complete)
 	- Removes an element from the array ()
 	- Reverses the values of an Array ()
 	- 
 */
import java.util.*;
import java.util.Arrays;



public class ArrayChallenge2 {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String [] args)
	{
		int size = 4;
		int[] myArray = new int[size];
		populateArray(myArray);
		sumArray(myArray);
		printArray(myArray);
		removeValue(myArray, 1);
		if(findValue(myArray,5) != 0)
		{
			System.out.println("\nValue found!");
		}
		else
		{
			System.out.println("\nValue not Found!");
		}
		System.out.println(Arrays.toString(myArray));
	}
	
	//Function that sums values within an integer array
		public static int sumArray(int[] array)
		{
			int sum = 0;
			for(int i = 0; i < array.length; i++)
			{
				sum +=array[i];
			}
			return sum;
		}
	//Function that finds specific value within an array
	public static int findValue(int[]array, int value)
	{
		for(int i = 0; i < array.length;i++)
		{
			if(array[i] == value)
			{
				
				return value; //Value is returned if true
			}
			 
		}
		
		return 0; // If no value is found
	}
	//Removes a value from an Array
	public static int[] removeValue(int[] array, int index)
	{
		
		for(int i = 0; i < array.length;i++)
		{
			if (i != index) 
			{
				int [] tempArray = new int[array.length - 1];
		        System.arraycopy(array, 0, tempArray, 0, i);
		        System.arraycopy(array, i+1, tempArray, i, array.length-i-1);
		        return tempArray;
		    }
		}
		return array;
	}
	//Populates array with user input
	public static void populateArray(int[] array)
	{
		System.out.println("Enter all the integer values: ");
		for (int i = 0 ; i < array.length; i++ ) 
		{
	           array[i] = scan.nextInt();
	    }
		scan.nextLine();//Clears the line 
	}
	
	//Function that prints Array
	public static void printArray(int [] array)
	{
		System.out.print("Elements within the array: ");
		for(int i = 0; i < array.length;i++)
		{
			System.out.print(array[i] + " ");
		}
	}

}
