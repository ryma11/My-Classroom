package mainpage;

import java.awt.*;
		import java.awt.event.*;
		import java.net.*;
		import java.io.*;
		import javax.swing.*;
		import javax.swing.event.*;

		    public class Search extends JPanel implements ActionListener {
		  
		    JPanel p;
		    JLabel l1;
		   
		    private JTextField tx;
		    private JButton bl;

		    public Search() {
		       this.setLayout( new BorderLayout());
		    	l1=new JLabel("Make a google search ");
			      l1.setPreferredSize(new Dimension(370,50));
			      l1.setBackground(new Color(20,150,250));
			      l1.setOpaque(true);
			      l1.setFont(new Font("Arial",Font.BOLD,35));
				  this.add(l1, BorderLayout.NORTH);		    	
		        p = new JPanel(new FlowLayout());
		       
//********************
		        tx = new JTextField();
		        tx.setPreferredSize(new Dimension(400,40));
			      tx.setFont(new Font("Arial",Font.BOLD,20));
		        p.add(tx);

		        bl = new JButton("SEARCH");
		        bl.setPreferredSize(new Dimension(150,35));
			      bl.setBackground(new Color(20,140,240));
			      bl.setForeground(Color.white);
			      bl.setFont(new Font("Calibri",Font.BOLD,25));
		        bl.addActionListener(this);
		        p.add(bl);
		        this.add(p, BorderLayout.CENTER);

		        
		    }

		    public void actionPerformed(ActionEvent e) {
		        if (bl == e.getSource() ) {
		    	           
		                    affichePage("http://www.google.com/search?q="+tx.getText() );
		        }

		        // événements des options des sous-menus
		        
		    }

		    private void affichePage(String urlName) {
		        String iedir = "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome"; 
		        try {
		            Runtime r = Runtime.getRuntime();
		            r.exec(iedir + " " + urlName);
		        }
		        catch(MalformedURLException e) {}
		        catch(FileNotFoundException e) {}
		        catch(IOException e) {}
		    }

		    

		    
		    }
		

	


