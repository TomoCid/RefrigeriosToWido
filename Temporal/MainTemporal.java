package Temporal;

public class MainTemporal {

    public static void main(String[] args) {
       
        //W. Testeando como funciona el llamado entre clases...
        Moneda500 moneda1 = new Moneda500();
        Moneda1000 moneda2 = new Moneda1000();
        Expendedor expendedor1 = new Expendedor(2,600);
        Expendedor expendedor2 = new Expendedor(0,100);
        Comprador JuantitoCopoDeNieve = new Comprador(moneda1, 0, expendedor1);
        Comprador DiegoLlamaDeFosforo = new Comprador(moneda2, 2, expendedor1);
        expendedor1.entregarVuelto();
        expendedor1.entregarVuelto();
        expendedor1.entregarVuelto();
        expendedor1.entregarVuelto();
        expendedor1.entregarVuelto();
        Comprador PedritoHojasDePapel = new Comprador(moneda1, 1, expendedor2);
        

  

        


   
        
        
    

    }
}
