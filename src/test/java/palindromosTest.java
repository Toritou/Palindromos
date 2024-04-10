import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class palindromosTest {
    String cadenaVacia;
    String cadenaPalindromo;
    int numero;
    String cadenaNoPalindromo;
    String cadenaPalindromoConEspacios;
    @BeforeEach
    void setUp() {
        cadenaVacia = "";
        cadenaPalindromo = "aaabccbaaa";
        numero = 200;
        cadenaNoPalindromo = "ahabccbaaa";
        cadenaPalindromoConEspacios = "La tele letal";
    }
    @AfterEach
    void tearDown() {
    }

    @Test
    void esPalindromos(){
        assertTrue(palindromos.esPalindromos(cadenaVacia));
        assertTrue(palindromos.esPalindromos(cadenaPalindromo));
        assertFalse(palindromos.esPalindromos(String.valueOf(numero)));
        assertFalse(palindromos.esPalindromos(cadenaNoPalindromo));
        assertTrue(palindromos.esPalindromos(cadenaPalindromoConEspacios));
    }
}