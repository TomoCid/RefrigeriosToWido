package Tarea2;

public class MainTemporal {

    public static void main(String[] args) {
       
        /*
        Mostraremos todos los casos posibles al intentar comprar una bebida, para que se comprenda de mejor manera
        la salida del terminal usaremos sout's para separar cada ejemplo.
        */
    
        //Demostración del funcionamiento del programa en un caso perfecto
        System.out.println("\n------------- Compra [1]------------\n");

        Moneda500 moneda1 = new Moneda500();
        Expendedor expendedor1 = new Expendedor(2,500);
        Comprador JuantitoCopoDeNieve = new Comprador(moneda1, 0, expendedor1);

        System.out.println("\n------------- Compra [2]------------\n");

        //Ahora veremos un caso en el que el que el precio es superior al dinero del cliente
        Moneda1000 moneda2 = new Moneda1000();
        Expendedor expendedor2 = new Expendedor(1,1200);
        Comprador DiegoLlamaDeFosforo = new Comprador(moneda2, 2, expendedor2);


        System.out.println("\n------------- Compra [3]------------\n");
        //Caso en el que no quedan bebidas en el expendedor 
        Moneda1500 moneda3 = new Moneda1500();
        Expendedor expendedor3 = new Expendedor(0, 1500);
        Comprador Goku = new Comprador(moneda3, 1, expendedor3);
       
        System.out.println("\n------------- Compra [4]------------\n");
        //Caso en el que la moneda es Nula
        Expendedor expendedor4 = new Expendedor(4, 100);
        Comprador HarryPotter = new Comprador(null, 2, expendedor4);

        System.out.println("\n------------- Compra [5]------------\n");
        /* Ultimo caso, un cliente comprara una bebida y obtendra un vuelto, lo ira pidiendo hasta obtenerlo, luego
         * otro cliente querra comprar en la misma maquina de bebidas la misma bebida que el cliente anterior, pero
         * estas se habrán agotado, entonces comprara otro tipo de bebida y pedirá su vuelto.
         */

        Moneda500 moneda4 = new Moneda500();
        Expendedor expendedor5 = new Expendedor(1, 100);

        Comprador PedroPicaPiedras = new Comprador(moneda4, 2, expendedor5);
        expendedor5.entregarVuelto();
        expendedor5.entregarVuelto();
        expendedor5.entregarVuelto();
        expendedor5.entregarVuelto();
        expendedor5.entregarVuelto();

        System.out.println("\n------------\n");

        Comprador BradPitt = new Comprador(moneda4, 2, expendedor5);
        BradPitt.ClienteCompraBebida(moneda4, 0, expendedor5);
        expendedor5.entregarVuelto();
        expendedor5.entregarVuelto();
        expendedor5.entregarVuelto();
        expendedor5.entregarVuelto();
        expendedor5.entregarVuelto();

        System.out.println("\n-------------Extra------------\n");
        System.out.println(moneda1.toString());
        System.out.println(moneda4.toString());
        
        

  

        


   
        
        
    

    }
}
