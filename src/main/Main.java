package main;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		// Obtener  la cantidad de elementos mayores a 10
		List<Integer> numeros = List.of(18,6,4,15, 55,78,12,9,8);
		
		//Imperativo
		int contador =0;
		for(int numero: numeros) {
			if(numero > 10) {
				contador ++;
			}
		}
		System.out.println(contador);
		
		
		//Declarativo
		Long resultado = numeros.stream().filter(n ->n >10).count();
		System.out.println(resultado);
	}

}
