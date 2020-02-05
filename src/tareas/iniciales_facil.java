package tareas;
import java.util.Scanner;

public class iniciales_facil 
{

	public static void main(String[] args) 
	{
		int x;
		String nombre;
		Scanner n = new Scanner (System.in);
		/////////////////////////////////////
		System.out.println("Ingresa tu Nombre Completo: ");
		nombre = n.nextLine();
		x = nombre.length();
		for(int i = 0; i<x; i++)
		{
			if(nombre.charAt(i) >= 'A' && nombre.charAt(i) <= 'Z')
			{
				System.out.println(nombre.charAt(i));
			}
		}
		
		for(int i = 0; i<x; i++)
		{
			nombre.split(nombre);
			if(nombre.charAt(i) >= 'A' && nombre.charAt(i) <= 'Z')
			{
				System.out.println(nombre.charAt(i));
			}
		}
	}
}