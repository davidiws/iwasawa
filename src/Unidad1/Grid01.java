package Unidad1;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Grid01 extends JFrame
{

	private JButton boton1,boton2,boton3,boton4,boton5;
	public Grid01()
	{
		
		super("Ventana con grid");
		setLayout(new GridLayout());
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		boton1=new JButton("Boton 1");
		boton2=new JButton("boton 2");
		boton3=new JButton("Boton 3");
		boton4=new JButton("Boton 4");
		boton5=new JButton("boton 5");
		
		add(boton1);
		add(boton2);
		add(boton3);
		add(boton4);
		add(boton5);
		setLayout (new GridLayout(3,0));
		
		setVisible(true);
		
	}
	
	public static void main(String[]args)
	{
		Grid01 ventana=new Grid01();
	}
}
