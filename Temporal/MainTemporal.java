package Temporal;

public class MainTemporal {

    public static void main(String[] args) {

        //W. Testeando como funciona el llamado entre clases...
        Moneda1000 moneda1 = new Moneda1000();
        Expendedor expendedor1 = new Expendedor(2,200);
        Comprador JuantitoCopoDeNieve = new Comprador(null, 0, expendedor1);



    }
}
