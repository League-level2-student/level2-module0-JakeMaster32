package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	Boolean b = false;
	Robot [] robots = new Robot[5];
	for (int x = 0; x<5; x++) {
		robots [x] = new Robot();
		robots [x].setY(500);
		robots [x].setX((x*100)+100);
		
	}
	
	Random rand = new Random();
	while (b == false) {
	for (int y = 0; y<5; y++) {
		int z = rand.nextInt(50);
		robots [y].move(z);
		if (robots [y].getY() <= 0) {
			JOptionPane.showMessageDialog(null, "Robot "+y+ " is the winner!!!");
			b = true;
			
		}
	}
	}
	
	//2. create an array of 5 robots.

	//3. use a for loop to initialize the robots.

		//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.

	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
}