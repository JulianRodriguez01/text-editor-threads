package views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JPanel;

public class JPanelGraph extends JPanel {

	private static final long serialVersionUID = 1L;
	private int valueOne, valueTwo, valueThree, valueFour, valueFive;
	private DefaultListModel<Integer> listValues;

	public JPanelGraph() {
		this.setBackground(Color.WHITE);
		this.setPreferredSize(new Dimension(240, 70));
		initVars();
	}

	public void initVars() {
		valueOne = 68;
		valueTwo = 68;
		valueThree = 68;
		valueFour = 68;
		valueFive = 68;
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		paintLinesGraph(g);
		paintGraph(g);
	}

	public void paintLinesGraph(Graphics g) {
		g.setColor(Color.LIGHT_GRAY);
		g.drawLine(7, 0, 7, 70);
		g.drawLine(7, 69, 233, 69);
	}

	public void paintGraph(Graphics g) {
		g.setColor(UIConstants.BLUE_COLOR);
		g.drawLine(7, valueFive, 45, valueOne);
		g.drawLine(45, valueOne, 90, valueTwo);
		g.drawLine(90, valueTwo, 135, valueThree);
		g.drawLine(135, valueThree, 180, valueFour);
		g.drawLine(180, valueFour, 225, valueFive);
	}

	public void fillListValuesGraph(ArrayList<Integer> valuesList) {
		valuesList.clear();
		int valueAssigment = 0;
		for (int value : valuesList) {
//			assigmentVar(valueAssigment, value);
			listValues.addElement(value);
		}
	}
	
//	public void assigmentVar(int valueAssigment, int value) {
//		switch (valueAssigment) {
//		case 0:
//			valueOne = value;			
//			break;
//		case 1:
//			valueTwo = value;
//			break;
//		case 2:
//			valueThree = 68;
//			break;
//		case 3:
//			valueFour = 68;
//			break;
//		case 4:
//			valueFive = 68;
//			valueAssigment = 0;
//			break;
//		default:
//			break;
//		}
//	}

	public void setValueOne(int valueOne) {
		this.valueOne = valueOne;
	}

	public void setValueTwo(int valueTwo) {
		this.valueTwo = valueTwo;
	}
//
//	public void setValueThree(int valueThree) {
//		this.valueThree = valueThree;
//	}
//
//	public void setValueFour(int valueFour) {
//		this.valueFour = valueFour;
//	}
//
//	public void setValueFive(int valueFive) {
//		this.valueFive = valueFive;
//	}
}