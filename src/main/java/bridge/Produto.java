package bridge;

public abstract class Produto {

    protected Desconto desconto;

    protected float valorBase;

    public Produto(float valorBase) {
        this.valorBase = valorBase;
    }

    public void setDesconto(Desconto desconto) {
        this.desconto = desconto;
    }

    public void setValorBase(float salarioBase) {
        this.valorBase = salarioBase;
    }

    public abstract float calcularValor();
}
