package com.sample;

import javax.swing.JFrame;
import javax.swing.JButton;

public final class QuizWindow extends JFrame {
	private static final long serialVersionUID = 1L;
	
	public QuizWindow() {
		super("Your photography style");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400, 250);
		setLocation(100, 100);
		
		setVisible(true);
	}

}
