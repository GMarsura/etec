package javaExsTpa;
import java.util.*;
public class Media {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[]a = new int[10];
		int c = 0;
		for(int i = 0; i<10;i++) {
			System.out.println("entre com um numero  "+(i+1));
			a[i] = in.nextInt();
			c += a[i];
		}
		int media = c/10;
		System.out.println("A media dos numeros igitados por vc é  "+media);
	}
}
