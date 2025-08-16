import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=0;
        double sumaPosi=0;
        double sumanega=0;
        int cantNegativos=0;
        int cantNega = 0;
        int cantPositivos=0;

        int[] arreglo = new int[5];
        for (int i=0;i< arreglo.length;i++){
            System.out.print((i+1)+ ". Ingrese su primer numero:" );
            num=sc.nextInt();
            if (num>0){
                sumaPosi+=num;
                cantPositivos++;
            }else if (num<0){
                sumanega+=num;
                cantNega++;
            }else {
                cantNegativos++;
            }

        }
        if (cantNegativos>0){
            System.out.println("Si tiene 0");
        }else {
            System.out.println("El arreglo no cuenta con 0");
        }
        System.out.println("La media de los positivos es: " + (sumaPosi/cantPositivos));
        System.out.println("La cantidad de positivos es: "+cantPositivos);
        System.out.println("La media de los negativos es: " +(sumanega/cantNega));
        System.out.println("La cantidad de negativos es: "+cantNega);
    }
}