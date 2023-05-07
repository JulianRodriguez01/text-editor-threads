package views;

import java.awt.Color;
import java.awt.Component;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class JPanelStats extends JPanel {

	private static final long serialVersionUID = 1L;
	private static final String TEXT_TITLE = "Estadisticas";	
	private static final String NUMBER_LINES = "Número de lineas";
	private static final String NUMBER_WORDS = "Número de palabras";
	
	private JTextField textNumberWords;
	private JTextField textNumberLines;

	public JPanelStats() {
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.setBackground(Color.WHITE);
		this.setAlignmentX(Component.CENTER_ALIGNMENT);
		this.setBorder(new EmptyBorder(0, 20, 5, 20));
		addComponents();
	}

	private void addComponents() {
		JLabel lblTitle = new JLabel(TEXT_TITLE);
		lblTitle.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblTitle.setFont(UIConstants.FONT_SUBTITLE);
		lblTitle.setBorder(new EmptyBorder(10, 0, 10, 0));
		this.add(lblTitle);		
		textNumberWords = new JTextField(20);
		updatePropertiesTextField(textNumberWords, NUMBER_WORDS);
		this.add(textNumberWords);		
		textNumberLines = new JTextField(20);
		updatePropertiesTextField(textNumberLines, NUMBER_LINES);
		this.add(textNumberLines);
	}

	public void updatePropertiesTextField(JTextField textFieldUpdate, String title) {
		textFieldUpdate.setBorder(BorderFactory.createTitledBorder(title));
		textFieldUpdate.setAlignmentX(Component.CENTER_ALIGNMENT);
		textFieldUpdate.setBackground(Color.WHITE);
		textFieldUpdate.setEditable(false);
	}

	public void setTextNumberWords(int textUpdate) {
		textNumberWords.setText(String.valueOf(textUpdate));
	}

	public void setTextNumberLines(int textUpdate) {
		textNumberLines.setText(String.valueOf(textUpdate));
	}
}