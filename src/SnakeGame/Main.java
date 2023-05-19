package SnakeGame;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Snake Game Group Sera, Deon, Faiz");
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		Screen gs = new MainMenu(frame);
		frame.setContentPane(gs);
		frame.setVisible(true);
		frame.pack();
		frame.setResizable(false);
	}
}
