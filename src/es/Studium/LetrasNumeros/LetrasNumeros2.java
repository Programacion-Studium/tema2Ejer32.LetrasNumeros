package es.Studium.LetrasNumeros;

import java.util.Scanner;

public class LetrasNumeros2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creamos el objeto que nos permite leer por teclados
		java.util.Scanner teclado = new Scanner(System.in);
		
		
		for(char letra='0'; letra != '*';) 
		{
			//Imprimimos por pantalla al cliente
			System.out.println("Indique una letra o pulse * para salir:");
			//pedimos un Caracter por teclado .CharAt (0)Nos permite cojer solo 1 caracter
			letra = teclado.next().charAt(0);
			int asciiValue =(int)letra; //convierto la letra a numero
			if(letra=='*')
			{
				System.out.println("Saliendo del programa");
			}
			else
			{
			System.out.println("La letra indicada corresponde a "+(asciiValue-96));
			}
		}
		teclado.close();
	}
}
