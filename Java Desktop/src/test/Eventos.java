package test;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Eventos extends JFrame {
	
	
    public Eventos(){
    super("Label");
    
    JLabel simples = new JLabel("Label Teste");
    simples.setToolTipText("Meu Label");
    
    Container c = getContentPane();
    c.setLayout(new FlowLayout());
    c.add(simples);
    
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(300, 300);
    setVisible(true);
    
    }
    
    public static void main(String[] args) {
    	
      new Eventos();
       
    }


}