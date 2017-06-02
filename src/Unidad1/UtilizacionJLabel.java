package Unidad1;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class UtilizacionJLabel extends JFrame
{
    
	private Container contents;
	private JLabel labeltext;
	private JLabel labelimage;
	public UtilizacionJLabel()
	{
		super();
		contents = getContentPane();
		setLayout(new FlowLayout());
		labeltext=new JLabel("sushi tonight?");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		labeltext.setForeground(java.awt.Color.WHITE);
		labeltext.setBackground(java.awt.Color.BLUE);
		labeltext.setOpaque(true);
		
		labelimage=new JLabel (new ImageIcon("a.png"));
	    
		labelimage.setToolTipText("te jakie");
		
		contents.add(labeltext);
		contents.add(labelimage);
		setSize(300,200);
		setVisible(true);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		UtilizacionJLabel l=new UtilizacionJLabel();
		
	}
	

}
