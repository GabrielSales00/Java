import java.util.Scanner;

class tabuada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Insira um inteiro: ");
        int intVal = input.nextInt();
        int res;
        for (int i = 0; i < 10; i++) {
            res = intVal * (i + 1);
            System.out.print(intVal + "x" + (i + 1) + " = " + res + "\n");
        }
        input.close();
    }
}
