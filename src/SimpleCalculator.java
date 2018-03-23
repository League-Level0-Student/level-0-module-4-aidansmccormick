
import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.
		String but = JOptionPane.showInputDialog(" ");
		String bat = JOptionPane.showInputDialog(" ");
		int in1 = Integer.parseInt(but);
		int in2 = Integer.parseInt(bat);

		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "add/subtract/multiply/divide", "Pop-up Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "add", "subtract", "multiply", "divide" }, null);
		if (operation == 1) {

			int asnA = in1 - in2;
			JOptionPane.showMessageDialog(null, asnA);
		}
		if (operation == 0) {

			int asnB = in1 + in2;
			JOptionPane.showMessageDialog(null, asnB);
		}
		if (operation == 2) {

			int asnC = in1 * in2;
			JOptionPane.showMessageDialog(null, asnC);
		}
		if (operation == 3) {

			int asnD = in1 / in2;
			JOptionPane.showMessageDialog(null, asnD);
		}
		// 5. Call the methods created in steps 3 and 4 to perform the appropriate
		// operation.

		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}

	// 3. Create method for addition operation.
	// Method should create pop-up that shows equation and solution, eg. 45 + 25 =
	// 70.
	// HINT: use 'static void add(int num1, num2) { ... }

	// 4. Create similar methods for subtraction, multiplication and division.
}