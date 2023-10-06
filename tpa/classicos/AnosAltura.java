package classicos;
import java.util.*;
public class AnosAltura {
public static void main(String[] args) {

	while(perguntar().equalsIgnoreCase("sim")) {

	}

	System.out.println("perfeitamente");

}
public static String perguntar() {
	Scanner in = new Scanner(System.in);
	String sexo, resposta;
	double pesoIdeal, altura;
	boolean sexoF;


	System.out.println("Qual � seu sexo?");
	sexo = in.next();
	sexoF = sexo.equalsIgnoreCase("feminino") || sexo.equalsIgnoreCase("femia") || sexo.equalsIgnoreCase("feminina") || sexo.equalsIgnoreCase("mulher") || sexo.equalsIgnoreCase("manina") || sexo.equalsIgnoreCase("f"); 

	if(sexoF) {
		System.out.println("Qual � a sua altura?");
		altura = in.nextDouble();
		pesoIdeal = 52 + (67 *(altura - 152.4));
	}else {
		System.out.println("Qual � a sua altura?");
		altura = in.nextDouble();
		pesoIdeal = 52 + (75 *(altura - 152.4));
	}
	System.out.println("O peso em que vc deveria estar de acordo com a sua altura � +/- "+pesoIdeal);

	System.out.println("quer refazer o progama ?");
	resposta = in.next();
	return resposta;
}
}
