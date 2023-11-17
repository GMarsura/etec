package javaExsTpa;
import java.util.*;
public class Inversão {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] a = new int [10];
		int[] b = new int[10];
		for(int i = 0,p=9;i<10;i++,p--) {
			System.out.println("entre com um numero");
			a[i] = in.nextInt();
			b[p] = a[i];
		}
		for(int i = 0; i<10 ; i++) {
			System.out.println("A = "+a[i]+"       B="+b[i]);
		}
	}
}
