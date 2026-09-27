package bridge;

public class ProdutoEletronico extends Produto {

    public ProdutoEletronico(float salarioBase) {
        super(salarioBase);
    }

    public float calcularValor() {
        return this.desconto.calcularValor(this.valorBase) * 1.1f;
    }

}
