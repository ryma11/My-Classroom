package data_base;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import projet.Registration;

import java.sql.*;
public class Reg {
	
	Connection con=null;
	Statement st=null;
	int a;
	public Reg(String n,String p,String gm,String ps,String gn,String pro,String br, Registration r) {
		
		Myconnection c=new Myconnection();
		c.connect();
		a=c.ajoutuser( n,p, gm,ps,pro,gn,br);
		if(a==1) {
			JOptionPane.showMessageDialog(null,"successful registration!");
			r.setVide();
			
		}
		else {
			JOptionPane.showMessageDialog(null,"Gmail already used!");
			r.reset();
		}
	}	
}
