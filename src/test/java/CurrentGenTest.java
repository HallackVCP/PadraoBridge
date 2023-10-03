import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CurrentGenTest {


    @Test
    void deveRetornarPrecoCurrentGenVersaoBase(){
        Versao versao = new VersaoBase();
        CurrentGen currentGen = new CurrentGen(100);
        currentGen.setVersao(versao);
        assertEquals(100, currentGen.calcularPreco(), 0.1);
    }
    @Test
    void deveRetornarPrecoCurrentGenVersaoExtra(){
        Versao versao = new VersaoExtra();
        CurrentGen currentGen = new CurrentGen(100);
        currentGen.setVersao(versao);
        assertEquals(110, currentGen.calcularPreco(), 0.1);
    }

    @Test
    void deveRetornarPrecoCurrentGenVersaoUltimate(){
        Versao versao = new VersaoUltimate();
        CurrentGen currentGen = new CurrentGen(100);
        currentGen.setVersao(versao);
        assertEquals(125, currentGen.calcularPreco(), 0.1);
    }
}
