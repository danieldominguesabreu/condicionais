package condicionais;

import java.awt.Container;
import java.util.Scanner;

public class LogicaCondicional {

	public static void main(String[] args) {
		
		//V�riaveis 
		int idade ;
		String email;
		
		//Scanner que ser� usado para capturar o que o usu�rio digitou
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe sua idade: ");
		idade = sc.nextInt();
	    
		//Verificar se o usu�rio � maior ou menor de idade 
		if (idade >= 18) {
			System.out.println("\nVoce � maior de idade!");
		} else { 
			System.out.println("\nVoce � menor de idade!");
		}
		
		//Verificar se a idade � par ou impar
		if (idade % 2 == 0 ) {
			System.out.println("\nSua idade (" + idade + " anos), � par! ");
		} else {
			System.out.println("\nSua idade � impar! ");
		}
		
		//Pedir e-mail do usu�rio
		System.out.print("\nDigite seu e-mail: ");
		email = sc.next();
		
		//Verificar se o e-mail � v�lido 
		if (email.contains("@")) {
			System.out.print("\nSeu e-mail � valido!");
		} else {
			System.out.print("\nSeu e-mail � inv�lido!");
			
		}
		
				
			
	}

}
