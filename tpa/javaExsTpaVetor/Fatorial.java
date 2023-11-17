package javaExsTpa;

public class Fatorial {
	public static void main(String[] args) {
		int[] a = new int [16];
		int[] b = new int [16];
		
		for(int i=0; i<16 ; i +=1) {
			a[i] = i;
			if(i < 2) {
				b[i] = 1;
				continue;
			}
			
			int p = 1;
            for (int k = 2; k <= a[i]; k++) {
                p *= k;
            }
            b[i] = p;
		}
		
		for(int j = 0; j<16  ; j +=1) {
			System.out.print(a[j]+"    fatorial: ");
			System.out.println(b[j]);
		}
	}
}
