package Unidad1;
import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class EncriptaDesencripta 
{

	public String encripta(String valor)
	{
		String respuesta=null;
		try {
			respuesta=Base64.getEncoder().encodeToString(valor.getBytes("utf-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return respuesta;
	}
	public String desencripta(String valor)
	{
	    String respuesta=null;
	    try {
			respuesta=new String(Base64.getDecoder().decode(valor),"utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
		return respuesta;
	}
}
