package mainpage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import data_base.Myconnection;
import projet.Frame;

public class Events extends Frame implements ActionListener {
	JLabel l1;
	java.sql.ResultSet rs;
	Myconnection c;
	JPanel pg;
	public Events(JTextField t1) {
		
		  l1=new JLabel("Events of the day");
	      l1.setPreferredSize(new Dimension(370,100));
	      l1.setBackground(new Color(20,150,250));
	      l1.setOpaque(true);
	      l1.setFont(new Font("Arial",Font.BOLD,35));
		  this.getContentPane().add(l1, BorderLayout.NORTH);
		  
		  //affich events
		  c=new Myconnection();
		  c.connect();
		  rs=c.affichevents();
		  pg= new JPanel(new GridLayout(0,1,1,5));
		  int i =1;
		  try {
			while(rs.next()) {
					
					//panel de events
				     
					JLabel l = new JLabel (i+"- "+rs.getString(1)+"  "+rs.getString(2));
					
					l.setBackground(Color.white);
					l.setFont(new Font("Calibri",Font.BOLD,30));
					l.setOpaque(true);
					pg.add(l);
					i=i+1;
			  }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  this.getContentPane().add(pg, BorderLayout.CENTER);
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
