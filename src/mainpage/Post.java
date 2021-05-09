package mainpage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

import data_base.Pos;
import data_base.Reg;
import projet.Frame;

public class Post  extends Frame implements ActionListener  {
	JLabel l,l2;
	JButton b;
	JTextArea t;
	JPanel p ,p2;
	Blog bb;
	public Post(Blog blo) {
		bb=blo;
		p= new JPanel(new BorderLayout());
		l=new JLabel("Ajoutez une publication: ");
		l.setFont(new Font("Times New Roman",Font.BOLD,35));
		l.setPreferredSize(new Dimension(150,100));
		l.setBackground(Color.LIGHT_GRAY);
		l.setOpaque(true);
		p.add(l,BorderLayout.NORTH);
		this.setSize(800,400);
		t= new JTextArea();
		t.setPreferredSize(new Dimension(80,80));
		t.setFont(new Font("Times New Roman",Font.BOLD,25));
		p.add(t,BorderLayout.CENTER);
		
		l2=new JLabel();
		l2.setPreferredSize(new Dimension(20,0));
		p2=new JPanel(new FlowLayout());
		p2.add(l2);
		
		b= new JButton("Publier");
		b.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
		b.setFont(new Font("Times New Roman",Font.BOLD,30));
		b.setPreferredSize(new Dimension(130,60));
		b.setBackground(Color.LIGHT_GRAY);
		b.addActionListener(this);
		p2.add(b);
		
		p.add(p2,BorderLayout.SOUTH);
		
		this.getContentPane().add(p);
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==b) { 
		bb.setVisible(false);
			Pos post=new Pos(this,t.getText());
			
			
			
		}
	}

}
