package models;

public class Word implements Comparable<Word> {

	private String word;
	private int count;

	public Word(String word, int count) {
		this.word = word;
		this.count = count;
	}

	public String getWord() {
		return word;
	}

	public int getCount() {
		return count;
	}

	@Override
	public int compareTo(Word o) {
		if (count > o.count) {
			return -1;
		}else if (count < o.count) {
			return 1;
		}else {
			return 0;
		}	
	}
}