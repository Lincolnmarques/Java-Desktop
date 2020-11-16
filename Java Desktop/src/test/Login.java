package test;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Login extends JFrame {
	public Login(){
	    super("Label");
	    
	    Container c = getContentPane();
	    c.setLayout(new GridLayout(3, 2));
	    c.add(new JLabel("Login:"));
	    
    }
	
	
	public static void main(String[] args) {
		
		new Login();
		
	}
	
	
    }

