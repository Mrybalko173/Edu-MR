package main;

/**Print element of array
 * @author mikhail.rybalko
 *
 */
public class Print {
	public static void print(int[] arr) {
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
