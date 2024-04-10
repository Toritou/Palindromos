import java.util.Scanner;

public class palindromos {
    public static void main(String[] args) {
        /* para leer la entrada de texto */
        Scanner sc = new Scanner(System.in);
        System.out.println(" Ingrese la palabra a comprobar: ");
        /* se lee la entrada de texto */
        String palabra = sc.nextLine();

        /* funcion que verifica si es palindromo */
        if (esPalindromos(palabra)){
            System.out.println("La entrada si era un palindromo");
        } else {
            System.out.println("La entrada no era un palindromo");
        }
    }

}
