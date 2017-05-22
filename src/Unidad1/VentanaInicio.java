package Unidad1;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class VentanaInicio extends JFrame implements ActionListener
{

	private JLabel lbl_usuario,lbl_contra,lbl_mensaje;
	private JTextField tf_usuario;
	private JPasswordField contraseña;
	private JButton btn_aceptar;
	private Icon b=new ImageIcon("feliz.jpg");
	private Icon t=new ImageIcon("xd.png");
	private Icon i=new ImageIcon("as.jpg");
	
	public VentanaInicio(int ancho, int alto)
	{
		super("Ingresa tus datos");
		setLayout(new FlowLayout());
		setSize(ancho,alto);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//controles
		lbl_usuario=new JLabel("nombre de usuario");
		lbl_contra=new JLabel("contraseña");
		
		tf_usuario=new JTextField(20);
		contraseña=new JPasswordField(20);
		lbl_mensaje=new JLabel(i);
		btn_aceptar=new JButton("Aceptar");
		btn_aceptar.addActionListener(this);
		
		add(lbl_usuario);
        add(lbl_contra);
        add(tf_usuario);
        add(contraseña);
        add(btn_aceptar);
        add(lbl_mensaje);
		
		setVisible(true);
		
		
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		VentanaInicio l=new VentanaInicio(300,200);
	}

	@Override
	public void actionPerformed(ActionEvent e) //eventos
	{
		// TODO Auto-generated method stub
		if(e.getSource()==btn_aceptar)
		{
			String usuario=tf_usuario.getText();
			String p=String.valueOf(contraseña.getPassword());
			if(usuario.equals("a") && p.equals("a"))
			{
				lbl_mensaje.setIcon(b);
				
			}else{
				lbl_mensaje.setIcon(t);
			}
			tf_usuario.setText("");
			contraseña.setText("");
		}
		
	}

}
