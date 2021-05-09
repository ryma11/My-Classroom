package mainpage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.JLabel;
import javax.swing.JPanel;

import data_base.Myconnection;

public class MyCourses extends JPanel implements MouseListener{
 JLabel l1;
 Myconnection c;
 JPanel pg;
 java.sql.ResultSet rs;
 private JLabel link ;
 JLabel l;
 ArrayList<Course> courlist;
	public MyCourses()  {
	     this.setLayout( new BorderLayout());
	    	l1=new JLabel("Courses ");
		      l1.setPreferredSize(new Dimension(370,50));
		      l1.setBackground(new Color(20,150,250));
		      l1.setOpaque(true);
		      l1.setFont(new Font("Arial",Font.BOLD,35));
			  this.add(l1, BorderLayout.NORTH);
		  //affich courses
		  c=new Myconnection();
		  c.connect();
		  rs=c.affichcourses();
		  pg= new JPanel(new GridLayout(0,1,1,5));
	
		  
		  // links
		  l = new JLabel();
		 l.setForeground(Color.BLUE.darker());
	       l.setCursor(new Cursor(Cursor.HAND_CURSOR));
	       l.addMouseListener(this);
		  
		  
	       courlist= new ArrayList<Course>();
			  
		  
		  
		  this.add(pg, BorderLayout.CENTER);
		
	}
	
	
	
	public ArrayList getcourese() {
		
			try {
				while(rs.next()) {
					Course cours = new Course(rs.getString(1),rs.getString(2));
					courlist.add(cours);
      
      

      
				
}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return courlist;}
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource()==l) {
		try {
			Desktop.getDesktop().browse(new URI("http://www.codejava.net"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (URISyntaxException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}}
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		if(e.getSource()==l) {
		l.setText("<html><a href=''>" + "gggg" + "</a></html>");}
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
