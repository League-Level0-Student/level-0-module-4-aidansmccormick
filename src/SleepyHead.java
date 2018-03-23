
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {

		// Ask the user for these values using
		int day = JOptionPane.showConfirmDialog(null, "is it a weekday?");

		if (day == 1) {

			JOptionPane.showMessageDialog(null, "sleep in.");

		}

		if (day == 0) {

			int vac = JOptionPane.showConfirmDialog(null, "are you on vacation?");

			if (vac == 1) {

				JOptionPane.showMessageDialog(null, "wake up lazybones.");

			}

			if (vac == 0) {

				JOptionPane.showMessageDialog(null, "sleep in.");

			}

		}

		/*
		 * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday, print
		 * “get up lazybones!” If it is a weekday, and we are on vacation, print “sleep
		 * in”.
		 */
	}
}
