public class Circulo extends Figura {
    private double pi = 3.14;

    @Override
    public double CalculaArea(){
        return  pi * ( getArea() *  getArea());
    
    }
}