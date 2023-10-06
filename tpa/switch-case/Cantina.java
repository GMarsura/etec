
import java.util.*;
public class Cantina {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o código do pedido");
        int codigo = in.nextInt();
        
        switch(codigo) {
            case 1:
                System.out.println("O Cachorro quente está R$ 8,00");
                break;
            case 2:
                System.out.println("O Cheeseburger está R$ 12,00");
                break;
            case 3:
                System.out.println("O X-Salada está R$ 15,00");
                break;
            case 4:
                System.out.println("O Misto quente está R$ 11,00");
                break;
            case 5:
                System.out.println("O Pão na chapa está R$ 6,00");
                break;
            default:
                System.out.println("Não temos produtos com este código");
                break;
        }
    }
}