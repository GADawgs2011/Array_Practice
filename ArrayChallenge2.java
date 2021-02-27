/* This segment code is here to get a basis of understanding arrays and using the Arrays class
 * This program does the following:
 	- Sums values within an array (Complete)
 	- Finds a specific value within the array (Complete)
 	- Removes an element from the array (Complete)
 	- Reverses the values of an Array (Complete)
 	- 
 */
import java.util.*;



public class ArrayChallenge2 {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String [] args)
	{
		int size = 4;
		int[] myArray = new int[size];
		populateArray(myArray);
		sumArray(myArray);
		printArray(myArray);
		if(findValue(myArray,5) != 0)
		{
			System.out.println("\nValue found!");
		}
		else
		{
			System.out.println("\nValue not Found!");
		}
		removeValue(myArray, 1);
		/*Since an array can't change isn't dynamic, the size of an array doesn't change after removal*/
		System.out.println(Arrays.toString(myArray));
		reverseArray(myArray);
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
	//Function Reverses value of an array
	public static int [] reverseArray(int[]array)
	{
		for(int i = 0; i < array.length/2; i++)
		{
			int temp = array[i];
			array[i] = array[array.length-i-1];
			array[array.length-i-1] = temp;
		}
		
		return array;
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
	public static  int[] removeValue(int[] array, int index)
	{
		int remove = index;
		for(int i = remove; i < array.length -1; i++)
		{
			array[i] = array[i+1];
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
