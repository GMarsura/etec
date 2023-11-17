package javaExsTpa;

import java.util.Scanner;

public class Diferença {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[10];
        int[] b = new int[10];
        int tamanhoVetor = 10;
        int contadorI = 0;

        for (int i = 0; i < tamanhoVetor; i++) {
            int j = i + 1;
            System.out.println("Digite o " + j + "º número de A");
            a[i] = in.nextInt();
        }

        System.out.println("--------------------");

        for (int i = 0; i < tamanhoVetor; i++) {
            int j = i + 1;
            System.out.println("Digite o " + j + "º número de B");
            b[i] = in.nextInt();
        }

        for (int i = 0; i < tamanhoVetor; i++) {
            boolean igual = false;
            for (int j = 0; j < tamanhoVetor; j++) {
                if (b[i] == a[j]) {
                    igual = true;
                    break;
                }
            }
            if (!igual) {
                contadorI++;
            }
        }

        int[] c = new int[contadorI];
        int p = 0;

        for (int i = 0; i < tamanhoVetor; i++) {
            boolean achado = false;
            for (int j = 0; j < tamanhoVetor; j++) {
                if (b[i] == a[j]) {
                    achado = true;
                    break;
                }
            }
            if (!achado) {
                c[p] = b[i];
                p++;
            }
        }

        for (int i = 0; i < contadorI; i++) {
            System.out.println("O número " + c[i] + " não é presente nas duas listas ao mesmo tempo!");
        }
    }
}
