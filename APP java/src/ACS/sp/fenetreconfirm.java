package ACS.sp;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class fenetreconfirm extends JFrame implements ActionListener {
	 JLabel pfiab;
	 JButton oui , non;
	public fenetreconfirm() {
		// TODO Auto-generated constructor stub
		this.setTitle(" Confirmer ");
	    this.setSize(350, 100);
	    this.setLocationRelativeTo(null); // placer la fenêtre au centre de l'écran
	    this.setLayout(null);                                 
	    this.setResizable(false);
	    this.setVisible(true);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    pfiab = new JLabel("Voulez vous vraiment quitter?");
	    pfiab.setFont(new Font("Tahoma", Font.BOLD, 13));
	    pfiab.setBounds(70, 10, 450, 20);
	    getContentPane().add(pfiab);
	    
	    oui=new JButton("oui");
	    oui.setBounds(100,40,60,20);
	    getContentPane().add(oui);
	    oui.addActionListener(this);
	    non=new JButton("non");
	    non.setBounds(180,40,60,20);
	    getContentPane().add(non);
	    non.addActionListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
		      public void run() {
		        try {
		          fenetreconfirm frame = new fenetreconfirm();
		          frame.setVisible(true);

		        }
		        catch (Exception e) {
		          e.printStackTrace();
		        }
		      }
		    });
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==oui)System.exit(0);
		if(e.getSource()==non) this.dispose();
		
	}
}
