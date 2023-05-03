public class App {
    public static void main(String[] args) throws Exception {

        Cliente[] clientes = new Cliente[2];    
        clientes[0] = new ClienteEspecial();
        clientes[0].setValor(1000);
        clientes[1] = new Cliente();
        clientes [1].setValor(1000);
        System.out.println("Total sem desconto: " + clientes[0].getValor());
                
        System.out.println("Valor do Cliente Especial: "
                + clientes[0].getCalcularDesconto());
                
        System.out.println("Valor do Cliente: "
                + clientes[1].getCalcularDesconto());
                    
    }
}