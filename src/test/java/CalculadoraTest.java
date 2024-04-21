import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    Calculadora resultadoCorreto = new Calculadora();
    int a = 10;
    int b = 5;


    @org.junit.jupiter.api.Test
    void soma() {
        assertEquals(15, resultadoCorreto.soma(a,b));
    }

    @org.junit.jupiter.api.Test
    void subtrair() {
        assertEquals(5, resultadoCorreto.subtrair(a,b));
    }

    @org.junit.jupiter.api.Test
    void multiplicar() {
        assertEquals(50, resultadoCorreto.multiplicar(a,b));
    }

    @org.junit.jupiter.api.Test
    void dividir() {
        assertEquals(2, resultadoCorreto.dividir(a,b));
    }

    @org.junit.jupiter.api.Test
    void potencia(){
        assertEquals(100000, resultadoCorreto.potencia(a,b));
    }
}

