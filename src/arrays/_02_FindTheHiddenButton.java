/*****
 * 
 * Run the FndHdnBtn.jar to play the finished game
 * 
 *****/

package arrays;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
	
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_FindTheHiddenButton implements ActionListener{
	JFrame window;
	JPanel panel;
	
	//1. create an array of JButtons. Don't initialize it yet.
	JButton buttons [];
	//2 create an int variable called hiddenButton
	int hiddenButton = 0;
	public static void main(String[] args) {
		new _02_FindTheHiddenButton().start();
	}
	
	public void start() {
		window = new JFrame("Find the Button");
		panel = new JPanel();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//3.  Ask the user to enter a positive number and convert it to an int
		String x =JOptionPane.showInputDialog("Give me a random number (Positive)");
		int y = Integer.parseInt(x);
		//4. Initialize the array of JButtons to be the size of the int created in step 3
		buttons = new JButton[y];
		//5. Make a for loop to iterate through the JButton array
		for (int z = 0; z<y; z++) {
			buttons [z] = new JButton();
			buttons [z].addActionListener(this);
			panel.add(buttons [z]);
		}
			//6. initialize each JButton in the array
			//7. add the ActionListener to each JButton
			//8. add each JButton to the panel


		//9 add the panel to the window
		window.add(panel);
		//10. call setExtendedState(JFrame.MAXIMIZED_BOTH) on your JFrame object.
		window.setExtendedState(JFrame.MAXIMIZED_BOTH);
		//11. set the JFrame to visible.
		window.setVisible(true);
		//12. Give the user the instructions for the game.
		JOptionPane.showMessageDialog(null, "Watch to see where the hidden button is located, then click it");
		//13. initialize the hiddenButton variable to a random number less than the int created in step 3
		Random rand = new Random();
		int a = rand.nextInt(y);
hiddenButton = a;
		//14. Set the text of the JButton located at hiddenButton to  "ME"
buttons [a].setText("Me");
		//15. Use Thread.sleep(1000); to pause the program.
		//    Surround it with a try/catch - use Eclipse helper for this
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//16. Set the text of the JButton located at hiddenButton to be blank.
		buttons [a].setText(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton)e.getSource();
if (e.getSource().equals(buttons [hiddenButton])) {
	JOptionPane.showMessageDialog(null, "You win!");
}
else {JOptionPane.showMessageDialog(null, "Sorry, try again");}
		//17. if the hiddenButton is clicked, tell the user that they win.
		
		//18. else tell them to try again
	}
}
