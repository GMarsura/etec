package javaExsTpa;

public class ParesImpar {
	public static void main(String[] args) {
		int[] a = new int[20];
		int[] b = new int[20];
		int p=0,j=10;
		for(int i = 0; i<20 ; i++) {
			a[i] = i+1;
			if(a[i]%2 != 0) {
				b[p] = a[i];
				p++;
			}else {
				b[j] = a[i];
				j++;
			}
		}
		for(int i = 0;i<20;i++) {
			if(i < 10) {
				System.out.println("Os numero impares citados são "+b[i]);
				continue;
			}
			
			System.out.println("Os numero pares citados são "+b[i]);
		}
		
}
}
