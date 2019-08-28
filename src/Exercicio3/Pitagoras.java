package Exercicio3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Pitagoras extends JFrame{
	JLabel a,b,res;
	JTextField txta,txtb;
	JButton botao;
	
	public Pitagoras(){
		super("Caluclo do lado do triângulo");
		Container tela = getContentPane();
		setLayout(null);
			a = new JLabel("Digite o valor do lado A: ");
			b = new JLabel("Digite o valor do lado B: ");
			res = new JLabel("");
			txta = new JTextField(5);
			txtb = new JTextField(5);
			botao = new JButton("Calcular");
			
			a.setBounds(30,40,200,20);
			b.setBounds(30,70,200,10);
			txta.setBounds(210,40,100,20);
			txtb.setBounds(210,70,100,20);
			botao.setBounds(100,120,100,30);
			res.setBounds(10,170,200,20);
			
			botao.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
					double a,b,x;
					x=0;
					
					a = Double.parseDouble(txta.getText());
					b = Double.parseDouble(txtb.getText());
					
					x = Math.sqrt((a*a)+(b*b));
				
				res.setVisible(true);
				res.setText("O valor de X é igual a: "+x);
					}
				});
			
			res.setVisible(false);
			
			tela.add(a);
			tela.add(b);
			tela.add(txta);
			tela.add(txtb);
			tela.add(res);
			tela.add(botao);
			
			setSize(400,250);
			setVisible(true);
	}
	
	public static void main(String args []){
		Pitagoras app= new Pitagoras();
		app.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
