import java.util.*;
public class Sorter {
	
	
	
	public static void main(String[] args) {
		Integer numOfValues;
		Scanner scnr = new Scanner(System.in);
		System.out.print("How many values?");
		numOfValues = Integer.valueOf(scnr.nextInt());
		Integer[] values = new Integer[numOfValues];
		Integer temp;
		Integer i;
		Integer j;
		
		for (i = Integer.valueOf(0); i.compareTo(numOfValues) < 0; i = Integer.sum(i, 1)) {
			System.out.println();
			System.out.print("Please type in your number. " + i.toString() + " numbers inputted." );
			values[i.intValue()] = scnr.nextInt();
		}
		System.out.println();
		for (i = 0; i < numOfValues - 1; i++) {
			for (j = 0; j< numOfValues - i - 1; j++) {
				if (values[j] > values[j + 1]) {
					temp = values[j];
					values[j] = values[j+1];
					values[j + 1] = temp;
				}
			}
		}
		System.out.println("Numbers Sorted");
		System.out.println("----------------");
		for (i = 0; i < numOfValues; i++) {
			System.out.println(values[i]);
		}
	}
}
