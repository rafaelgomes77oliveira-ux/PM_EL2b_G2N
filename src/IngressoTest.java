import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IngressoTest {
    
    Ingresso regular;

    @BeforeEach 
    public void setUp(){
        //arrange
        regular = new Regular("Mario Galaxy", null);

    }

    @Test 
    public void CalcularValorIngressoCerto(){
        //act
        regular.incluir(EAdicional.BALDE_ESPECIAL);
        regular.incluir(EAdicional.PIPOCA);
        regular.incluir(EAdicional.REFRIGERANTE);
        double valorIngresso = regular.valorIngresso();
        //assert
        assertEquals(71d, valorIngresso, 0.01d);
    }

    @Test 
    public void CalcularValorAdicionaisCerto(){
        //act
        regular.incluir(EAdicional.BALDE_ESPECIAL);
        regular.incluir(EAdicional.PIPOCA);
        double adicionais = regular.valorAdicionais();
        //assert
        assertEquals(33d, adicionais, 0.01d);
    }




}
