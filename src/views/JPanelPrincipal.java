package views;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import models.Word;

public class JPanelPrincipal extends JPanel {

	private static final String TEXT_EDITOR = "Editor Texto";
	private static final String TOP_WORDS = "Top palabras más usadas";
	private static final String FORMAT_TOP = "%d) %s = %d";
	private static final long serialVersionUID = 1L;
	private static final String TEXT_WELCOME = "FileManager";

	private JPanelStats jpanelStats;
	private JPanelGraph jPanelGraph;
	private JTextArea textWritteUser;
	private GridBagConstraints gbc;
	private DefaultListModel<String> topWordsListModel;

	public JPanelPrincipal() {
		this.setLayout(new GridBagLayout());
		this.setBackground(Color.WHITE);
		initComponents();
		addComponents();
		this.setVisible(true);
	}

	public void initComponents() {
		gbc = new GridBagConstraints();
		jpanelStats = new JPanelStats();
		jPanelGraph = new JPanelGraph();
		topWordsListModel = new DefaultListModel<String>();
		textWritteUser = new JTextArea();
		textWritteUser.setPreferredSize(new Dimension(400, 420));
		textWritteUser.setBorder(BorderFactory.createTitledBorder(TEXT_EDITOR));
	}

	public void addComponents() {
		gbc.fill = GridBagConstraints.CENTER;
		gbc.gridwidth = 2;
		gbc.gridheight = 1;
		this.add(createLblForTitle(), gbc);
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.gridheight = 3;
		this.add(textWritteUser, gbc);
		gbc.gridx = 1;
		gbc.gridheight = 1;
		this.add(jpanelStats, gbc);
		gbc.gridy = 2;
		this.add(createListPanel(), gbc);
		gbc.gridy = 3;
		this.add(jPanelGraph, gbc);
	}

	private JLabel createLblForTitle() {
		JLabel lblText = new JLabel(TEXT_WELCOME);
		lblText.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblText.setForeground(UIConstants.BLUE_BTN_COLOR);
		lblText.setFont(UIConstants.FONT_TITLE);
		lblText.setBorder(new EmptyBorder(10, 0, 10, 0));
		return lblText;
	}

	private JList<String> createListPanel() {
		JList<String> listWords = new JList<String>();
		listWords.setModel(topWordsListModel);
		listWords.setBorder(BorderFactory.createTitledBorder(TOP_WORDS));
		listWords.setPreferredSize(new Dimension(230, 200));
		return listWords;
	}

	public void fillListTopWords(ArrayList<Word> wordList) {
		int count = 0;
		topWordsListModel.clear();
		for (Word word : wordList) {
			if (count < 10) 
				topWordsListModel.addElement(String.format(FORMAT_TOP, ++count, word.getWord(), word.getCount()));
		}
	}

	public String getTextWritteUser() {
		return textWritteUser.getText();
	}

	public void setTextNumberWords(int textUpdate) {
		jpanelStats.setTextNumberWords(textUpdate);
	}

	public void setTextNumberLines(int textUpdate) {
		jpanelStats.setTextNumberLines(textUpdate);
	}
	
	public void setValueOne(int valueOne) {
		jPanelGraph.setValueOne(valueOne);
	}

	public void setValueTwo(int valueTwo) {
		jPanelGraph.setValueOne(valueTwo);
	}
//
//	public void setValueThree(int valueThree) {
//		jPanelGraph.setValueOne(valueThree);
//	}
//
//	public void setValueFour(int valueFour) {
//		jPanelGraph.setValueOne(valueFour);
//	}
//
//	public void setValueFive(int valueFive) {
//		jPanelGraph.setValueOne(valueFive);
//	}	
}