package data_base;
import java.sql.Connection;

import javax.swing.JTextField;

import mainpage.*;
import projet.*;
public class Log {

	Connection con=null;
	boolean b;

	public Log(String gm,String p,Login l,JTextField t1) {
		
		Myconnection c=new Myconnection();
		c.connect();
		b=c.login(gm,p,l);
		
		if(b) {
			Welcome r=new Welcome(t1);
			l.setVisible(false);
		}
		
	}

}
