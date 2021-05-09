package projet;
import data_base.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.*;

public class Registration extends Frame implements ActionListener {
 JPanel p1,form,pf,pl,pg,pp,pa,bb,pc,pr,pb,pro;
 JLabel logo,l1,fname,flast,fmail,fp,fa,fb,la,fpro;
 JButton b,r;
 JTextField tf,tl,tg,tp;
 JComboBox <String>d1,d2,d3;
 JRadioButton M,F,E,P;
 ButtonGroup bg,bg2;
	public Registration() {
		this.setTitle("Registration");
		this.setSize(850,620); //870,600
		// logo
		
				p1= new JPanel(new BorderLayout());
				
			      Image lo = new ImageIcon(this.getClass().getResource("/reg.png")).getImage();
			      logo=new JLabel();
			      logo.setIcon(new ImageIcon(lo));
			      p1.setLayout(new BorderLayout());
			      l1=new JLabel();
			      l1.setPreferredSize(new Dimension(370,1));
			      p1.add(l1, BorderLayout.WEST);
			      p1.add(logo, BorderLayout.CENTER);
			      this.getContentPane().add(p1, BorderLayout.NORTH);
		
		
		
		
		
		
		// Fromulaire
			      form=new JPanel(new FlowLayout());
			      // first name:
			      pf= new JPanel(new FlowLayout());
			      
			      fname=new JLabel("First Name:*");
			      fname.setPreferredSize(new Dimension(100,50));
			      fname.setFont(new Font("Arial",Font.BOLD,15));
			      pf.add(fname);
			      
			      
			      tf=new JTextField() ;
			      tf.setPreferredSize(new Dimension(300,40));
			      tf.setFont(new Font("Calibri",Font.BOLD,20));
			      pf.add(tf);
			      form.add(pf);
			      
			    
			      
			      // last name
			      pl= new JPanel(new FlowLayout());
			      
			      flast=new JLabel("Last Name:*");
			      flast.setPreferredSize(new Dimension(100,50));
			      flast.setFont(new Font("Arial",Font.BOLD,15));
			      pl.add(flast);
			      
			      
			      tl=new JTextField() ;
			      tl.setPreferredSize(new Dimension(300,40));
			      tl.setFont(new Font("Calibri",Font.BOLD,20));
			      pl.add(tl);
			      form.add(pl);
		
		
			      
			      // Gmail
                  pg= new JPanel(new FlowLayout());
			      
			      fmail=new JLabel("Gmail:*");
			      fmail.setPreferredSize(new Dimension(100,50));
			      fmail.setFont(new Font("Arial",Font.BOLD,15));
			      pg.add(fmail);
              
			      
			      tg=new JTextField() ;
			      tg.setPreferredSize(new Dimension(300,40));
			      tg.setFont(new Font("Calibri",Font.BOLD,20));
			      pg.add(tg);
			      form.add(pg);
			      
			      
			      //password
			      
                  pp= new JPanel(new FlowLayout());
			      
			      fp=new JLabel("Password:*");
			      fp.setPreferredSize(new Dimension(100,50));
			      fp.setFont(new Font("Arial",Font.BOLD,15));
			      
			      pp.add(fp);
			      
			      
			      tp=new JTextField() ;
			      tp.setPreferredSize(new Dimension(300,40));
			      tp.setFont(new Font("Calibri",Font.BOLD,20));
			      pp.add(tp);
			      form.add(pp);
			      
			      
			      //profession
			      
                  pro= new JPanel(new FlowLayout());
                 pro.setPreferredSize(new Dimension(450,50));
			      fpro=new JLabel("Profession:*");
			      fpro.setPreferredSize(new Dimension(275,50));
			      fpro.setFont(new Font("Arial",Font.BOLD,15));
			      pro.add(fpro);
			      
			      
			      bg2 = new ButtonGroup();
				    P = new JRadioButton("Prof");
				     E = new JRadioButton("Student");
				     P.setActionCommand("Prof");
				     E.setActionCommand("Student");
				    E.setSelected( true );
				    pro.add(P);
				    pro.add(E);
				    bg2.add(P);
				    bg2.add(E);
				   
			      form.add(pro);
			      
			      
		
		        //gender
			      
                  pa= new JPanel(new FlowLayout());
                   
			      fa=new JLabel("I am:");
			      fa.setPreferredSize(new Dimension(275,50));
			      fa.setFont(new Font("Arial",Font.BOLD,15));
			      pa.setPreferredSize(new Dimension(450,50));
			      pa.add(fa);
			      
			        bg = new ButtonGroup();
				    M = new JRadioButton("Male");
				     F = new JRadioButton("Female");
				     M.setActionCommand("Male");
				     F.setActionCommand("Female");
				    M.setSelected( true );
				    pa.add(M);
				    pa.add(F);
				    bg.add(M);
				    bg.add(F);
				    form.add(pa);
				      
			      //birthday
			      
			      pb= new JPanel(new FlowLayout());
			      
			      fb=new JLabel("Birthday:");
			      fb.setPreferredSize(new Dimension(230,50));
			      fb.setFont(new Font("Arial",Font.BOLD,15));
			      pb.add(fb);
			      
			      
			      
			      String l1 []={"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
				  d1 = new JComboBox(l1);
				 pb.add(d1);
				 
				 JLabel l= new JLabel("/");
				 l.setFont(new Font("Arial",Font.BOLD,20));
				 pb.add(l);
				 
				 String l2 []={"01","02","03","04","05","06","07","08","09","10","11","12"};
				  d2 = new JComboBox(l2);
				 pb.add(d2);
				 
				 la= new JLabel("/");
				 la.setFont(new Font("Arial",Font.BOLD,20));
				 pb.add(la);
				 
				 
				 
				 String l3 []={"1998","1999","2012","2013","2014","2015","2016","2017","2018","2019"};
				  d3 = new JComboBox(l3);
				 pb.add(d3);
				 form.add(pb);
			      
			      

			      this.getContentPane().add(form, BorderLayout.CENTER);
			      
			      
			    //bouton Create new account
					pc=new JPanel(new BorderLayout());
					bb=new JPanel(new FlowLayout());
			     
				      b=new JButton("Create New Account");
					    
				      b.setPreferredSize(new Dimension(270,40));
				      b.setBackground(Color.green);
				      b.setForeground(Color.white);
				      b.setFont(new Font("Calibri",Font.BOLD,23));
				      bb.add(b);
				      pc.add(bb,BorderLayout.CENTER);
				      
                       //button create listener
				      b.addActionListener (this);
				      
				      
		
				     //return to Login
				      r=new JButton("Login");
				      pr=new JPanel(new FlowLayout());
				      
				      r.setPreferredSize(new Dimension(150,35));
				      r.setBackground(Color.black);
				      r.setForeground(Color.red);
				      r.setFont(new Font("Calibri",Font.BOLD,20));
				      pr.add(r);
				      
				      pc.add(pr,BorderLayout.EAST);
				      
				      this.getContentPane().add(pc, BorderLayout.SOUTH);
				      r.addActionListener (this);
		
		
		
		
		
	}
	
	
	public void setVide() {
		tf.setText("");tl.setText("");tg.setText("");tp.setText("");
		d2.setSelectedIndex(0);d1.setSelectedIndex(0);d3.setSelectedIndex(0);
		
	}
	
	public void reset() {
		tg.setText("");
	
	}
	
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource()==b) {
		if( tf.getText().contentEquals("")|| tl.getText().contentEquals("")
				||tg.getText().equals("") ||tp.getText().equals("")) {
			
			
			JOptionPane.showMessageDialog(null,"Empty text field !");
				
			}
		
	else{
			Reg r=new Reg(tf.getText(),tl.getText(),tg.getText(),tp.getText(),bg.getSelection().getActionCommand(),bg2.getSelection().getActionCommand(),
					d3.getItemAt(d3.getSelectedIndex())+"-"+d2.getItemAt(d2.getSelectedIndex())+"-"+d1.getItemAt(d1.getSelectedIndex()),this);

			
	}
	}
		
		if(e.getSource()==r) {
			this.setVisible(false);
				Login l=new Login();
				
			
		}
	}
	

	
	
	

}
