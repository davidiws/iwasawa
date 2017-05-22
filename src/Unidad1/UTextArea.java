package Unidad1;

import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class UTextArea extends JFrame implements ActionListener
{
	 
    private JLabel producto,descripcion,mensaje;
    private JTextField nombreproducto;
    private JTextArea descripcionarea;
    private JButton aceptar;
    private JScrollPane scrol;
	
	public UTextArea()
	{
		super("Usando Text Area");
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		Image i= Toolkit.getDefaultToolkit().getImage("");
		setIconImage(i);
		
		producto=new JLabel("Nombre del producto");
		descripcion=new JLabel("Descripcion del producto");
		scrol=new JScrollPane(descripcionarea);
		mensaje=new JLabel();
		
		nombreproducto=new JTextField(20);
		descripcionarea=new JTextArea(7,20);
		
		aceptar=new JButton("Aceptar");
		aceptar.addActionListener(this);
		
		add(producto);
		add(nombreproducto);
		add(descripcion);
		add(mensaje);
		add(descripcionarea);
		add(scrol);
		add(aceptar);
		setVisible(true);
	}
	
	
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
        UTextArea l=new UTextArea();
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==aceptar)
		{
			//mensaje.setText(descripcionarea.getSelectedText());
			//descripcionarea.insert(nombreproducto.getText(),0);
			descripcionarea.replaceRange(nombreproducto.getText(),3,7);
		}
	}

}
