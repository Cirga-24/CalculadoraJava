import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = 0, num2 = 0, resultado, n;
        double i = 1;
        int opcion;
        int salida;
        boolean Salir = false;

        do {
            System.out.println("\tMENÚ");
            System.out.println("1) Sumar");
            System.out.println("2) Restar");
            System.out.println("3) Multiplicar");
            System.out.println("4) Dividir");
            System.out.println("5) Cuadrado");
            System.out.println("6) Cubo");
            System.out.println("7) Raiz");

            System.out.print("Digite su opcion: \n>> ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingreso a la opcion de suma");
                    System.out.print("Ingrese el primer numero: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo numero: ");
                    num2 = scanner.nextDouble();
                    resultado = num1 + num2;
                    System.out.println("El resultado es: " + resultado);
                    Salir = true;
                    break;
                case 2:
                    System.out.println("Ingreso a la opcion de resta");
                    System.out.print("Ingrese el primer numero: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo numero: ");
                    num2 = scanner.nextDouble();
                    resultado = num1 - num2;
                    System.out.println("El resultado es: " + resultado);
                    Salir = true;
                    break;
                case 3:
                    System.out.println("Ingreso a la opcion de multiplicacion");
                    System.out.print("Ingrese el primer numero: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo numero: ");
                    num2 = scanner.nextDouble();
                    resultado = num1 * num2;
                    System.out.println("El resultado es: " + resultado);
                    Salir = true;
                    break;
                case 4:
                    System.out.println("Ingreso a la opcion de division");
                    System.out.print("Ingrese el primer numero: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo numero: ");
                    num2 = scanner.nextDouble();
                    resultado = num1 / num2;
                    System.out.println("El resultado es: " + resultado);
                    Salir = true;
                    break;
                case 5:
                    System.out.println("Ingreso a la opcion de cuadrado");
                    System.out.print("Ingrese el numero a elevar: ");
                    num1 = scanner.nextDouble();
                    resultado = num1 * num1;
                    System.out.println("El resultado es: " + resultado);
                    Salir = true;
                    break;
                case 6:
                    System.out.println("Ingreso a la opcion de cubo");
                    System.out.print("Ingrese el numero para la raiz: ");
                    num1 = scanner.nextDouble();
                    resultado = num1 * num1 * num1;
                    System.out.println("El resultado es: " + resultado);
                    Salir = true;
                    break;
            }
        } while (!Salir);
    }
}