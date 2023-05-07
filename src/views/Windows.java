package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JFrame;

import models.Word;

public class Windows extends JFrame {

	private JPanelPrincipal jPanelPrincipal;

	private static final long serialVersionUID = 1L;

	public Windows() {
		this.setSize(800, 550);
		this.setBackground(Color.WHITE);
		this.setLayout(new BorderLayout());
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		initiComponents();
		addCardsToWindows();
		this.setVisible(true);
	}

	public void initiComponents() {
		jPanelPrincipal = new JPanelPrincipal();
	}

	public void addCardsToWindows() {
		this.add(jPanelPrincipal);
	}
	
	public String getTextWritteUser() {
		return jPanelPrincipal.getTextWritteUser();
	}
	
	public void fillListTopWords(ArrayList<Word> wordList) {
		jPanelPrincipal.fillListTopWords(wordList);	
	}
	
	public void setTextNumberWords(int textUpdate) {
		jPanelPrincipal.setTextNumberWords(textUpdate);
	}

	public void setTextNumberLines(int textUpdate) {
		jPanelPrincipal.setTextNumberLines(textUpdate);
	}
	
	public void setValueOne(int valueOne) {
		jPanelPrincipal.setValueOne(valueOne);
	}

	public void setValueTwo(int valueTwo) {
		jPanelPrincipal.setValueOne(valueTwo);
	}

	public void setValueThree(int valueThree) {
		jPanelPrincipal.setValueOne(valueThree);
	}

	public void setValueFour(int valueFour) {
		jPanelPrincipal.setValueOne(valueFour);
	}

	public void setValueFive(int valueFive) {
		jPanelPrincipal.setValueOne(valueFive);
	}
}