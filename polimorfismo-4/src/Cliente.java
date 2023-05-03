public class Cliente {
    private double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getCalcularDesconto(){
        return  getValor() - (getValor() * 0.10);
}
}