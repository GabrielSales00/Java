import java.util.Scanner;

class stringarray {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        String[] buffer = new String[128];
        System.out.print("Escreva um texto qualquer, com até 128 linhas: ");
        int limiteLin = 128;
        int i = 0;
        while (i < limiteLin) {
            buffer[i] = input.next();
            if (buffer[i].endsWith("fim")) {
                break;
            }
            i++;
        }
        i--;
        while (i >= 0) {
            String tempBuffer = buffer[i];
            int j = tempBuffer.length() - 1;
            while (j >= 0) {
                System.out.print(tempBuffer.charAt(j));
                j--;
            }
            i--;
        }
        System.out.print("\n");
        input.close();
    }
}
