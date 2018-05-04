
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String farf = JOptionPane.showInputDialog("How many nickels do you have?");
		// Convert their answer to an int using Integer.parseInt()
		double aaa = Integer.parseInt(farf);
		// Ask the user how many dimes they have, and convert their answer
		String goof = JOptionPane.showInputDialog("How many dimes do you have?");
		double ccc = Integer.parseInt(goof);
		// Ask the user how many quarters they have, and convert their answer
		String jarp = JOptionPane.showInputDialog("How many quarters do you have?");
		double bbb = Integer.parseInt(jarp);
		// Calculate how much money the user has and save it in a double variable
		ccc = ccc * 0.10;
		bbb = bbb * 0.25;
		aaa = aaa * 0.05;

		double jup = aaa + bbb + ccc;

		JOptionPane.showMessageDialog(null, "" + jup);
		// Tell the user how much money they have

	}
}
