package es.Studium.LetrasNumeros;

import java.util.Scanner;

public class LetrasNumeros3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creamos el objeto que nos permite leer por teclados
		java.util.Scanner teclado = new Scanner(System.in);
				
		//repetimos todo mientras no introduzcamos por teclado *
		for(char letra='0'; letra != '*';) 
		{
			//Imprimimos por pantalla al cliente
			System.out.println("Indique una letra o pulse * para salir:");
			//pedimos un Caracter por teclado .CharAt (0)Nos permite cojer solo 1 caracter
			letra = teclado.next().charAt(0);
			//Ponemos los casos para indicar el numero
			switch (letra)
			{
				case '*':
					System.out.println("Saliendo del programa");
					break;
				case 'a':
					System.out.println("La letra "+ letra + " es el numero 1");
					break;
				case 'b':
					System.out.println("La letra "+ letra + " es el numero 2");
					break;	
				case 'c':
					System.out.println("La letra "+ letra + " es el numero 3");
					break;
				case 'd':
					System.out.println("La letra "+ letra + " es el numero 4");
					break;
				case 'e':
					System.out.println("La letra "+ letra + " es el numero 5");
					break;
				case 'f':
					System.out.println("La letra "+ letra + " es el numero 6");
					break;	
				case 'g':
					System.out.println("La letra "+ letra + " es el numero 7");
					break;
				case 'h':
					System.out.println("La letra "+ letra + " es el numero 8");
					break;
				case 'i':
					System.out.println("La letra "+ letra + " es el numero 9");
					break;
				case 'j':
					System.out.println("La letra "+ letra + " es el numero 10");
					break;	
				case 'k':
					System.out.println("La letra "+ letra + " es el numero 11");
					break;
				case 'l':
					System.out.println("La letra "+ letra + " es el numero 12");
					break;
				case 'm':
					System.out.println("La letra "+ letra + " es el numero 13");
					break;
				case 'n':
					System.out.println("La letra "+ letra + " es el numero 14");
					break;
				case 'ñ':
					System.out.println("La letra "+ letra + " es el numero 15");
					break;
				case 'o':
					System.out.println("La letra "+ letra + " es el numero 16");
					break;
				case 'p':
					System.out.println("La letra "+ letra + " es el numero 17");
					break;
				case 'q':
					System.out.println("La letra "+ letra + " es el numero 18");
					break;
				case 'r':
					System.out.println("La letra "+ letra + " es el numero 19");
					break;	
				case 's':
					System.out.println("La letra "+ letra + " es el numero 20");
					break;
				case 't':
					System.out.println("La letra "+ letra + " es el numero 21");
					break;
				case 'u':
					System.out.println("La letra "+ letra + " es el numero 22");
					break;
				case 'v':
					System.out.println("La letra "+ letra + " es el numero 23");
					break;
				case 'w':
					System.out.println("La letra "+ letra + " es el numero 24");
					break;	
				case 'x':
					System.out.println("La letra "+ letra + " es el numero 25");
					break;
				case 'y':
					System.out.println("La letra "+ letra + " es el numero 26");
					break;
				case 'z':
					System.out.println("La letra "+ letra + " es el numero 27");
					break;
				//ponemos que si se mete cualquier caracter que no este en los casos, de error y salga del programa
				default:
					System.out.println("Error ha introducido un caracter no valido. Saliendo del programa");
					letra='*';
					teclado.close(); //cerramos teclado
			}
		}
	}

}
