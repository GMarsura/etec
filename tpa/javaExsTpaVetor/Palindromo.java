package javaExsTpa;
import java.util.Scanner;
public class Palindromo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[]a = new int[10];
		int[]b = new int[5];
		for(int i = 0;i<10;i++) {
			int v = i+1;
			System.out.println("Digite o "+v+"º numero");
			a[i] = in.nextInt();
		}
		for(int i = 0,j = 9; i<5 ; i++, j--) {
			b[i] = a[j];
		}
		int pali = 0;
		for(int i = 0;i<5 ;i++) {
			if(b[i] == a[i]) {
				pali +=1;
			}
		}
		System.out.println(pali);
		if(pali == 5) {
			System.out.println("Os numero citados formam um numero Palindromo");
		}else {
			System.out.println("Os numero citados não formam um numero Palindromo");
		}
	}
}
