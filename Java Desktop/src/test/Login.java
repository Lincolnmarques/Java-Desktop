package test;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener{
	
	JButton logar, cancelar;
	
	public Login(){
	    super("Label");
	    
	    logar = new JButton("Logar");
	    logar.addActionListener(this);
	    
	    cancelar = new JButton("Cancelar");
	    cancelar.addActionListener(this);
	    
	    Container c = getContentPane();
	    c.setLayout(new GridLayout(3,2));
	    c.add(new JLabel("Login:"));
	    c.add(new JTextField());
	    c.add(new JLabel("Senha:"));
	    c.add(new JPasswordField());
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
			
            System.out.println("Clicou no logar");
			}
			
		}

}			