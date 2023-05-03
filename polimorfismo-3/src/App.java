public class App {
    public static void main(String[] args) throws Exception {
        
        Figura[] figuras = new Figura[2]; 

        figuras[0] = new Circulo();
        figuras[0].setArea(5);

        figuras[1] = new Quadrado();
        figuras [1].setArea(5);
                
        System.out.println("Area do Circulo: "
                + figuras[0].CalculaArea());
                
        System.out.println("Area do Quadrado: "
                + figuras[1].CalculaArea());
                    
    }
}