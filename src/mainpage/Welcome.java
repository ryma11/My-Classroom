package mainpage;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
import javax.swing.Popup;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;

import VoiceRecog.VoiceR;
import projet.*;

public class Welcome extends Frame implements MouseListener, ActionListener {
	JPanel p,pc,labs,y;
	JLabel le,l,li1, li2,li3,li4,li5,li6,lp;
    Icon ic1,ic2,ic3,ic4,ic5,ic6,icp;
    JMenuItem m1,m2 ,m3;
    JPopupMenu po;
    JTextField t;
	public Welcome(JTextField t1/*gamil de l'utilsateur courant*/) {
		this.setTitle("My Classeroom");
		this.setSize(940,700);
		 t=t1;
		 
	    // panel géneral
		
		p= new JPanel(new BorderLayout());
		l=new JLabel("SMART CLASSROOM");
		l.setFont(new Font("Arial",Font.BOLD,50));
		l.setPreferredSize(new Dimension(200,120));
		l.setBackground(new Color(20,140,240));
		l.setOpaque(true);
		p.add(l, BorderLayout.NORTH);
		
		
		//panel inclus dans le centre du panel general
		pc = new JPanel();
		pc= new JPanel(new BorderLayout());
	
		labs = new JPanel(new FlowLayout());
		
		
		//popup menu
		ImageIcon icp =new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/pop.png")).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));
		
		 lp= new JLabel();		
		 lp.setIcon(icp);
		 lp.addMouseListener(this);
	     labs.add(lp);

	     
	  
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
		//label d'espace
		le=new JLabel();
		le.setPreferredSize(new Dimension(200,0));
		labs.add(le);
		

		
		// icone courses
		ImageIcon ic6 =new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/course.png")).getImage().getScaledInstance(100, 80, Image.SCALE_SMOOTH));
		
		 li6= new JLabel();		
		 li6.setIcon(ic6);
		 li6.addMouseListener(this);
	     labs.add(li6);
		
		
		//1 icone scheduale 
				ImageIcon ic4 =new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/sche.png")).getImage().getScaledInstance(100, 80, Image.SCALE_SMOOTH));
				
				 li4 = new JLabel();		
				 li4.setIcon(ic4);
				 li4.addMouseListener(this);
			     labs.add( li4);
		
		//2 icone todo list
		ImageIcon ic3 =new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/todo.png")).getImage().getScaledInstance(100, 80, Image.SCALE_SMOOTH));
		
		 li3 = new JLabel();		
		 li3.setIcon(ic3);
		 li3.addMouseListener(this);
	     labs.add( li3);
	     
	     
	     // icone vocal
			ImageIcon ic5 =new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/voc.png")).getImage().getScaledInstance(100, 80, Image.SCALE_SMOOTH));
			
			 li5 = new JLabel();		
			 li5.setIcon(ic5);
			 li5.addMouseListener(this);
		     labs.add(li5);

	     
		//3 icone Blog
		ImageIcon ic1 =new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/blog.png")).getImage().getScaledInstance(100, 80, Image.SCALE_SMOOTH));
		
		 li1 = new JLabel();		
		 li1.setIcon(ic1);
		 li1.addMouseListener(this);
	     labs.add( li1);
		
	   //4 icone rech
			ImageIcon ic2 =new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/rech.png")).getImage().getScaledInstance(100, 80, Image.SCALE_SMOOTH));
			
			 li2 = new JLabel();		
			 li2.setIcon(ic2);
			 li2.addMouseListener(this);
		     labs.add( li2);
	
		   
			     
	    pc.add(labs, BorderLayout.NORTH);
		p.add(pc,BorderLayout.CENTER);
		
		// pop menu
		   po=new JPopupMenu()	;
		//iteams
         m1 = new JMenuItem("Profile"); 
        m2 = new JMenuItem("Paramétres"); 
        m3 = new JMenuItem("Log Out"); 
        m1.addActionListener(this);
        m2.addActionListener(this);
        m3.addActionListener(this);
        // add menuitems to popup menu 
        m1.setOpaque(true);
        m1.setBackground(Color.white);
        m2.setOpaque(true);
        m2.setBackground(Color.white);
        m3.setOpaque(true);
        m3.setBackground(Color.white);
        m1.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
        m2.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
        m3.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
        po.setBorder(BorderFactory.createLineBorder(Color.black));
        po.add(m1); 
        po.add(m2); 
        po.add(m3); 
        po.setPopupSize(new Dimension(180,150));

		
		this.getContentPane().add(p,BorderLayout.NORTH);
		
	}

	
	@Override
	public void mouseClicked(MouseEvent e) {
		//blog
		
		if(e.getSource()==li1) {
			Blog b=new Blog(t);}
		
		if(e.getSource()==li4) {
			Tab b=new Tab(t);}
		
		if(e.getSource()==li5) {
			try {
				VoiceR b=new VoiceR(t);
			} catch (IOException e1) {
				
				e1.printStackTrace();
			}}

		if(e.getSource()==li2) {
			Search x= new Search();
			this.getContentPane().add(x,BorderLayout.CENTER);
			this.invalidate();
			this.validate();
			this.repaint();
			}
		if(e.getSource()==li6) {
			Advice q= new Advice(this);
			this.getContentPane().add(q,BorderLayout.CENTER);
			this.invalidate();
			this.validate();
		
			
			}

		
		
		}
		
	
		
	
	
	
	
	
	

	@Override
	public void mousePressed(MouseEvent e) {
		
		//menupuoup
		if(e.getSource()==lp) {
		
	       
			po.show(pc,50,50);
			this.getContentPane().add(p); 
			}
		
		
		

		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		 // log out action
		
		    if(e.getSource()==m3) {				
		    this.setVisible(false);
			Mafenetre ma =new Mafenetre();}
		    
		 // profile    
		    if(e.getSource()==m1) {				
			    this.setVisible(false);
				Profile ma =new Profile(t);}
		
		    
		    
		
		
	}
	
	

}
