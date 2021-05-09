package mainpage;
import data_base.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

import projet.Frame;

public class Blog extends Frame implements ActionListener  {
	
	JLabel l,lsep,lsep2;
	JButton bs;
	ImageIcon ic;
	JPanel p,pg,pn;
	java.sql.ResultSet rs;
	Connection con=null;
	JButton b1,b2,b3,r;
	static public int i;
	JButton [] tab ;
	Myconnection c;
	 String tu;
	 JTextField te;
	
	public Blog(JTextField t1) {
		tu=t1.getText();
		 te=t1;

		
	this.setTitle("Blog");

	this.setSize(950,720);
	
    // panel géneral
	
	p= new JPanel(new BorderLayout());
	// panel en north de panel gene rale contenat bouton et label(blog)
	
	pn= new JPanel(new FlowLayout());
	l=new JLabel();
	ic=new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/blg.png")).getImage().getScaledInstance(200,150, Image.SCALE_SMOOTH));
	 l= new JLabel();		
	 l.setIcon(ic);
	 pn.add(l);
	
	lsep=new JLabel();
	lsep.setPreferredSize(new Dimension(50,0));
	pn.add(lsep);
	
	// return to welcome 
    r=new JButton("Welcome page");
    r.setPreferredSize(new Dimension(100,40));
    r.setBackground(Color.darkGray);
    r.setForeground(Color.white);
    r.setFont(new Font("Calibri",Font.BOLD,23));
    r.addActionListener(this);
    
  
    p.add(r,BorderLayout.SOUTH);
	
	
	
	bs =new JButton("Nouveau Post");
	bs.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
	bs.setPreferredSize(new Dimension(150,50));
	bs.setFont(new Font("Times New Roman",Font.BOLD,20));
	bs.setBackground(new Color(20,150,250));
	bs.setOpaque(true);
	bs.addActionListener(this);
	pn.add(bs);

	p.add(pn,BorderLayout.NORTH);
	
	
	
	// GRID pane pour afficher et manipuler les posts
	
	pg= new JPanel(new GridLayout(0,2,1,5));

	
	
	//BlogD bd= new BlogD(p,pg);
	

	c=new Myconnection();
	c.connect();

     tab =new JButton[] {new JButton("Commenter"),new JButton("Commenter"),new JButton("Commenter"),new JButton("Commenter"),new JButton("Commenter"),new JButton("Commenter"),new JButton("Commenter"),new JButton("Commenter"),new JButton("Commenter"),new JButton("Commenter"),new JButton("Commenter")};
	
	
	rs=c.afficheposts();
	try {
		while(rs.next() &&(i<10)) {
			
			//panel de posts
			JLabel l = new JLabel (rs.getString(1));
			
			l.setBackground(Color.white);
			l.setOpaque(true);
			pg.add(l);
			
			// panel de commenter comentaire et j'aime
			JPanel pBCJ=new JPanel(new FlowLayout());
			JLabel jaime = new JLabel (" j'aime");
			jaime.setBackground(Color.white);
			jaime.setOpaque(true);
			 b1 =new JButton("J'aime");
			 b3 =new JButton("Voir commentaires");
			 b1.addActionListener(this);
			 tab[i].addActionListener(this);
			 b3.addActionListener(this);
			pBCJ.add(b1);
			pBCJ.add(tab[i]);
			pBCJ.add(b3);
			pBCJ.add(jaime);
			
			pg.add(pBCJ);
			i=i+1;
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	p.add(pg,BorderLayout.CENTER);

	this.getContentPane().add(p);

	
	
	
}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==bs) {
		
			Post pp=new Post(this);
			
			
		}
		for (i=0;i<10;i++) {
		if(e.getSource()==tab[i]) { 
			Commenter ctr = new Commenter(i);
		}
		}
		if(e.getSource()==r) {	
			this.invalidate();
			this.validate();
			this.repaint();
			
		}
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

