package consumer_producer;
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class Fenetre {
	JFrame f; 
	JPanel p1; 
	JLabel l1; 
	JLabel l2; 
	JTextField f1; 
	JTextField f2; 
	JButton b1; 
	JTextArea ta; 
	Fenetre(){
		f= new JFrame("producer_consumer"); 
		p1= new JPanel(); 
		l1= new JLabel("Nombre de producteurs"); 
		l2= new JLabel("Nombre de consommateurs "); 
		f1= new JTextField(); 
		f2= new JTextField(); 
		b1= new JButton("Démarrer"); 
		ta= new JTextArea(); 
		
		p1.setLayout(new GridLayout(2,2));
		p1.add(l1,0,0); 
		p1.add(f1,0,1); 
		p1.add(l2,1,0); 
		p1.add(f2,1,1); 
		
		f.add(p1, BorderLayout.NORTH);
		f.add(b1, BorderLayout.SOUTH); 
		f.add(ta, BorderLayout.CENTER); 
		
		Events e=new Events(this); 
		b1.addActionListener(e);
		
		
		
		f.pack(); 
		f.setVisible(true);
		
		
		
		
		
		
	}
	
	
	

}
