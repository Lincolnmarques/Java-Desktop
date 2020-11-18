package test;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener{
	
	JTextField login;
	JPasswordField senha;
	JButton logar, cancelar;
	
	public Login(){
	    super("Label");
	    
	    logar = new JButton("Logar");
	    logar.addActionListener(this);
	    	
	    
	    cancelar = new JButton("Cancelar");
	    cancelar.addActionListener(this);
	    
	    login = new JTextField();
	    senha =	new JPasswordField();		
	    
	    Container c = getContentPane();
	    c.setLayout(new GridLayout(3,2));
	    c.add(new JLabel("Login"));
	    c.add(login);
	    c.add(new JLabel("Senha:"));
	    c.add(senha); 
	    c.add(logar);
	    c.add(cancelar);
	    
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setSize(300, 150);
	    setVisible(true);
	    
    }
	

	public static void main(String[] args) {
		
		new Login();
		
    }
	
    
	
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource() == logar){
				
			String s = "Login:" + login.getText()
			        + "\nsenha:" + new String(senha.getPassword());
                    JOptionPane.showMessageDialog(null, s);
			}
			
			else if(e.getSource() == cancelar) {
				
				login.setText("");
				senha.setText("");
				
			    }
		}

}			