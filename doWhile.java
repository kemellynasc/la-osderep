package kekaproject;

import java.util.Scanner;

public class doWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero,somaMult3=0,contMult3=0;
		float media;
		Scanner leia = new Scanner(System.in);
		do 
		{
			System.out.println("\n Entre com um n�mero:");
			numero = leia.nextInt();
			if(numero==0)
			{
				System.out.println("\nVoc� digitou zero, vamos finalizar!");
		     }
			else  if(numero%3==0)
			{ 
				somaMult3+=numero;
				contMult3++;
			}
		
		
		}
            while(numero!=0);
		    media= somaMult3/ contMult3;
		    System.out.println("\nMedia:"+ media);
	}

}
