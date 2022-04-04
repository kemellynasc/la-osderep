package kekaproject;

import java.util.Scanner;

public class whilesegundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner entrada = new Scanner (System.in);
		int idade=0, menos=0, mais=0 ;
		
		
		while(idade!=-99) {
			System.out.printf("\n digite sua idade:");
			idade = entrada.nextInt();
			
			if (idade>0 && idade<=21){
			menos++; }
			
			if(idade>=50){
			mais++; }
			
	
		
		}
		
		System.out.printf("\n total de pessoas com menos de 21 anos:"+ menos);
		System.out.printf("\n total de pessoas com mais de 50 anos:"+ mais);
		}
		
	
}

