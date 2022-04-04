package main;

public class Inicio {

	public static void main(String[] args) {
		// El compilador infiere el tipo de los parametros
		// a la derecha va expresión lambdas
		//Podemos modificar el nombre de los parametros
		//Siempre que tengamos un solo parametro podemos omitir el uso de parentesis 
		//Siempre que se ejecute una unica sentencia podemos omitir el uso de llaves
		
		ISaludar saludar = nombre -> System.out.println("Hola Mundo " + nombre);
		saludar.Saludo("Codi");
	}

}
