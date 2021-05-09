package data_base;

import java.sql.Connection;

import javax.swing.JOptionPane;

public class Cmtr {
		
		int a;
		Connection con=null;
		
		public Cmtr(int i,String pst) {
		Myconnection c=new Myconnection();
		c.connect();
		a=c.ajoutcmtr(i,pst);
		if(a==1) {
			JOptionPane.showMessageDialog(null,"successful posted");
			
			
		}
		else {
			JOptionPane.showMessageDialog(null,"nothing posted");
			
		}
		}
	
	}
