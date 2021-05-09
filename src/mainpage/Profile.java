package mainpage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import data_base.Myconnection;
import projet.Frame;

public class Profile extends Frame implements ActionListener {
	 JPanel p1,form,pf,pl,pg,pp,pa,bb,pc,pr,pb,pro;
	 JLabel logo,l1,fname,flast,fmail,fp,fa,fb,la,fpro;
	 JButton b,r;
	 JLabel tf,tl,tg,tp,gender,datenaiss,ppp;
	 String nom,pre,gll,pss,gen,dn,profess;
	 JComboBox <String>d1,d2,d3;
	 JRadioButton M,F,E,P;
	 ButtonGroup bg,bg2;
	 ResultSet rs;
	 String tu;
	 JTextField te;
	public Profile(JTextField t1) {
		
		//gmail de l'utils actuell
		 tu=t1.getText();
		 te=t1;
		this.setTitle("Registration");
		this.setSize(850,620); //870,600
		
		
		// remplissage de profile
		
	      Myconnection c=new Myconnection();
	      c.connect();
	     rs=c.infoProfil(tu);
	     try {
	    	 while(rs.next()) {
			nom=rs.getString(1);
			pre=rs.getString(2);
			gll=rs.getString(3);
			pss=rs.getString(4);
			profess=rs.getString(5);
			gen=rs.getString(6);
			dn=rs.getString(7);
	    	 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// logo
		
				p1= new JPanel(new BorderLayout());
				
			     /* Image lo = new ImageIcon(this.getClass().getResource("/reg.png")).getImage();
			      logo=new JLabel();
			      logo.setIcon(new ImageIcon(lo));*/
			      p1.setLayout(new BorderLayout());
			      l1=new JLabel("Profile");
			      l1.setPreferredSize(new Dimension(370,100));
			      l1.setBackground(new Color(20,150,250));
			      l1.setOpaque(true);
			      l1.setFont(new Font("Arial",Font.BOLD,30));
			      p1.add(l1);
			      //p1.add(logo, BorderLayout.CENTER);
			      this.getContentPane().add(p1, BorderLayout.NORTH);
		
		// Fromulaire
			      form=new JPanel(new FlowLayout());
			      // first name:
			      pf= new JPanel(new FlowLayout());
			      
			      fname=new JLabel("First Name:");
			      fname.setPreferredSize(new Dimension(200,50));
			      fname.setFont(new Font("Arial",Font.BOLD,15));
			      pf.add(fname);
			      
			      
			      tf=new JLabel(nom) ;
			      tf.setPreferredSize(new Dimension(220,40));
			      tf.setFont(new Font("Calibri",Font.BOLD,20));
			      tf.setFont(new Font("Calibri",Font.BOLD,20));
			      tf.setBackground(Color.LIGHT_GRAY);
			      tf.setOpaque(true);
			      
			      
			      pf.add(tf);
			      form.add(pf);
			      
			    
			      
			      // last name
			      pl= new JPanel(new FlowLayout());
			      
			      flast=new JLabel("Last Name:");
			      flast.setPreferredSize(new Dimension(200,50));
			      flast.setFont(new Font("Arial",Font.BOLD,15));
			      pl.add(flast);
			      
			      
			      tl=new JLabel(pre) ;
			      tl.setPreferredSize(new Dimension(220,40));
			      tl.setFont(new Font("Calibri",Font.BOLD,20));
			      tl.setFont(new Font("Calibri",Font.BOLD,20));
			      tl.setBackground(Color.LIGHT_GRAY);
			      tl.setOpaque(true);
			      
			      pl.add(tl);
			      form.add(pl);
		
		
			      
			      // Gmail
                  pg= new JPanel(new FlowLayout());
			      
			      fmail=new JLabel("Gmail:");
			      fmail.setPreferredSize(new Dimension(150,30));
			      fmail.setFont(new Font("Arial",Font.BOLD,15));
			      pg.add(fmail);
              
			      
			      tg=new JLabel(gll) ;
			      tg.setPreferredSize(new Dimension(270,40));
			      tg.setFont(new Font("Calibri",Font.BOLD,20));
			      tg.setFont(new Font("Calibri",Font.BOLD,20));
			      tg.setBackground(Color.LIGHT_GRAY);
			      tg.setOpaque(true);
			      pg.add(tg);
			      form.add(pg);
			      
			      
			      //password
			      
                  pp= new JPanel(new FlowLayout());
			      
			      fp=new JLabel("Password:");
			      fp.setPreferredSize(new Dimension(220,50));
			      fp.setFont(new Font("Arial",Font.BOLD,15));
			      
			      pp.add(fp);
			      
			      
			      tp=new JLabel(pss) ;
			      tp.setPreferredSize(new Dimension(200,40));
			      tp.setFont(new Font("Calibri",Font.BOLD,20));
			      tp.setFont(new Font("Calibri",Font.BOLD,20));
			      tp.setBackground(Color.LIGHT_GRAY);
			      tp.setOpaque(true);
			      
			      pp.add(tp);
			      form.add(pp);
			      
			      
			      //profession
			      
                  pro= new JPanel(new FlowLayout());
                 
            
			      fpro=new JLabel("Profession:");
			      fpro.setPreferredSize(new Dimension(220,30));
			      fpro.setFont(new Font("Arial",Font.BOLD,15));
			      pro.add(fpro);
			       
			      ppp=new JLabel(profess);
			      ppp.setPreferredSize(new Dimension(200,40));
			      ppp.setFont(new Font("Calibri",Font.BOLD,20));
			      ppp.setBackground(Color.LIGHT_GRAY);
			      ppp.setOpaque(true);
			      
			      pro.add(ppp);   
			      form.add(pro);
			      
			      
		
		        //gender
			      
                  pa= new JPanel(new FlowLayout());
                   
			      fa=new JLabel("I am:");
			      fa.setPreferredSize(new Dimension(220,50));
			      fa.setFont(new Font("Arial",Font.BOLD,15));
			     // pa.setPreferredSize(new Dimension(230,50));
			      pa.add(fa);
			      
			      
			      gender=new JLabel(gen) ;
			      gender.setPreferredSize(new Dimension(200,40));
			      gender.setFont(new Font("Calibri",Font.BOLD,20));
			      gender.setFont(new Font("Calibri",Font.BOLD,20));
			      gender.setBackground(Color.LIGHT_GRAY);
			      gender.setOpaque(true);
			      pa.add(gender);
			      
				  form.add(pa);
				      
			      //birthday
			      
			      pb= new JPanel(new FlowLayout());
			      
			      fb=new JLabel("Birthday:");
			      fb.setPreferredSize(new Dimension(220,50));
			      fb.setFont(new Font("Arial",Font.BOLD,15));
			      pb.add(fb);
			      
			      datenaiss=new JLabel(dn);
			      datenaiss.setPreferredSize(new Dimension(200,40));
			      datenaiss.setFont(new Font("Calibri",Font.BOLD,20));
			      datenaiss.setFont(new Font("Calibri",Font.BOLD,20));
			      datenaiss.setBackground(Color.LIGHT_GRAY);
			      datenaiss.setOpaque(true);
			  
				 pb.add(datenaiss);
				 form.add(pb);
			      
			      

			      this.getContentPane().add(form, BorderLayout.CENTER);
			      
			      // return to welcome 
			      r=new JButton("Welcome page");
			      pc=new JPanel(new BorderLayout());
			      r.setPreferredSize(new Dimension(100,40));
			      r.setBackground(Color.darkGray);
			      r.setForeground(Color.white);
			      r.setFont(new Font("Calibri",Font.BOLD,23));
			      r.addActionListener(this);
			      pc.add(r);
			      
			      
			      
			      
			      
			      this.getContentPane().add(pc, BorderLayout.SOUTH);
			      
			      
			
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==r) {	
			Welcome cc= new Welcome( te);
			
		}
		
	}

}
