package Unidad1;

import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class HelloWorld extends JFrame implements ActionListener
{

	private JLabel etiqueta;
	private JButton boton1;
	
	public HelloWorld()
	{
		super("Hellow World");
		setSize(300,200);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Image im= Toolkit.getDefaultToolkit().getImage("logo.ico");
        setIconImage(im);
        Icon ic=new ImageIcon("icono.png");
		
		etiqueta=new JLabel(ic);
		boton1=new JButton("Aceptar");
		boton1.addActionListener(this);
		//etiqueta.setText("Hellow World");
		add(boton1);
		add(etiqueta);
		
		
		add(etiqueta);
		add(boton1);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HelloWorld ventana=new HelloWorld();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		etiqueta.setText("David Rodriguez");
		
	}

}
