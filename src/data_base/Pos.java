package data_base;

import java.sql.Connection;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import mainpage.*;
import projet.*;
public class Pos {
	boolean b;
	int a;
	Blog pp;
	Connection con=null;
	public Pos(Post p,String pst) {
	Myconnection c=new Myconnection();
	c.connect();
	a=c.ajoutpost(pst);
	if(a==1) {
		p.invalidate();
		p.validate();
		p.repaint();
		p.setVisible(false);
	}
	
	}
}












































