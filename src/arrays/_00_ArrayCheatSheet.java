package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] variable = {"first","second","third","forth","fifth"};
		//2. print the third element in the array
		System.out.println(variable[3]);
		//3. set the third element to a different value
		variable[3] = "notForth";
		//4. print the third element again
		System.out.println(variable[3]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i = 0; i<5; i++) {
			System.out.println(variable[i]);
		}
		
		//6. make an array of 50 integers
		int[] num = new int[50];
		for(int i =0; i<50; i++) {
			num[i]=i;
			//System.out.println(i);
		}
		//7. use a for loop to make every value of the integer array a random number
		int[] number = new int[50];
		Random rand = new Random();
		for(int i =0; i<50; i++) {
			number[i]=rand.nextInt();
			//System.out.println(number[i]);
		}
		//8. without printing the entire array, print only the smallest number in the array
		int smallest = number[0];
		for(int i=0; i<50; i++) {
			if(number[i]<smallest) {
				smallest=number[i];
			}
		}
		System.out.println(smallest);
		//9 print the entire array to see if step 8 was correct
		
		//10. print the largest number in the array.
		int largest = number[0];
		for(int i=0; i<50; i++) {
			if(number[i]>largest) {
				largest=number[i];
			}
		}
		System.out.println(largest);
	}
}
