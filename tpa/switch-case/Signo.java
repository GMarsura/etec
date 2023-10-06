
import java.util.*;

public class Signo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o dia de seu Nascimento");
        int dia = in.nextInt();
        
        while (dia < 1 || dia > 31) {
            System.out.println("Dia inválido, tente novamente");
            System.out.println("Informe o dia de seu Nascimento");
            dia = in.nextInt();
        }
        
        System.out.println("Informe o mês de seu Nascimento");
        int mes = in.nextInt();
        
        while (mes < 1 || mes > 12) {
            System.out.println("Mês inválido, tente novamente");
            System.out.println("Informe o mês de seu Nascimento");
            mes = in.nextInt();
        }
        
        if ((mes == 2 && dia > 29) || (mes == 2 && dia == 29)) {
            System.out.println("Dia inválido para fevereiro");
        } else {
            switch (mes) {
                case 3:
                    if (dia >= 21) {
                        System.out.println("Você é de Áries");
                    } else {
                        System.out.println("Você é de Peixes");
                    }
                    break;
                case 4:
                    if (dia >= 21) {
                        System.out.println("Você é de Touro");
                    } else {
                        System.out.println("Você é de Áries");
                    }
                    break;
                case 5:
                    if (dia >= 21) {
                        System.out.println("Você é de Gêmeos");
                    } else {
                        System.out.println("Você é de Touro");
                    }
                    break;
                case 6:
                    if (dia >= 21) {
                        System.out.println("Você é de Câncer");
                    } else {
                        System.out.println("Você é de Gêmeos");
                    }
                    break;
                case 7:
                    if (dia >= 21) {
                        System.out.println("Você é de Leão");
                    } else {
                        System.out.println("Você é de Câncer");
                    }
                    break;
                case 8:
                    if (dia >= 21) {
                        System.out.println("Você é de Virgem");
                    } else {
                        System.out.println("Você é de Leão");
                    }
                    break;
                case 9:
                    if (dia >= 21) {
                        System.out.println("Você é de Libra");
                    } else {
                        System.out.println("Você é de Virgem");
                    }
                    break;
                case 10:
                    if (dia >= 21) {
                        System.out.println("Você é de Escorpião");
                    } else {
                        System.out.println("Você é de Libra");
                    }
                    break;
                case 11:
                    if (dia >= 21) {
                        System.out.println("Você é de Sagitário");
                    } else {
                        System.out.println("Você é de Escorpião");
                    }
                    break;
                case 12:
                    if (dia >= 21) {
                        System.out.println("Você é de Capricórnio");
                    } else {
                        System.out.println("Você é de Sagitário");
                    }
                    break;
                case 1:
                    if (dia >= 21) {
                        System.out.println("Você é de Aquário");
                    } else {
                        System.out.println("Você é de Capricórnio");
                    }
                    break;
                case 2:
                    if (dia >= 21) {
                        System.out.println("Você é de Peixes");
                    } else {
                        System.out.println("Você é de Aquário");
                    }
                    break;
                default:
                    System.out.println("Mês inválido");
                    break;
            }
        }
    }
}
