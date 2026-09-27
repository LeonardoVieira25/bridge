import bridge.ProdutoAlimento;
import bridge.DescontoValorFixo;
import bridge.Desconto;

public class Main {
    public static void main(String[] args) {
        Desconto descontoValorFixo = new DescontoValorFixo();
        ProdutoAlimento produtoAlimento = new ProdutoAlimento(1000.0f);
        produtoAlimento.setDesconto(descontoValorFixo);
        System.out.println("Preço: " + produtoAlimento.calcularValor());
    }
}
