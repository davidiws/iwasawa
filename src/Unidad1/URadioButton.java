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

	private JLabel ccolor;
	private JRadioButton jrbrojo,jrbazul,jrbverde;
	
	public URadioButton()
	{
		super("usando radio button");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		ccolor=new JLabel("watch my background");
		ccolor.setOpaque(true);
		jrbrojo=new JRadioButton("Rojo", true);
		jrbazul=new JRadioButton("Azul");
		jrbverde=new JRadioButton("Verde");
		
		jrbrojo.addItemListener(this);
		jrbazul.addItemListener(this);
		jrbverde.addItemListener(this);
	
		ButtonGroup bg=new ButtonGroup();
		
		add(ccolor);
		add(jrbrojo);
		add(jrbazul);
		add(jrbverde);
		
		bg.add(jrbrojo);
		bg.add(jrbazul);
		bg.add(jrbverde);
		
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
		
	}
}
