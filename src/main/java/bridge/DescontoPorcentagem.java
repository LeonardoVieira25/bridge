package bridge;

public class DescontoPorcentagem implements Desconto {

    public float calcularValor(float valorBase) {
        return valorBase * 0.7f;
    }
}
