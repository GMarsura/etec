package javaExsTpa;
import java.util.Scanner;
public class Busca {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[]a = new int[10];
		int respFinal = 0;
		boolean achado = false;
		for(int i = 0;i<10 ; i++) {
			int v = i+1;
			System.out.println("digite o "+v+"� numero");
			a[i] = in.nextInt();
		}
		System.out.println("Agora, digite o numero q deseja fazer a busca!");
		int busca = in.nextInt();
		
		for(int i = 0;i<10 ; i++) {
			if(a[i] == busca) {
				respFinal = a[i];
				achado = true;
				break;
			}
		}
		if(achado == true) {
			System.out.println("O numero solicitado est� na lista");
		}else {
			System.out.println("O numero citado n�o esta na lista");
		}
	}
}
