package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	//2. create an array of 5 robots.
Robot[] robotlist = new Robot[5];

	//3. use a for loop to initialize the robots.
for(int i=0; i<5; i++) {
	Robot rob = new Robot();
	rob.setSpeed(10);
	robotlist[i] = rob;
}
		//4. make each robot start at the bottom of the screen, side by side, facing up
robotlist[0].setX(100);
robotlist[0].setY(500);
robotlist[1].setX(275);
robotlist[1].setY(500);
robotlist[2].setX(450);
robotlist[2].setY(500);
robotlist[3].setX(625);
robotlist[3].setY(500);
robotlist[4].setX(800);
robotlist[4].setY(500);
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
Random rand = new Random();
int number = rand.nextInt(50);
for(int i=0; i<5; i++) {
	robotlist[i].setY(robotlist[i].getY() - rand.nextInt(50));
}
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
boolean racing = true;
while (racing) {
	for(int i=0; i<5; i++) {
		robotlist[i].setY(robotlist[i].getY() - rand.nextInt(50));
	}
	for(int i=0; i<5; i++) {
		if(robotlist[i].getY() <= 0) {
			racing = false;
			System.out.println("Winner!");
			System.out.println("Suddenly a cake and balloons appear with other robots cheering");
		}
	}
}
	
	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}	
}


