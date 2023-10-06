import java.util.*;
public class EscolinhaFutebol {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Qual é a idade do aluno ?");
        int idade = in.nextInt();
        
        switch(idade) {
            case 6:
                System.out.println("Aluno na categoria Dente de leite");
                break;
            case 7:
                System.out.println("Aluno na categoria Junior");
                break;
            case 8:
                System.out.println("Aluno na categoria Junior max");
                break;
            case 9:
                System.out.println("Aluno na categoria Junior master");
                break;
            case 10:
                System.out.println("Aluno na categoria Master");
                break;
            default:
                System.out.println("O aluno indicado não tem idade para entrar em nossa escola");
        }
    }
}
