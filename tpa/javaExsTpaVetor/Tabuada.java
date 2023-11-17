package javaExsTpa;

public class Tabuada {
	public static void main(String[] args) {
		int[] a = new int[5];
		for(int i =0; i<5 ; i++) {
			a[i] = i+1;
			for(int p=1; p<11;p++) {
				int resp = a[i] * p;
				System.out.println(a[i]+"X"+p+"="+resp);
			}
		}
	}
}
