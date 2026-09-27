package bridge;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ProdutoAlimentoTest {
    @Test
    void testCalcularValorDescontoPorcentagem() {
        ProdutoAlimento produto = new ProdutoAlimento(100.0f);
        produto.setDesconto(new DescontoPorcentagem());
        float valorCalculado = produto.calcularValor();
        assertEquals(70.0f, valorCalculado, 0.001f);
    }

    @Test
    void testCalcularValorDescontoValorFixo() {
        ProdutoAlimento produto = new ProdutoAlimento(100.0f);
        produto.setDesconto(new DescontoValorFixo());
        float valorCalculado = produto.calcularValor();
        assertEquals(90.0f, valorCalculado, 0.001f);
    }
}
