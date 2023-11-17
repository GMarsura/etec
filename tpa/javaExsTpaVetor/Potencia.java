package javaExsTpa;

public class Potencia {
	public static void main(String[] args) {
		int[]a = new int[11];
		int base = 2;
		for(int i=0 ; i<11 ; i++) {
			if(i == 0) {
				System.out.println(base+" ^ "+i+" = "+1);
				continue;
			}
			a[i] = elevar(base , i);
			System.out.println(base+" ^ "+i+" = "+a[i]);
		}
	}
	public static int elevar(int base,int exp) {
		int base2 = base;
		for(int i = 1; i<exp ; i++) {
			base *= base2;
		}
		return base;
	}
	
	
	
}
