import java.util.Scanner;

public class ConversorMonedas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n--- CONVERSOR DE SOLES ---");
            System.out.println("1. Convertir a Dólares");
            System.out.println("2. Convertir a Euros");
            System.out.println("3. Convertir a Yenes");
            System.out.println("4. Convertir a Rublos");
            System.out.println("5. Calculadora");
            System.out.println("6. Salir");

            int opcion;
            if (sc.hasNextInt()) {
                opcion = sc.nextInt();
            } else {
                System.out.println("Por favor ingresa solo números");
                sc.next();
                continue;
            }

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa los soles: ");
                    if (sc.hasNextDouble()) {
                        double soles1 = sc.nextDouble();
                        if (soles1 >= 0) {
                            double dolares = soles1 / 3.75;
                            System.out.println(soles1 + " soles = " + String.format("%.2f", dolares) + " USD");
                        } else {
                            System.out.println("Ingresa un número positivo");
                        }
                    } else {
                        System.out.println("Por favor ingresa solo números");
                        sc.next();
                    }
                    break;

                case 2:
                    System.out.print("Ingresa los soles: ");
                    if (sc.hasNextDouble()) {
                        double soles2 = sc.nextDouble();
                        if (soles2 >= 0) {
                            double euros = soles2 / 4.10;
                            System.out.println(soles2 + " soles = " + String.format("%.2f", euros) + " EUR");
                        } else {
                            System.out.println("Ingresa un número positivo");
                        }
                    } else {
                        System.out.println("Por favor ingresa solo números");
                        sc.next();
                    }
                    break;

                case 3:
                    System.out.print("Ingresa los soles: ");
                    if (sc.hasNextDouble()) {
                        double soles3 = sc.nextDouble();
                        if (soles3 >= 0) {
                            double yenes = soles3 * 29.33;
                            System.out.println(soles3 + " soles = " + String.format("%.2f", yenes) + " JPY");
                        } else {
                            System.out.println("Ingresa un número positivo");
                        }
                    } else {
                        System.out.println("Por favor ingresa solo números");
                        sc.next();
                    }
                    break;

                case 4:
                    System.out.print("Ingresa los soles: ");
                    if (sc.hasNextDouble()) {
                        double soles4 = sc.nextDouble();
                        if (soles4 >= 0) {
                            double rublos = soles4 * 20.0;
                            System.out.println(soles4 + " soles = " + String.format("%.2f", rublos) + " RUB");
                        } else {
                            System.out.println("Ingresa un número positivo");
                        }
                    } else {
                        System.out.println("Por favor ingresa solo números");
                        sc.next();
                    }
                    break;

                case 5:
                    System.out.println("-- CALCULADORA --");
                    System.out.println("1. Sumar");
                    System.out.println("2. Restar");
                    System.out.println("3. Multiplicar");
                    System.out.println("4. Dividir");

                    int calc = sc.nextInt();

                    System.out.print("Primer número: ");
                    double num1 = sc.nextDouble();
                    System.out.print("Segundo número: ");
                    double num2 = sc.nextDouble();

                    switch (calc) {
                        case 1:
                            System.out.println("Resultado: " + (num1 + num2));
                            break;
                        case 2:
                            System.out.println("Resultado: " + (num1 - num2));
                            break;
                        case 3:
                            System.out.println("Resultado: " + (num1 * num2));
                            break;
                        case 4:
                            if (num2 != 0) {
                                System.out.println("Resultado: " + String.format("%.2f", num1 / num2));
                            } else {
                                System.out.println("No se puede dividir entre cero");
                            }
                            break;
                        default:
                            System.out.println("Opción no válida");
                    }
                    break;

                case 6:
                    System.out.println("¡Hasta luego!");
                    continuar = false;
                    break;

                default:
                    System.out.println("Opción no válida");
            }
        }

        sc.close();
    }
}
