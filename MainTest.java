import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    String[] palabraIngresada;
    boolean[] resultadosEsperados;
    int notasLista[];
    int[] promedioEsperado;
    @BeforeEach
    void setUp() {
        palabraIngresada = new String[]{"oso", "hola","1234",""};
        resultadosEsperados = new boolean[]{true,false,false,true};
        notasLista = new int[]{4,5,3,4,5};
        promedioEsperado = new int [(int) 4.1];
    }
    @Test
    void esPalindromoTest() {
        for(int i = 0; i < palabraIngresada.length; i++) {
            boolean valorObtenido = Main.esPalindromo(palabraIngresada[i]);
            assertEquals(valorObtenido,resultadosEsperados[i]);
        }
    }

    @Test
    void calcularPromedioTest() {

    }

    @Test
    void metodo4() {
    }

    @Test
    void metodo5() {
    }
}