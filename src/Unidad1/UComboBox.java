package Unidad1;

import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class UComboBox extends JFrame implements ItemListener
{
	private JLabel selecciona,imagen;
	private JComboBox seleccion;
	
	public UComboBox()
	{
		super("Usando Combo Box");
		setSize(400,300);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		selecciona=new JLabel("Selecciona");
		imagen=new JLabel();
		String[] animalitos ={"bird","gato","dog","pig","rabbit"};
		
		seleccion=new JComboBox(animalitos);
		seleccion.addItemListener(this);
		
		add(selecciona);
		add(seleccion);
		add(imagen);
		setVisible(true);
	}

	public static void main(String[] args)
{
		// TODO Auto-generated method stub

		UComboBox ventana=new UComboBox();
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) 
	{
		if(e.getSource()==seleccion)
		{
			Image image=Toolkit.getDefaultToolkit().getImage(seleccion.getSelectedItem().toString()+".png");
			Icon icono=new ImageIcon(image);
			imagen.setIcon(icono);
		}
		
	}

}
