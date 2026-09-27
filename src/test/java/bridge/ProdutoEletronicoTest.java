package bridge;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ProdutoEletronicoTest {
    @Test
    void testCalcularValorDescontoPorcentagem() {
        ProdutoEletronico produto = new ProdutoEletronico(100.0f);
        produto.setDesconto(new DescontoPorcentagem());
        float valorCalculado = produto.calcularValor();
        assertEquals(77.0f, valorCalculado, 0.001f);
    }

    @Test
    void testCalcularValorDescontoValorFixo() {
        ProdutoEletronico produto = new ProdutoEletronico(100.0f);
        produto.setDesconto(new DescontoValorFixo());
        float valorCalculado = produto.calcularValor();
        assertEquals(99.0f, valorCalculado, 0.001f);
    }
}
