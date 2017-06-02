package Unidad1;
//se importan los paquetes que se van a usar en esta clase(la mayoria son elementos visuales)
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.tools.Tool;
//creacion de la clase y se extiende a la clase JFrame y se le agrega los implementos 
public class usuarioagregaJFrame extends JFrame implements ActionListener {

	//declaracion de las variables dependiendo de su tipo
	private JPanel contentpane;
	private JTextField email,nombre;
	private JPasswordField pass;
	private JComboBox favorito;
	private JLabel imagen;
	private JButton btnimagen,agregar,cancelar;
	
	public usuarioagregaJFrame()
	{
		//creacion de la ventana, nombre de esta, accion al cerrar la ventana, dimenciones de donde colocar los objetos
		
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setTitle("agregar usuario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100,450,300);
		contentpane=new JPanel();
		contentpane.setBackground(new Color(255,175,175));
		contentpane.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(contentpane);
		contentpane.setLayout(null);
		
		//colocacion de la imagen superior
		Image im=Toolkit.getDefaultToolkit().getImage("icono.png");
		setIconImage(im);
		Icon ic=new ImageIcon("logg.png");
		
		//se crea el objeto del banner se le da las coordenadas donde ira y se le asignan sus coordenadas
		JLabel banner=new JLabel();
		banner.setBounds(361,22,600,150);
		banner.setIcon(ic);
		contentpane.add(banner);
		
		//creacion de label donde se muestra la imagen, se agrega las coordenadas donde se agrega en la ventana y se añade
		imagen=new JLabel("new label");
		imagen.setBounds(43,174,300,300);
		contentpane.add(imagen);
		
		//creacion del boton se le da las coordenadas de ubicacion y se agrega
		btnimagen = new JButton("seleccionar imagen");
		btnimagen.setFont(new Font("tahoma",Font.PLAIN,16));
		btnimagen.setBounds(132,516,200,23);
		contentpane.add(btnimagen);
		
		//se crea el boton agregar, se le da las coordenadas de localizacion y se agega
		agregar=new JButton("agregar");
		agregar.setFont(new Font("Tahoma",Font.PLAIN,16));
		agregar.setBounds(505,516,118,23);
		contentpane.add(agregar);
		
		//se crea el boton cancelar, se les da las coordenadas de hubicacion y se agrega a la ventana
		cancelar=new JButton("cancelar");
		cancelar.setFont(new Font("Tahoma",Font.PLAIN,16));
		cancelar.setBounds(633,516,118,23);
		contentpane.add(cancelar);
		
		//se crea una nueva ventana donde se le agrega el nombre de usuario, el color de la ventana, y las dimenciones
		JLabel ventana=new JLabel("agregar usuario");
		ventana.setForeground(new Color(85,107,47));
		ventana.setFont(new Font("tahoma",Font.PLAIN,50));
		ventana.setBounds(907,473,396,80);
		contentpane.add(ventana);
		
		//se agrega un nuevo panel con las coordenadas espeficicas
		JPanel panel=new JPanel();
		panel.setBounds(430,219,531,255);
		contentpane.add(panel);
		panel.setLayout(null);
		
		//se agrega un nuevo label email, se le asignan las coordenadas y se agrega a la ventana panel
		JLabel label=new JLabel("email");
		label.setBounds(36,36,44,20);
		label.setFont(new Font("Tahoma",Font.PLAIN,16));
		panel.add(label);
		
		//se agrega el textfield en las coordenadas espeficicas y se le agregan columnas, se agrega en la pantalla panel
		email=new JTextField();
		email.setBounds(121,33,268,26);
		email.setFont(new Font("tahoma",Font.PLAIN,16));
		email.setColumns(10);
		panel.add(email);
		
		//se crea un textfield,se le dan las coordenadas, se le da estilo a la letra y numero, y se agrega
		nombre=new JTextField();
		nombre.setBounds(121,83,375,26);
		nombre.setFont(new Font("tahoma",Font.PLAIN,16));
		nombre.setColumns(10);
		panel.add(nombre);
		
		//se agrega un label y se le asigna el nombre, las coordenadas el tipo y numero de letra y se agrega a la pantalla
		JLabel label2=new JLabel("password");
		label2.setBounds(36,136,73,20);
		label2.setFont(new Font("Tahoma",Font.PLAIN,16));
		panel.add(label2);
		
		//se agrega un passowrdfield(para contraseñas) se le da las coordenadas, el tipo y numero de letra y se agrega a la pantalla panel
		pass=new JPasswordField();
		pass.setBounds(121,133,218,26);
		pass.setFont(new Font("Tahoma",Font.PLAIN,16));
		panel.add(pass);
		
		//se crea un label, se le asignan las coordenadas se le asigna el tipo y numero de letra y se agrega a la pantalla panel
		JLabel label1=new JLabel("nombre");
		label1.setBounds(36,86,63,20);
		label1.setFont(new Font("Tahoma",Font.PLAIN,16));
		panel.add(label1);
		
		//se crea un lavel se le da coordenadas, el tamaño y tipo de letra y se le agrega a la pantalla panel
		JLabel label3=new JLabel("favorito");
		label3.setBounds(36,184,63,20);
		label3.setFont(new Font("Tahoma",Font.PLAIN,16));
		panel.add(label3);
		
		//se crea un combobox, se le da las coordenadas, el tipo y numero de letra y se agrega a la pantalla panel
		favorito=new JComboBox();
		favorito.setBounds(121,181,218,26);
		favorito.setFont(new Font("tahoma",Font.PLAIN,16));
		panel.add(favorito);
		
		//pantalla visible siempre
		setVisible(true);
	}
	
	//metodo main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
    SwingUtilities.invokeLater(new Runnable(){
    	public void run()
    	{
    		usuarioagregaJFrame ventana=new usuarioagregaJFrame();
    	}
    });
    
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		
	}

}
