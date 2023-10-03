import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NextGenTest {

    @Test
    void deveRetornarPrecoNextGenVersaoBase(){
        Versao versao = new VersaoBase();
        NextGen nextGen = new NextGen(100);
        nextGen.setVersao(versao);
        assertEquals(110, nextGen.calcularPreco(), 0.1);
    }
    @Test
    void deveRetornarPrecoNextGenVersaoExtra(){
        Versao versao = new VersaoExtra();
        NextGen nextGen = new NextGen(100);
        nextGen.setVersao(versao);
        assertEquals(120, nextGen.calcularPreco(), 0.1);
    }

    @Test
    void deveRetornarPrecoNextGenVersaoUltimate(){
        Versao versao = new VersaoUltimate();
        NextGen nextGen = new NextGen(100);
        nextGen.setVersao(versao);
        assertEquals(135, nextGen.calcularPreco(), 0.1);
    }
}
