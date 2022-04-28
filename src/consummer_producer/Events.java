package consumer_producer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Events implements ActionListener, WindowListener {
	Fenetre fenetre; 
	
	public Events(Fenetre ihm) {
		this.fenetre=ihm;
	}
	
	public static int  isNumeric(String strNum) {
	    if (strNum == null) {
	        return -1 ;
	    }
	    try {
	        int d = Integer.parseInt(strNum);
	        return  d ;
	    } catch (NumberFormatException nfe) {
	        return -1;
	    }
	 
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if(e.getSource()== fenetre.b1) {
			List <Integer> queue =new ArrayList<>();
			String prod= fenetre.f1.getText();
			String consom= fenetre.f2.getText();
			if((isNumeric(prod)==-1)||(isNumeric(consom)==-1 )){
				 JOptionPane.showMessageDialog(null, "Please insert all items in integer" );
			}else 
				if(isNumeric(prod)<isNumeric(consom)) {
					JOptionPane.showMessageDialog(null, "Producers should be greater then conssummers" );
			}else
			
			
			{
				
				for (int i=0 ; i<isNumeric(prod) ; i++) {
			    Producer p= new Producer(queue ,i); 
			    p.setName("p"+i);
			    p.start();
			    try {
					p.join();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				}
				
				
				
			    for (int i=0 ; i<isNumeric(consom) ; i++) {
				    Consummer cons= new Consummer(queue);
				    Thread c= new Thread (cons);
				    c.setName("Consummer"+i);
				    c.start();
				    try {
						c.join();
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			    
			    
			    
			fenetre.ta.setText(queue.toString());
				
				
			}
			
		
			
			
			
			
			
			
			
			
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}