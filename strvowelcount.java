package sample;

public class strvowelcount {
	public static void main(String args[]) {
		String input = "Hello Good Morning";
		input = input.toLowerCase().trim();
		int vowelc = 0;
		for (int i=0; i<input.length();i++) {
			if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u') {
				vowelc++;
			}
		}
		System.out.print(vowelc);
	}

}
