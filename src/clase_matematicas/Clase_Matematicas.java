package clase_matematicas;
import java.util.Scanner;
public class Clase_Matematicas {

    public static void main(String[] args) {
        //declaracion de variables
        double raiz,numero;
        //Lepidimos al usuario que nos diguite un numero
        System.out.println("digita el numero :");
        Scanner entrada= new Scanner(System.in);
        numero= entrada.nextDouble();
        //calcula la raiz cudrada
        
        //raiz = Math.sqrt(9);
        numero=Math.sqrt(numero);
        //imprimimos en la raiz de 9
        System.out.println("el valor de raiz es: " + numero);
    }

}
