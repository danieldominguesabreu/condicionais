package condicionais;

import java.awt.Container;
import java.util.Scanner;

public class LogicaCondicional {

	public static void main(String[] args) {
		
		//Váriaveis 
		int idade ;
		String email;
		
		//Scanner que será usado para capturar o que o usuário digitou
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe sua idade: ");
		idade = sc.nextInt();
	    
		//Verificar se o usuário é maior ou menor de idade 
		if (idade >= 18) {
			System.out.println("\nVoce é maior de idade!");
		} else { 
			System.out.println("\nVoce é menor de idade!");
		}
		
		//Verificar se a idade é par ou impar
		if (idade % 2 == 0 ) {
			System.out.println("\nSua idade (" + idade + " anos), é par! ");
		} else {
			System.out.println("\nSua idade é impar! ");
		}
		
		//Pedir e-mail do usuário
		System.out.print("\nDigite seu e-mail: ");
		email = sc.next();
		
		//Verificar se o e-mail é válido 
		if (email.contains("@")) {
			System.out.print("\nSeu e-mail é valido!");
		} else {
			System.out.print("\nSeu e-mail é inválido!");
			
		}
		
				
			
	}

}
