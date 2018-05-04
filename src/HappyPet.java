import javax.swing.JOptionPane;

public class HappyPet {

	// 2. Add the following variable to the next line: static int happinessLevel =
	// 0;
	// this will be used to store the happiness of your pet
	static int happy = 0;
	static int strength = 0;

	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in
		// a variable
		JOptionPane.showMessageDialog(null, "Hello! and Welcome to PetVille.");
		String pet = JOptionPane.showInputDialog("What kind of pet would you like buy?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for (int i = 0; i <= 360; i++) {
			// 3. Use showOptionDialog to ask the user what they want to do to make their
			// pet happy
			// (eg: cuddle, food, water, take a walk, groom, clean up poop).
			// Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "Care for your " + pet + "...", "PetVille", 0,
					JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Food & Water", "Take on walk", "Clean up poop" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
			if (task == 0) {
				happy = happy + 1;
				JOptionPane.showMessageDialog(null, "Your " + pet
						+ " is thankfull for the bounty you have bestowd before him! Your pets dopamine level is at "
						+ happy);
			}
			if (task == 1) {
				happy = happy + 1;
				int P1 = JOptionPane.showConfirmDialog(null, "Your " + pet
						+ " is enjoying the plesant day. you walk by a flyer, should you pick it up? Your pets dopamine level is at "
						+ happy);

				if (P1 == 1) {

					JOptionPane.showMessageDialog(null, "you pass it by not know what it may entail.");

				}
				if (P1 == 0) {
					P1 = JOptionPane.showConfirmDialog(null, "The poster reads \"COME TO OUR ANUAL " + pet.toUpperCase()
							+ " TALENT SHOW\" Would you like to go?");
				}
				if (P1 == 1) {

					JOptionPane.showMessageDialog(null, "you pass it by not know what it may entail.");

				}

				for (int d = 0; d <= 360; d++) {
					if (P1 == 0) {

						JOptionPane.showMessageDialog(null, "You walk a block down the road and there you see it...");
						P1 = JOptionPane.showOptionDialog(null, "witch room would you like to enter?",
								pet.toUpperCase() + " TALENT SHOW", 0, JOptionPane.INFORMATION_MESSAGE, null,
								new String[] { "Training Room", "Show Room", "exit" }, null);
					}
					if (P1 == 2) {

						P1 = JOptionPane.showOptionDialog(null, "Train your " + pet, "Training Room", 0,
								JOptionPane.INFORMATION_MESSAGE, null,
								new String[] { "Jump Rope", "Bench Press", "exit" }, null);
					}
					if (P1 == 2) {

						JOptionPane.showMessageDialog(null, "your " + pet + "has gained 1 strength");
						strength = strength + 1;
					}
				}

				// 6. If you determine the happiness level is large enough, tell the
				// user that he loves his pet and use break; to exit for loop.

			}

			// 4. Create methods to handle each of your user selections.
			// Each method should create a pop-up with the pet's response (eg. cat might
			// purr when pet),
			// and INCREMENT the pet's happiness Level.
		}
	}
}