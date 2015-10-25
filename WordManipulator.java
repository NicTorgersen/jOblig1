package oblig1;

public class WordManipulator {
	
	public static void main(String[] args) {
		Writer writer = new Writer();
		Dialogue dialogue = new Dialogue();
		String[] words = dialogue.fetchWords(writer);
		writer.printBackwards(words);
		writer.printStraightForward(words);
		writer.printEveryOther(words);
	}
	
}
