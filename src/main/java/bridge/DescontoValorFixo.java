package bridge;

public class DescontoValorFixo implements Desconto {

    public float calcularValor(float valorBase) {
        return Math.max(0, valorBase - 10.0f);
    }
}
