package models;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;

public class Manager {

	private static final String REGEX = " ";
	private static final String PATH_AUTOSAVE_FILE = "files/autosave";
	private static final char JUMP_LINES = '\n';
	private static final int INITIAL_LINES = 1;	

	public void writeFile(String word) throws IOException {
		FileWriter writer = new FileWriter(PATH_AUTOSAVE_FILE);
		writer.write(word);
		writer.close();
	}

	public int countLines(String text) {
		int count = INITIAL_LINES;
		for (int i = 0; i < text.length(); ++i) {
			if (text.charAt(i) == JUMP_LINES)
				count++;
		}
		return count;
	}
	
	public int searchWord(String text, String textSearch) {
		int count = INITIAL_LINES;
		for (int i = 0; i < text.length(); ++i) {
			if (text.charAt(i) == JUMP_LINES)
				count++;
		}
		return count;
	}

	public int countWordsText(String text) {
		StringTokenizer st = new StringTokenizer(text);
		int count = st.countTokens();
		return count;
	}

	public ArrayList<Word> createListTopWords(String text) {
		Map<String, Integer> mapCount = createMapCountWords(text);
		ArrayList<Word> list = new ArrayList<Word>();
		for (Entry<String, Integer> entry : mapCount.entrySet()) {
			list.add(new Word(entry.getKey(), entry.getValue()));
		}
		ordArrayWordsForValue(list);
		return list;
	}
	
	private Map<String, Integer> createMapCountWords(String text) {
		Map<String, Integer> mapCount = new HashMap<String, Integer>();
		String textEdit = (text != null)? text.toUpperCase(): "";
		for (String word : textEdit.split(REGEX)) {
			Integer count = mapCount.get(word);
			if (mapCount.get(word) == null)
				count = 0;
			mapCount.put(word, count + 1);
		}
		return mapCount;
	}
	
	private static ArrayList<Word> ordArrayWordsForValue(ArrayList<Word> listIn) {
		Collections.sort(listIn);
		return listIn;
	}	 
}