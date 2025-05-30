package sample;

public class Countwords {
	public static void main(String args[]) {
		String input = "Hello Good Morning";
		int WordCount = 0;
		input=input.trim();
		for (int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == ' ' && input.charAt(i+1) != ' ') {
				WordCount ++;
			}
		}
		System.out.print(++WordCount);
	}

}
