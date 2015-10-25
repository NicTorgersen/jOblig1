package oblig1;

public class Writer {
	
	public int maxWords = 10;
	
	public void printBackwards (String[] words) {
		System.out.println("---- Printing backwards ----");
		for (int i = maxWords - 1; i >= 0; i--) {
			System.out.println((i+1) + ".\t" + words[i]);
		}
	}
	
	public void printStraightForward (String[] words) {
		System.out.println("---- Printing normally ----");
		for (int i = 0; i < maxWords; i++) {
			System.out.println((i+1) + ".\t" + words[i]);
		}
	}
	
	public void printEveryOther (String[] words) {
		System.out.println("---- Printing every other ----");
		for (int i = 0; i < maxWords; i++) {
			if (i % 2 == 0) {
				System.out.println((i+1) + ".\t" + words[i]);
			}
		}
	}
	
}
