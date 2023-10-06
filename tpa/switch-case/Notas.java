import java.util.*;

public class Notas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Quantos alunos receberam I de incompetente ?");
        int i = in.nextInt();
        while (i < 0) {
            System.out.println("Apenas números naturais inteiros");
            System.out.println("Quantos alunos receberam I de incompetente ?");
            i = in.nextInt();
        }

        System.out.println("Quantos alunos receberam R de ruim ?");
        int r = in.nextInt();
        while (r < 0) {
            System.out.println("Apenas números naturais inteiros");
            System.out.println("Quantos alunos receberam R de ruim ?");
            r = in.nextInt();
        }

        System.out.println("Quantos alunos receberam B de bom ?");
        int b = in.nextInt();
        while (b < 0) {
            System.out.println("Apenas números naturais inteiros");
            System.out.println("Quantos alunos receberam B de bom ?");
            b = in.nextInt();
        }

        System.out.println("Quantos alunos receberam MB de muito bom ?");
        int mb = in.nextInt();
        while (mb < 0) {
            System.out.println("Apenas números naturais inteiros");
            System.out.println("Quantos alunos receberam MB de muito bom ?");
            mb = in.nextInt();
        }

        int total = i + r + b + mb;
        double total2 = i + r + b + mb;
        double mediaI = (i / total2) * 100;
        double mediaR = (r / total2) * 100;
        double mediaB = (b / total2) * 100;
        double mediaMB = (mb / total2) * 100;
        
        String mediaIFormatada = String.format("%.1f", mediaI);
        String mediaRFormatada = String.format("%.1f", mediaR);
        String mediaBFormatada = String.format("%.1f", mediaB);
        String mediaMBFormatada = String.format("%.1f", mediaMB);
        
        System.out.println(mediaIFormatada + "% dos seus alunos tiraram I de incompetente.");
        System.out.println(mediaRFormatada + "% dos seus alunos tiraram R de ruim.");
        System.out.println(mediaBFormatada + "% dos seus alunos tiraram B de bom.");
        System.out.println(mediaMBFormatada + "% dos seus alunos tiraram MB de muito bom.");
        System.out.println("Sua turma tem um total de " + total + " alunos.");
    }
}
