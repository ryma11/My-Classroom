package projet;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Frame extends JFrame {
	JLabel l1;
	public Frame() {
	
		 this.setSize(800,500);
		 //this.setMaximumSize(new Dimension(800,450)); 
		this.setMinimumSize(new Dimension(800,450));
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 this.setLayout( new BorderLayout());
		 this.setVisible(true);
			
	}

}
