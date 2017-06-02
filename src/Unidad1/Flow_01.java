package Unidad1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Flow_01 extends JFrame
{
 
	private JButton boton1,boton2,boton3,boton4,boton5;
	public Flow_01()
	{
		super("Ventana con flowLayout");
		setLayout(new FlowLayout());
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		boton1=new JButton("Boton 1");//creacion de boton objeto
		boton2=new JButton("boton 2");
		boton3=new JButton("Boton 3");
		boton4=new JButton("Boton 4");
		boton5=new JButton("boton 5");
		
		add(boton1);
		add(boton2);
		add(boton3);
		add(boton4);
		add(boton5);
		
		setVisible(true);
		
	}
	
	
	
	
	
	
	public static void main(String[] args)
	{
		Flow_01 ventara=new Flow_01();

	}

}
