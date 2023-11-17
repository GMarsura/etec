package javaExsTpa;
import java.util.Arrays;
import java.util.Scanner;
public class Ordem {
	public static void main(String[] args) {
		int[]a = new int[10];
		int[]b = new int[10];
		Scanner in = new Scanner(System.in);
		
		for(int i = 0; i<10 ; i++) {
			System.out.println("Insira o valor");
			a[i] = in.nextInt();
		}
		//Ops, será que pode?
		Arrays.sort(a);
		
		for(int i = 0;i<10;i++) {
			b[i] = a[i];
			System.out.println(b[i]);
		}
	}
}
