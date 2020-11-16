package test;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame {
	
	JButton logar, cancelar;
	
	public Login(){
	    super("Label");
	    
	    Container c = getContentPane();
	    c.setLayout(new GridLayout(3, 2));
	    c.add(new JLabel("Login:"));
	    c.add(new JTextField());
	    c.add(new JLabel("Senha:"));
	    c.add(new JPasswordField());
	    c.add(new JButton("Logar:"));
	    c.add(new JButton("Cancelar"));
	    
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setSize(300, 150);
	    setVisible(true);
	    
    }
	

	public static void main(String[] args) {
		
		new Login();

		
    }

}