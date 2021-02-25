/*Calculate Average of Array Elements in Java*/
import java.util.Arrays;
import java.util.Scanner;
public class ArrayChallenge 
{
 //Scanner constructor
public static Scanner scan = new Scanner(System.in);
//main method	
	public static void main(String [] args)
	{
		int size = 3;
	    int [] numArray = new int [size];
	    String [] stringArray = new String[3];
	    
	    //Setting values within the String and Integer Arrays:
	    System.out.println("Enter the elements of the array one by one ");
	    setIntArray(numArray); //Integer type
	    System.out.println("Enter the elements of the array one by one ");
	    setStringArray(stringArray);//String type
	    
	    //Print out String Array
	    System.out.print("String Array before sort: ");
	    printStringArray(stringArray);
	    //Print out Integer Array
	    System.out.print("Integer Array before sort: ");
	    printIntArray(numArray);
	    //Sorting the Int and String Array
	    System.out.println();//Clear a line
	    sortArray(numArray,stringArray);
	    System.out.print("String Array after sort: ");
	    printStringArray(stringArray);
	    System.out.print("Integer Array after sort: ");
	    printIntArray(numArray);
	    
	}
// Write a Java program to sort a numeric array and a string array.
	public static void sortArray(int[] array, String[] arr)
	{
		//Insertion Sort an Int []array:
		for(int i = 1;i < array.length; i++) 
		{
			int key = array[i];
			int j = i - 1;
			while(j >= 0 && array[j] > key)
			{
				array[j+1] = array[j];
				j = j -1;
			}
			array[j+1] = key;
		}
		//Calling the Arrays Sort method for the String[] arr
		Arrays.sort(arr);
		
		
	}
	//Set an integer array (Using a Temp Array)
	public static void setIntArray(int [] array)
	{	
		int [] tempArray = array;
		for(int i=0; i<tempArray.length; i++)
		{
			tempArray[i] = scan.nextInt();	
			
			array[i] = tempArray[i];
		}
		scan.nextLine(); // Clears a line after the use of "nextInt()"
	}
	//Set a String array (Using NO temp Array)
		public static void setStringArray (String[] array)
		{	
			
			for(int i=0; i<array.length; i++)
			{
				
				array[i] = scan.nextLine();
			}
		}
		//Print out a String Array
		public static void printStringArray(String[] array)
		{
			
			for(int i = 0; i < array.length;i++)
		    {
		    	System.out.print(array[i] + " ");
		    }
			System.out.println();// Clears a line
		}
		//Print out an Integer Array
		public static void printIntArray(int[] array)
		{
			
			for(int i = 0; i < array.length;i++)
		    {
		    	System.out.print(array[i] + " ");
		    }
			System.out.println();// Clears a line
		}
	
}