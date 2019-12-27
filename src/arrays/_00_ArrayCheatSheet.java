package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String [] array = {"Hello", "Hi", "Hey", "Sup", "Howdy"};
		//2. print the third element in the array
		System.out.println(array[3]);
		//3. set the third element to a different value
		array[3] = "Hola";
		//4. print the third element again
		System.out.println(array[3]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int x = 0; x<5; x++) {
			System.out.println(array[x]);
		}
		
		//6. make an array of 50 integers
		int [] array2 = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		Random rand = new Random();
		
		
		for (int y = 0; y<50; y++) {
			int z = rand.nextInt(50);
		array2[y] = z;	
		}
		//8. without printing the entire array, print only the smallest number in the array
		int smallest = array2[0];
		for (int a = 0; a<50; a++) {
			if (array2[a] < smallest) {
				smallest = array2[a];
			}
		}
		System.out.println(""+smallest);
	
		//9 print the entire array to see if step 8 was correct
		for (int b = 0; b<50; b++) {
		System.out.println(array2[b]);
		}
		//10. print the largest number in the array.
		int largest = array2[0];
		for (int c = 0; c<50; c++) {
			if (array2[c] > largest) {
				largest = array2[c];
			}
		}
		System.out.println(""+largest);
	}
}
