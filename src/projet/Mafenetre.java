package projet;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Mafenetre extends Frame implements ActionListener {
	JPanel p1,p2,p3;

JButton b1,b2;
	
	JLabel l1,l2,logo,l;
	public Mafenetre() {
		this.setTitle("Welcome");
		this.setSize(800,450);
		  p1 = new JPanel();
		  p2 = new JPanel();
		  p3 = new JPanel();
		  p2.setPreferredSize(new Dimension(0,250));
		// bouton log in
			 
		      b1=new JButton("Login");
		      b1.setPreferredSize(new Dimension(150,50));
		      b1.setBackground(new Color(20,140,240));
		      b1.setForeground(Color.white);
		      b1.setFont(new Font("Calibri",Font.BOLD,25));
		  
		      p1.add(b1);
		      b1.addActionListener (this);
		 // bouton create new account     
		     
		      b2=new JButton("Create New Account");
		    
		      b2.setPreferredSize(new Dimension(350,50));
		      b2.setBackground(Color.gray);
		      b2.setForeground(Color.white);
		      b2.setFont(new Font("Calibri",Font.BOLD,25));
		      p1.add(b2);
		      b2.addActionListener (this);
		      
		      
		      this.getContentPane().add(p1, BorderLayout.SOUTH); 
		      
		   // logo
		      Image lo = new ImageIcon(this.getClass().getResource("/logo.png")).getImage();
		      logo=new JLabel();
		      logo.setIcon(new ImageIcon(lo));
		      p2.setLayout(new BorderLayout());
		      l1=new JLabel();
		      l1.setPreferredSize(new Dimension(300,1));
		      p2.add(l1, BorderLayout.WEST);
		      
		    
		      p2.add(logo, BorderLayout.CENTER);
		      this.getContentPane().add(p2, BorderLayout.NORTH);
		      
		     // Smart classroom
		      l2=new JLabel("Smart Classroom");
		      l2.setForeground(Color.RED);
		      l2.setFont(new Font("Bahnschrift SemiBold",Font.BOLD,30));
		      
		      
		      
		      l=new JLabel();
		      l.setPreferredSize(new Dimension(250,1));
		      p3.setLayout(new BorderLayout());
		      p3.add(l, BorderLayout.WEST);
		      p3.add(l2, BorderLayout.CENTER);
		      this.getContentPane().add(p3, BorderLayout.CENTER);
		      
	}

	
public void actionPerformed (ActionEvent e) {
		
		if(e.getSource()==b1) {
			this.setVisible(false);
			Login i =new Login();
		}
		
		if(e.getSource()==b2) {
			this.setVisible(false);
			Registration i =new Registration();
		}
	
	

}
}
