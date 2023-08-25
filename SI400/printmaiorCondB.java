import java.util.Scanner;
class printMaior {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Insira dois valores, apertando enter para cada entrada, o programa irá imprimir o maior: ");
        int val1, val2;
        val1 = input.nextInt();
        val2 = input.nextInt();

        String testeCond = val1 > val2 
            ? "O primeiro valor de " + val1 + " é o maior. \n"
            : "O segundo valor de " + val2 + " é o maior. \n";
        
        System.out.print(testeCond);

        input.close();
    }
}
