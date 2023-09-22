package javaProject001;
import java.time.LocalDate;
import java.util.*;
public class MaisVelhoNovo {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int anoNasc, anoIdade = 1, anoAtual, maisVelho =1, maisNovo = 10000000;
		String nomeV  , nomeN;
		
		anoAtual = LocalDate.now().getYear();
		
		for(int i = 1; i<4 ; i+=1) {
			
			System.out.println("em que ano vc nasceu?");
			anoNasc = in.nextInt();
			
			while(anoNasc > anoAtual) {
				System.out.println("data invalida, vc não pode ter nascido depois de"+anoAtual+" tente novamente!!");
				System.out.println("em que ano vc nasceu?");
				anoNasc = in.nextInt();
			}
			
			
			anoIdade = anoAtual - anoNasc;	
			System.out.println("você tem "+anoIdade+" anos de Idade");
			
			
			if(maisNovo>anoIdade) {
				 maisNovo = anoIdade;
				
			}
			if(maisVelho < anoIdade) {
				maisVelho = anoIdade;
				
			}
		}
		System.out.println("O mais velho tem "+maisVelho+" anos de idade");
		System.out.println("O mais novo tem "+maisNovo+" anos de idade");
		
		
	}
}
