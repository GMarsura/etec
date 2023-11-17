package javaExsTpa;
import java.util.Scanner;
public class Palindromo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[]a = new int[10];
		
		for(int i = 0;i<10;i++) {
			int v = i+1;
			System.out.println("Digite o "+v+"º numero");
			a[i] = in.nextInt();
		}
		int pali = 0;
		for(int i = 0,p = 9;i<5 ;i++,p--) {
			if(b[i] == a[p]) {
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
