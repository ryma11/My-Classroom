package data_base;

import java.sql.Connection;

public class Rbme {
	Connection con=null;
	public Rbme(String g,String p) {
		Myconnection c=new Myconnection();
		c.connect();
		c.remclear();
		c.remAjout(g,p);
	}

}
