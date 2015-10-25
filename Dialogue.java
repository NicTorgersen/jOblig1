package oblig1;

import java.util.Scanner;

public class Dialogue {
	
	public String[] fetchWords (Writer writer) {
		String[] words = new String[writer.maxWords];
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < writer.maxWords; i++) {
			System.out.print("Du er på ord nummer " + (i+1) + ": ");
			words[i] = input.next();
		}
		return words;
	}
	
}