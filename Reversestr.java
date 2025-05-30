package sample;

public class Reversestr {
	public static void main(String args[]){
		String input = "Hello Good Morning";
		String output = "",finaloutput = "";

		String arr[] = input.split(" ");
		
		for (int i = 0; i<arr.length; i++) {
			output= "";
			for (int j = arr[i].length()-1; j>=0; j--) {
				output = output+ arr[i].charAt(j);
			}
			finaloutput = finaloutput + output+" ";
		}
		System.out.print(finaloutput);
	}
}
