package data_base;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
import projet.*;
public class Myconnection {

	Connection con=null;
	Statement st=null;
		public Myconnection() {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				System.out.println("ERROR DRIVER"+e.getMessage());
				e.printStackTrace();
			}
			
			
		}
		
		public void connect() {
			try {
				con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/education","root","");
				st=con.createStatement();
				System.out.println("connection bien etablie!");
				
			} catch (SQLException e) {
				System.out.println("ERROR conex"+e.getMessage());
				
				e.printStackTrace();
			}
			
		}
		
		
		public int ajoutuser(String n,String p,String gm,String ps,String pro,String gn,String br) {
			int a=0;
			try {
				
				a=st.executeUpdate("insert into users values('"+n+"','"+p+"','"+gm+"','"+ps+"','"+pro+"','"+gn+"','"+br+"')");
			    a=1;
			
			} catch (SQLException e) {
				
				a=-1;
			}
			
			return a;
		}
		public boolean login(String g,String p,Login l) {
				ResultSet rs=null;
				boolean b=false;
				try {
					
					
					rs=st.executeQuery(("SELECT Gmail,Password From users WHERE Gmail ='"+g+"' ")) ;
				
					if (rs.next()) {
						if(rs.getString(2).contentEquals(p)) {
							b=true;
						}else {
							JOptionPane.showMessageDialog(null,"Password invalid!");
							l.reset("p");
						}
					    }
					else {
						JOptionPane.showMessageDialog(null,"Gmail unfound!");
						l.reset("all");
					}
					
						
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
				return b;
				
			}
		
		
	//remember me ajout
		
		public int remAjout(String g,String p) {
			int a=0;
			try {
				
				a=st.executeUpdate("insert into remember values('"+g+"','"+p+"')");
			
			} catch (SQLException e) {
				
				e.getStackTrace();
			}
			
			return a;
		}
		
		//remember me get
		
	
			
		public ResultSet remGet() {
			ResultSet rs=null;
			try {
				rs=st.executeQuery("SELECT * From remember");
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			return rs ;
			
		}
				
			//remember me clean table
		public void remclear() {
			 int a=0;
				try {
					a=st.executeUpdate("delete from remember ");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		
		//ajouter Post
		
		public int ajoutpost(String pst) {
			int a=0;
			try {
				
				a=st.executeUpdate("insert into posts (post) values('"+pst+"')");
				
			    a=1;
			
			} catch (SQLException e) {
				
				a=-1;
				e.printStackTrace();
			}
			
			
			return a;
		}
		// afficher posts dans blog
		
		public ResultSet afficheposts() {
			ResultSet rs = null;
			try {
				rs=st.executeQuery("SELECT post From posts  ORDER BY id DESC");
	
			} catch (SQLException e) {
			
				e.printStackTrace();
			}
			return rs;
			
		}
		
		// ajouter un commenter 
		
		public int ajoutcmtr(int it,String pst) {
			int a=0;
			try {
				
				a=st.executeUpdate("insert into comm(id,cmtr)values('"+it+"','"+pst+"')");
			
			    a=1;
			
			} catch (SQLException e) {
				
				a=-1;
				e.printStackTrace();
			}
			
			
			return a;
		}
		
		// profile get info
		
		public ResultSet infoProfil(String g) {
			ResultSet rs=null;
			try {
				rs=st.executeQuery("SELECT * From users where Gmail ='"+g+"'");
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			return rs ;
			
		}
		
		// affich today events
		
		public ResultSet affichevents() {
			ResultSet rs = null;
			String d= "2020-01-20";
			try {
				rs=st.executeQuery("SELECT event,time From events where date='"+d+"' ORDER BY time");
	
			} catch (SQLException e) {
			
				e.printStackTrace();
			}
			return rs;
			
		}
		public ResultSet affichcourses() {
			ResultSet rs = null;
		
			try {
				rs=st.executeQuery("SELECT *From courses ");
	
			} catch (SQLException e) {
			
				e.printStackTrace();
			}
			return rs;
			
		}
		
		public ResultSet affichdis(String d) {
			ResultSet rs = null;
		
			try {
				rs=st.executeQuery("SELECT descD From diseases where idD='"+d+"'");
	
			} catch (SQLException e) {
			
				e.printStackTrace();
			}
			return rs;
			
		}
		
		
		
		
		
		
		
		
		
	

}
