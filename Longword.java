package sample;
import java.util.Scanner;
public class Longword {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the line:");
		
		String input = sc.nextLine();
		int count = 0;
		String output = "";
		String arr[] = input.split(" ");
		
		for (int i = 0; i < arr.length; i++) {
			int Temp = arr[i].length();
			
			if(Temp > count) {
				count = Temp;
				output = arr[i];
			}
		}
		System.out.println(count);
		System.out.println(output);
		
	}
}
