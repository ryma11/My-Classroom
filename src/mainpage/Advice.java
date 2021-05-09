package mainpage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.mysql.jdbc.ResultSet;

import data_base.Myconnection;

public class Advice  extends JPanel implements ActionListener {
	JLabel l1,l,la;
	 Myconnection c;
	 JPanel pg,pp;
	 JList list;
	 DefaultListModel model;
	 
	 java.sql.ResultSet rs;
	  private JTextField tx;
	    private JButton bl;
	    JPanel p;
	    Welcome w;
	public Advice(Welcome w) {
	    	 w=w;
	    	
	    	
		this.setLayout( new BorderLayout());
    	l1=new JLabel("Get Some Advice About Common Diseases ");
	      l1.setPreferredSize(new Dimension(370,40));
	      l1.setBackground(new Color(20,150,250));
	      l1.setOpaque(true);
	      l1.setFont(new Font("Arial",Font.BOLD,35));
		  this.add(l1, BorderLayout.NORTH);
		  
		  // pan rech
		  p = new JPanel(new FlowLayout());
		 
	        tx = new JTextField();
	        tx.setPreferredSize(new Dimension(400,40));
		      tx.setFont(new Font("Arial",Font.BOLD,20));
	        p.add(tx);
		  
	        bl = new JButton("Tell me");
	        bl.setPreferredSize(new Dimension(150,35));
		      bl.setBackground(new Color(20,140,240));
		      bl.setForeground(Color.white);
		      bl.setFont(new Font("Calibri",Font.BOLD,25));
	        bl.addActionListener(this);
	        p.add(bl);
	        
	        this.add(p, BorderLayout.SOUTH);

	}
	
		

	public void actionPerformed(ActionEvent e) {
        if (bl == e.getSource() ) {
    	           
             
                   c=new Myconnection();
     			  c.connect();
     			  rs=c.affichdis(tx.getText());
     			 
     			 
                try {
					while(rs.next()) {
						
						//panel de disieses
					     
						 l = new JLabel (rs.getString(1));
						
						l.setBackground(Color.BLACK);
						l.setFont(new Font("Calibri",Font.BOLD,30));
						l.setOpaque(true);
					 
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
                this.add(l, BorderLayout.SOUTH);
                this.invalidate();
    			this.validate();
    			this.repaint();
        }
				
     	 	      
     			 
     
	

		  
		  
	}
	
	
	
	
	

}
