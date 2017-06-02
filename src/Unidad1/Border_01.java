package Unidad1;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Border_01 extends JFrame
{

	private JButton boton1,boton2,boton3,boton4,boton5;
	
	public Border_01()
	{
		super("Ventana que utiliza un Border Layout");//nombre ventana
		setLayout(new BorderLayout());//crear ventana
		setSize(300,200);//tamaño ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//accion al cerrar ventana boton cerrar
		boton1=new JButton("Boton 1");//creacion de boton objeto
		boton2=new JButton("boton 2");
		boton3=new JButton("Boton 3");
		boton4=new JButton("Boton 4");
		boton5=new JButton("boton 5");

		add(boton1,BorderLayout.NORTH);//se añade el boton o objeto en lugar especifico
		add(boton2,BorderLayout.SOUTH);
		add(boton3,BorderLayout.CENTER);
		add(boton4,BorderLayout.EAST);
		add(boton5,BorderLayout.WEST);
		
		setVisible(true);//hacer visible la ventana
		
		
	}
	public static void main(String[]args)
	{
		Border_01 ventana=new Border_01();
		
	}
	
}
