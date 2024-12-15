import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenid@s a la calculadora de Fonti! \n" +
                "¿Que cálculo necesitais operar en este momento?... \n" +
                " ( + ) Suma \n" +
                " ( - ) Resta \n" +
                " ( * ) Multiplicación \n" +
                " ( / ) División \n");
        String operar = scanner.nextLine();


        System.out.println("Dime el primer número a operar... ");
        int n1 = scanner.nextInt();
        System.out.println("Dime el segundo número a operar... ");
        int n2 = scanner.nextInt();

        switch (operar.toLowerCase()) {
            case "+":
            case "suma":
                System.out.println("Tu primer número: " + n1 + " MÁS tu segundo número: " + n2 + " da el valor de ... " + (n1+n2));
                break;

            case "-":
            case "resta":
                System.out.println("Tu primer número: " + n1 + " MENOS tu segundo número: " + n2 + " da el valor de ... " + (n1-n2));
                break;

            case "*":
            case "multiplicacion":
            case "multiplicación":
                System.out.println("Tu primer número: " + n1 + " MULTIPLICADO POR tu segundo número: " + n2 + " da el valor de ... " + (n1*n2));
                break;

            case "/":
            case "division":
            case "división":
                System.out.println("Tu primer número: " + n1 + " DIVIDIDO ENTRE tu segundo número: " + n2 + " da el valor de ... " + (n1/n2));
                break;

            default:
                System.out.println("Ese operador no existe");

        }
    }
}