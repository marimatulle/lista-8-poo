public class ClienteEspecial extends Cliente{
    
    @Override
    public double getCalcularDesconto(){
        return getValor() - (getValor() * 0.20);
    }
}