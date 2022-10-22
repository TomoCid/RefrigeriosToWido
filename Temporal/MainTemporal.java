package Temporal;

public class MainTemporal {

    public static void main(String[] args) {
       
        //W. Testeando como funciona el llamado entre clases...
        Moneda500 moneda1 = new Moneda500();
        Expendedor expendedor1 = new Expendedor(2,600);
        Comprador JuantitoCopoDeNieve = new Comprador(moneda1, 0, expendedor1);

        expendedor1.entregarVuelto();
        expendedor1.entregarVuelto();
        expendedor1.entregarVuelto();
        expendedor1.entregarVuelto();

        


   
        
        
    

    }
}
