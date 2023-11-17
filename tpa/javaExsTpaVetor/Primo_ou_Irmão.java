package javaExsTpa;

public class Primo_ou_Irmão {
	public static void main(String[] args) {
		int[]a = new int[10];
		for(int i =0; i< 10 ;i++) {
			a[i] = i;
			boolean v = verificarPrimo(a[i]);
			if(i<3) {
				v = true;
			}
			if(v == true) {
				System.out.println("O numero "+a[i]+" é primo!");
			}else {
				System.out.println("O numero "+a[i]+" não é primo!");
			}
		}
	}
	public static boolean verificarPrimo(int n) {
		boolean primo = false;
		for(int i = 2; i< n ; i++) {
			if(n%i == 0) {
				primo = false;
				break;
			}
			else {
				primo = true;
			}
		}
		return primo;
	}
}
