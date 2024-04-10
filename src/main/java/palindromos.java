import java.util.Scanner;

public class palindromos {
    public static void main(String[] args) {
        /* para leer la entrada de texto */
        Scanner sc = new Scanner(System.in);
        System.out.println(" Ingrese la palabra a comprobar: ");
        /* se lee la entrada de texto */
        String palabra = sc.nextLine();
        /* se convierte la entrada en minusculas*/
        palabra = palabra.toLowerCase();

        /* funcion que verifica si es palindromo */
        if (esPalindromos(palabra)){
            System.out.println("La entrada si era un palindromo");
        } else {
            System.out.println("La entrada no era un palindromo");
        }
    }
    /* funcion para verificar si es palindromo */
    public static boolean esPalindromos(String str){
        /* se inicializan los indices */
        int largo = str.length();
        /* se recorre la palabra */
        for (int palabra = 0; palabra < largo/2; palabra++){
            /* se verifica si los caracteres son iguales */
            if (str.charAt(palabra) != str.charAt(largo - palabra - 1)){
                return false;
            }
        }
        return true;
    }
}
