package javaExsTpa;
import java.util.*;
public class Interseccao {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[]a = new int[10];
		int[]b = new int[10];
		int contadorI = 0;
		for(int i =0 ; i<10 ; i++) {
			int j = i+1;
			System.out.println("digite o "+j+"º numero de A");
			a[i] = in.nextInt();
		}
		System.out.println("--------------------");
		for(int i =0 ; i<10 ; i++) {
			int j = i+1;
			System.out.println("digite o "+j+"º numero de B");
			b[i] = in.nextInt();
		}
		for(int i =0 ;i<10 ; i++) {
			for(int j = 0;j<10;j++) {
				if(b[i] == a[j]) {
					contadorI +=1;
					break;
				}
			}
		}
		int[]c = new int[contadorI];
		int p = 0;
		for(int i =0 ;i<contadorI ; i++) {
			for(int j = 0;j<10;j++) {
				if(b[i] == a[j]) {
					c[p] = b[i];
					p++;
				}
			}
		}
		for(int i = 0;i<contadorI ;i++) {
			System.out.println("O número "+c[i]+" é presente na lista A e na lista B");
		}
	}
}
