package Exercicio2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Baskara extends JFrame{

	JLabel header1,header2,a,b,c,x1,x2;
	JTextField txt1,txt2,txt3,txtx1,txtx2;
	JButton calcular;
	
	public Baskara() {
		super("Descubra o valor de X na equação");
		Container tela = getContentPane();
		setLayout(null);
			header1 = new JLabel("Fórmula de Bhaskara");
			header2 = new JLabel("AX² + BX + C = 0");
			a = new JLabel("Digite o valor de A: ");
			b = new JLabel("Digite o valor de B: ");
			c = new JLabel("Digite o valor de C: ");
			x1 = new JLabel("X1: ");
			x2 = new JLabel("X2: ");
			txt1 = new JTextField(10);
			txt2 = new JTextField(10);
			txt3 = new JTextField(10);
			txtx1 = new JTextField("");
			txtx2 = new JTextField("");
			calcular = new JButton("Calcular");
			
			header1.setBounds(80,10,200,20);
			header2.setBounds(95,30,200,20);
			a.setBounds(20,60,150,20);
			b.setBounds(20,90,150,20);
			c.setBounds(20,120,150,20);
			x1.setBounds(60,220,30,20);
			x2.setBounds(60,260,30,20);
			txt1.setBounds(150,60,100,20);
			txt2.setBounds(150,90,100,20);
			txt3.setBounds(150,120,100,20);
			calcular.setBounds(90,160,100,30);
			txtx1.setBounds(80,220,120,20);
			txtx2.setBounds(80,260,120,20);
			
			calcular.addActionListener(
					new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					double a,b,c,x1,x2;
					
					x1=0;
					x2=0;
					
					a=Double.parseDouble(txt1.getText());
					b=Double.parseDouble(txt2.getText());
					c=Double.parseDouble(txt3.getText());
					
					x1 = ((-b+Math.sqrt((b*b)-(4*a*c)))/(2*a));
					x2 = ((-b-Math.sqrt((b*b)-(4*a*c)))/(2*a));
					
						txtx1.setVisible(true);
						txtx1.setText(""+x1);
						txtx2.setVisible(true);
						txtx2.setText(""+x2);
						}
					}
						
				);
			
			tela.add(header1);
			tela.add(header2);
			tela.add(a);
			tela.add(b);
			tela.add(c);
			tela.add(x1);
			tela.add(x2);
			tela.add(txt1);
			tela.add(txt2);
			tela.add(txt3);
			tela.add(txtx1);
			tela.add(txtx2);
			tela.add(calcular);
			
			setSize(300,360);
			setVisible(true);
	}
	
	public static void main(String args[]) {
		Baskara app = new Baskara();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
