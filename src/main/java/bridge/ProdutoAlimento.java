package bridge;

public class ProdutoAlimento extends Produto {

    public ProdutoAlimento(float valorBase) {
        super(valorBase);
    }

    public float calcularValor() {
        return this.desconto.calcularValor(this.valorBase);
    }
}
