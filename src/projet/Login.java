package projet;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.sql.Connection;
import data_base.*;
public class Login extends Frame implements ActionListener{
JPanel p1,p2,p3,p4,p5,p6,pr;
JLabel logo,l1,l2,l,login,g,pp,mot,mail,rem;
JTextField t1;
JCheckBox remb;
JPasswordField pass;
JButton bl,r;
String pa,gl;
ResultSet rs;

	public Login(){
		this.setTitle("Login");
		
		 
	// logo
		
		p1= new JPanel(new BorderLayout());
	      Image lo = new ImageIcon(this.getClass().getResource("/log.png")).getImage();
	      logo=new JLabel();
	      logo.setIcon(new ImageIcon(lo));
	      p1.setLayout(new BorderLayout());
	      l1=new JLabel();
	      l1.setPreferredSize(new Dimension(300,1));
	      p1.add(l1, BorderLayout.WEST);
	      p1.add(logo, BorderLayout.CENTER);
	      this.getContentPane().add(p1, BorderLayout.NORTH);
	    
	      
	      
	
	//seconde panel /login
	      p2= new JPanel(new BorderLayout());
	      login=new JLabel("Login:");
	      login.setFont(new Font("Times New Roman",Font.BOLD,30));
	      l2=new JLabel();
	      l2.setPreferredSize(new Dimension(350,1));
	      p2.add(l2, BorderLayout.WEST);
	      p2.add(login, BorderLayout.CENTER);
	      this.getContentPane().add(p2, BorderLayout.CENTER);
	      
	     // panel 5 pass et gmail
	      p5= new JPanel(new BorderLayout());
	      
	    /**  

	      p = new JPanel();
	      p.setPreferredSize(new Dimension(20,50));
	      p.add(menuItem);
	      p2=new JPanel();
	      p2.setPreferredSize(new Dimension(20,50));
	      p2.add(menuItem2);
	    menuBar.add(p);
	        menuBar.add(p2);**/
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      // remember me initiale
	      Myconnection c=new Myconnection();
	      c.connect();
	     rs=c.remGet();
	     try {
	    	 while(rs.next()) {
			pa=rs.getString(1);
			gl=rs.getString(2);}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      
	      
	  //user gmail    
	      p3= new JPanel(new FlowLayout());
	      Image gm = new ImageIcon(this.getClass().getResource("/gmail.png")).getImage();
	      g=new JLabel();
	      g.setIcon(new ImageIcon(gm));
	      p3.add(g);
	      
	      t1=new JTextField(pa) ;
	      t1.setPreferredSize(new Dimension(250,50));
	      t1.setFont(new Font("Arial",Font.BOLD,15));
	      
	      mail=new JLabel("Gmail");
	      mail.setPreferredSize(new Dimension(150,50));
	      mail.setFont(new Font("Arial",Font.BOLD,20));
	      p3.add(mail);
	      
	      p5.add(p3, BorderLayout.NORTH);
	      
	  // password
	      p4= new JPanel(new FlowLayout());
	      Image p = new ImageIcon(this.getClass().getResource("/password.png")).getImage();
	      pp=new JLabel();
	      pp.setIcon(new ImageIcon(p));
	      p4.add(pp);
	      
	      pass=new JPasswordField(gl) ;
	      pass.setPreferredSize(new Dimension(250,50));
	      pass.setFont(new Font("Arial",Font.BOLD,15));
	      p4.add(pass);
	      
	      mot=new JLabel("Password");
	      mot.setPreferredSize(new Dimension(150,50));
	      mot.setFont(new Font("Arial",Font.BOLD,20));
	      p4.add(mot);
	      
	      p5.add(p4, BorderLayout.CENTER);
	      
	      
	      
        
	     
	     //remember me 
	      p6= new JPanel(new FlowLayout());
	     
	      rem=new JLabel("Remember me");
	      rem.setPreferredSize(new Dimension(150,50));
	      rem.setFont(new Font("Andalus",Font.BOLD,15));
	      remb= new JCheckBox();
	      remb.addActionListener(this);
	      p6.add(remb);
	      p6.add(rem);
	      
	      
	    // login button  
	      
	      bl=new JButton("Login");
		    
	      bl.setPreferredSize(new Dimension(200,40));
	      bl.setBackground(new Color(20,140,240));
	      bl.setForeground(Color.white);
	      bl.setFont(new Font("Calibri",Font.BOLD,25));
	      bl.addActionListener(this);
	      p6.add(bl);

	      p5.add(p6, BorderLayout.SOUTH);
	      
	      
         //Create New Account
	      
          r=new JButton("Create New Account");
	      pr=new JPanel(new FlowLayout());
	      
	      r.setPreferredSize(new Dimension(220,35));
	      r.setBackground(Color.black);
	      r.setForeground(Color.RED);
	      r.setFont(new Font("Calibri",Font.BOLD,20));
	      pr.add(r);
	      r.addActionListener(this);
	      p6.add(pr);
	      
	      this.getContentPane().add(p5, BorderLayout.SOUTH);
	}
		
	
	public void reset(String s) {
		
		if(s.contentEquals("all")) {
			t1.setText("");
			pass.setText("");
			
		}
		else {
			pass.setText("");
		}
	}
	
	
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==r) {
			this.setVisible(false);
			Registration i =new Registration();			
		}
		
		if(e.getSource()==bl) {
			if( t1.getText().contentEquals("")|| pass.getText().contentEquals("")) {
				
				JOptionPane.showMessageDialog(null,"Empty text field !");}
			
		else{
			
			Log l=new Log(t1.getText(),pass.getText(),this,t1);
			if(remb.isSelected()) {
				Rbme rb=new Rbme(t1.getText(),pass.getText());
			}
			}
		}
		
	}
	
	
	

}
