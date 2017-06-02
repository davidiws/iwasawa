package Unidad1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Simplemath extends JFrame implements ActionListener
{

	public JButton cuadrado,cubico;
	public JTextField num1,num2;
	public JLabel res,exp;
	
    public Simplemath()
    {
    	super("Raiz");
    	setSize(300,100);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setLayout(new FlowLayout());
    	
    	cuadrado=new JButton("calcular");
    	cubico=new JButton("cubico");
    	num1=new JTextField(10);
    	num2=new JTextField(10);
    	res=new JLabel("Resultado: ");
    	exp=new JLabel();
    	
    	cuadrado.addActionListener(this);
    	cubico.addActionListener(this);
    	
    	add(num1);
    	add(cuadrado);
    	add(cubico);
    	add(res);
    	add(exp);
    	
    	
    	
    	setVisible(true);
    	
    	
    }
	public static void main(String[]args)
	{
		Simplemath l=new Simplemath();
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		double a,res=0;
	
		String r="";
		// TODO Auto-generated method stub
		if(e.getSource()==cuadrado)
		{
			a=Double.parseDouble(num1.getText());
			a=Math.sqrt(res);
			
			
			
		}else{
			a=Double.parseDouble(num1.getText());
			a=Math.cbrt(res);
		
		}
	
	}

}
