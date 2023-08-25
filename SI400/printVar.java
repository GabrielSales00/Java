
import java.util.Scanner;

class printVar {
    public static void main(String[] args ){
        //Novo objeto da classe scanner
        Scanner input = new Scanner(System.in);

        System.out.print("Insira um inteiro: ");
        //Inputs do usuário
        int intVal = input.nextInt();
        System.out.print("O valor foi " + intVal + " \n");

        System.out.print("Insira um float: ");
        //Inputs do usuário
        float floatVal = input.nextFloat();
        System.out.print("O valor foi " + floatVal + " \n");

        System.out.print("Insira um char: ");
        //Inputs do usuário
        char charVal = input.next().charAt(0);
        System.out.print("O valor foi " + charVal + " \n");

        System.out.print("Insira uma string: ");
        //Inputs do usuário
        String stringVal = input.next();
        System.out.print("O valor foi " + stringVal + " \n");

        input.close();
    }
}
