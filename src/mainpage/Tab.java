package mainpage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import projet.Frame;

public class Tab extends Frame implements ActionListener {

	JLabel l1;
	JPanel p1,pc;
	JButton r;
	 String tu;
	 JTextField te;
	public Tab(JTextField t1) {
		tu=t1.getText();
		 te=t1;
		
		
	      l1=new JLabel("The schedule");
	      l1.setPreferredSize(new Dimension(370,100));
	      l1.setBackground(new Color(20,150,250));
	      l1.setOpaque(true);
	      l1.setFont(new Font("Arial",Font.BOLD,35));
	
	      //p1.add(logo, BorderLayout.CENTER);
	      this.getContentPane().add(l1, BorderLayout.NORTH);
		
		
		
		
		
		
		
		
		 //Les donn�es du tableau  
		//String d []={ "s1","s2","s2","s3","s4","s5","s6"};
		Object[][]data = {{ "Lundi","s1","M�thodologies d'analyse et de conception de logiciels (MOO, Design patterns, �)-FI-SE2","K09"},{ "","s2","Syst�mes d'exploitation embarqu�s et temps r�el-FI-SE2","G14"},{ "","s3","Th�orie des Langages et Compilation-FI-SE2","G03"},{ "","s4","Syst�mes d'exploitation embarqu�s et temps r�el-FI-SE2","G14"},{ "","s5","M�thodologies d'analyse et de conception de logiciels (MOO, Design patterns, �)-FI-SE2","G04"},{ "","s6","M�thodologies d'analyse et de conception de logiciels (MOO, Design patterns, �)-FI-SE2","G04"},{ "Mardi","s1","Programmation OO (IG, Threads, RMI, Socket, �)-FI-SE2","G13"},{ "","s2","Programmation OO (IG, Threads, RMI, Socket, �)-FI-SE2","G13"},{ "","s3","R�seaux Informatiques-FI-SE2","K13"},
				{ "Mercredi","s1","Graphes et Recherche Op�rationnelle-FI-SE2","I-15"},
		{ "","s2","Comptabilit� g�n�rale-FI-SE2","M05"},
		{ "","s3","R�seaux Informatiques-FI-SE2","K12"},
		{ "","s4","Fran�ais 2-FI-SE2","I12"},
		{ "Jeudi","s1","Syst�mes d'exploitation embarqu�s et temps r�el-FI-SE2","I-16"},
		{ "","s2","Graphes et Recherche Op�rationnelle-FI-SE2","M05"},
		{ "","s4","Math�matiques pour l'Ing�nieur-FI-SE2","I12"},
		{ "Vendredi","s1","Th�orie des Langages et Compilation-FI-SE2","K13"},
		{ "","s2","Anglais 2-FI-SE2","I-08"}, 
		{ "","s4","Programmation OO (IG, Threads, RMI, Socket, �)-FI-SE2","I15"},
		{ "","s5","-M�thodologies d'analyse et de conception de logiciels (MOO, Design patterns, �)-FI-SE2","K09"},
		{ "Samedi","s2","Th�orie des Langages et Compilation-FI-SE2","K13"},
		{ "","s4","Internet et Protocoles-FI-SE2","J08"}, }; 
	
		 //Les titres des colonnes  
		String  title[] = {"Jours", "S�ance","Mati�re","Salle"};  
		
		JTable tab = new JTable(data, title);
		tab.setBackground(Color.white);
		tab.setOpaque(true);
		tab.setFont(new Font("Arial",Font.BOLD,15));
		
		this.getContentPane().add(new JScrollPane(tab), BorderLayout.CENTER);
		
		
		
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
