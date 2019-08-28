package Exercicio4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TipoDoTriangulo extends JFrame{

	JLabel l1,l2,l3,res;
	JTextField cl1,cl2,cl3;
	JButton verific;

	public TipoDoTriangulo(){
		super("Descubra o tipo do TriÃ¢ngulo");
		Container tela = getContentPane();
		setLayout(null);
			l1 = new JLabel("Lado 1: ");
			l2 = new JLabel("Lado 2: ");
			l3 = new JLabel("Lado 3: ");
			res = new JLabel("");
			cl1 = new JTextField(20);
			cl2 = new JTextField(20);
			cl3 = new JTextField(20);
			verific = new JButton("Verificar Tipo");
			
			l1.setBounds(40,10,60,20);
			l2.setBounds(40,40,60,20);
			l3.setBounds(40,70,60,20);
			cl1.setBounds(100,10,200,20);
			cl2.setBounds(100,40,200,20);
			cl3.setBounds(100,70,200,20);
			verific.setBounds(90,120,120,30);
			res.setBounds(380,50,150,20);
			
			verific.addActionListener(
					new ActionListener(){
						public void actionPerformed(ActionEvent e){
						double l1,l2,l3;
						String tipo = null;
						
						l1 = Double.parseDouble(cl1.getText());
						l2 = Double.parseDouble(cl2.getText());
						l3 = Double.parseDouble(cl3.getText());
						
						if((l1==0)||(l2==0)||(l3==0)) {
							tipo = "Não é um Triângulo";
						}
						else if((l1==l2)&&(l2==l3)) {
							tipo = "Triângulo Equilatero";
						}
						else if(((l1==l2)&&(l2!=l3))||((l1!=l2)&&(l2==l3))) {
							tipo = "Triângulo Isósceles";
						}
						else if((l1!=l2)&&(l2!=l3)) {
							tipo = "Triângulo Escaleno";
						}
						else {
							
						}
						
					res.setVisible(true);
					res.setText(tipo);
						}
					});
				
				res.setVisible(false);
			
		tela.add(l1);	
		tela.add(l2);
		tela.add(l3);
		tela.add(cl1);
		tela.add(cl2);
		tela.add(cl3);
		tela.add(res);
		tela.add(verific);
		setSize(600,250);
		setVisible(true);
	}
	
	public static void main(String args[]){
		TipoDoTriangulo app = new TipoDoTriangulo();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}