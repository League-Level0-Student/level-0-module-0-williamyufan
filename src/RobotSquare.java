/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;

// This recipe draws a square using the Robot

public class RobotSquare {
    public static void main(String[] args) throws Exception {
 
    	Robot bob=new Robot();
bob.hide();
bob.sparkle();
        bob.penDown();
bob.miniaturize();

     
        for(int i=0;i<4;i++) {
        	
        	bob.setSpeed(40);


        	bob.turn(90);

            bob.move(280);


        }

      }
}