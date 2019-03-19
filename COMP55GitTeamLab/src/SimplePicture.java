//Yo yo ppl its ya boi Radish
//Its me again
//3rd line

import java.awt.Color;
import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

public class SimplePicture extends GraphicsProgram {
	public static int SIZE = 700;
	
	public void init() {
		setSize(SIZE, SIZE);
	}
	
	public void run() {
		GImage robot = new GImage("robot.jpg", 200, 100);
		add(robot);
		GLabel label = new GLabel("Alex is an attractive man", 200, 400);

		label.setColor(Color.RED);
		add(label);
		
		int coolint = 5;
	}
} //yes