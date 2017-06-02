package Unidad1;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class URadioButton extends JFrame implements ItemListener
{

	private JLabel ccolor,x2;
	private JRadioButton jrbrojo,jrbazul,jrbverde,rojo,azul,verde;
	
	public URadioButton()
	{
		super("usando radio button");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		ccolor=new JLabel("watch my background");
		ccolor.setOpaque(true);
		x2=new JLabel("color");
		x2.setOpaque(true);
		jrbrojo=new JRadioButton("Rojo", true);
		jrbazul=new JRadioButton("Azul");
		jrbverde=new JRadioButton("Verde");
		rojo=new JRadioButton("Rojo", true);
		azul=new JRadioButton("Azul");
		verde=new JRadioButton("Verde");
		
		jrbrojo.addItemListener(this);
		jrbazul.addItemListener(this);
		jrbverde.addItemListener(this);
		rojo.addItemListener(this);
		azul.addItemListener(this);
		verde.addItemListener(this);
	
		ButtonGroup bg=new ButtonGroup();
		ButtonGroup b=new ButtonGroup();
		
		add(ccolor);
		add(jrbrojo);
		add(jrbazul);
		add(jrbverde);
		add(x2);
		add(rojo);
		add(azul);
		add(verde);
		
		bg.add(jrbrojo);
		bg.add(jrbazul);
		bg.add(jrbverde);
		b.add(rojo);
		b.add(azul);
		b.add(verde);
		
		setVisible(true);
	}
	
	
	public static void main(String[]args)
	{
	URadioButton ventana=new URadioButton();	
	}


	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==jrbrojo)
		{
			ccolor.setBackground(Color.RED);
		}else if(e.getSource()==jrbazul)
		{
			ccolor.setBackground(Color.BLUE);
		}else if(e.getSource()==jrbverde)
		{
			ccolor.setBackground(Color.GREEN);
		}
		
		if(e.getSource()==rojo)
			{
			x2.setForeground(Color.RED);
			}else if(e.getSource()==verde)
			{
				x2.setForeground(Color.GREEN);
			}else if(e.getSource()==azul)
			{
				x2.setForeground(Color.BLUE);
			}
		
	}
}
