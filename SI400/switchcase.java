import java.util.Scanner;

class ComidaSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Pratos disponíveis: ");
        System.out.println("1 - Sushi");
        System.out.println("2 - Batata frita");
        System.out.println("3 - Espaguete ao Sugo");
        System.out.println("4 - Empanado de frango");
        System.out.println("5 - Pastel");
        System.out.println("6 - Sashimi");
        System.out.print("Insira um número inteiro: ");
        
        int choices = input.nextInt();
        
        switch (choices) {
            case 1:
                System.out.println("1 - Sushi");
                break;
            case 2:
                System.out.println("2 - Batata frita");
                break;
            case 3:
                System.out.println("3 - Espaguete ao Sugo");
                break;
            case 4:
                System.out.println("4 - Empanado de frango");
                break;
            case 5:
                System.out.println("5 - Pastel");
                break;
            case 6:
                System.out.println("6 - Sashimi");
                break;
            default:
                System.out.println("Prato indisponível");
                break;
        }
        
        input.close();
    }
}