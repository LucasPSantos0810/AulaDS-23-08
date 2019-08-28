package Exercicio1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Media extends JFrame{
	
	JLabel n1,n2,n3,n4,res;
	JTextField txt1,txt2,txt3,txt4;
	JButton media;
	
	public Media() {
		super("Media dos Alunos");
		Container tela = getContentPane();
		setLayout(null);
			n1 = new JLabel("1ª Nota: ");
			n2 = new JLabel("2ª Nota: ");
			n3 = new JLabel("3ª Nota: ");
			n4 = new JLabel("4ª Nota: ");
			res = new JLabel("");
			txt1 = new JTextField(2);
			txt2 = new JTextField(2);
			txt3 = new JTextField(2);
			txt4 = new JTextField(2);
			media = new JButton("Media");
			
			n1.setBounds(10,10,100,20);
			n2.setBounds(250,10,100,20);
			n3.setBounds(10,40,100,20);
			n4.setBounds(250,40,100,20);
			txt1.setBounds(90,10,100,20);
			txt2.setBounds(330,10,100,20);
			txt3.setBounds(90,40,100,20);
			txt4.setBounds(330,40,100,20);
			media.setBounds(180,100,100,30);
			res.setBounds(10,150,200,20);
			
			media.addActionListener(
					new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					int n1,n2,n3,n4,media;
					media=0;
						
					n1= Integer.parseInt(txt1.getText());
					n2= Integer.parseInt(txt2.getText());
					n3= Integer.parseInt(txt3.getText());
					n4= Integer.parseInt(txt4.getText());
					media = (n1 + n2 + n3 + n4)/4;
					res.setVisible(true);
					res.setText("A média do aluno é: " +media);
						}
					}
						
				);
			
			tela.add(n1);
			tela.add(n2);
			tela.add(n3);
			tela.add(n4);
			tela.add(res);
			tela.add(txt1);
			tela.add(txt2);
			tela.add(txt3);
			tela.add(txt4);
			tela.add(media);
			
			setSize(500,300);
			setVisible(true);
	}
	
	public static void main(String args[]) {
		Media app = new Media();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
