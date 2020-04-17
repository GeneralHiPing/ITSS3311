package as4;
import java.util.Scanner;
public class StrictlyIdentical {

	public static void main(String[] args) {
		
		int list1[] = new int [5], list2[] = new int [5];
		in(list1); //invoking input function for list1
		in(list2); //invoking input function for list2
		System.out.println(equal(list1, list2) ? "Two list are strictly identical":"Two list are not strictly identical" ); //invoke function equal. Check for true/false
	}
	public static int[] in(int[]array){
		
		for(int i = 0; i < array.length; i++)  { //cycle through all available empty spaces for the string
			System.out.print("Enter character at position " + (i+1) + " for list " + array + ":");
			array[i] = new Scanner(System.in).nextInt();
			} //assign input number for each of the space within the 
		return array; //return the newly created array
	}

	public static boolean equal(int[]array1, int[]array2){
		
		for(int i = 0; i < 5; i++) {
			if(array1[i]==array2[i]) { //Cycling through every component and check for identical
				i++;
			}
			else {
				return false; //false if a difference is found
			}
		}
		return true; //true if loop completes a.k.a when all component are identical
	}
	
}
/*TEST RUNS
Enter character at position 1 for list [I@214c265e:1
Enter character at position 2 for list [I@214c265e:2
Enter character at position 3 for list [I@214c265e:3
Enter character at position 4 for list [I@214c265e:4
Enter character at position 5 for list [I@214c265e:5
Enter character at position 1 for list [I@6e8cf4c6:1
Enter character at position 2 for list [I@6e8cf4c6:2
Enter character at position 3 for list [I@6e8cf4c6:3
Enter character at position 4 for list [I@6e8cf4c6:4
Enter character at position 5 for list [I@6e8cf4c6:5
Two list are strictly identical */
