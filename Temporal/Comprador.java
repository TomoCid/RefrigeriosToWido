package Temporal;
public class Comprador{

    /*Recibir la moneda con la que comprará, un número que identifique el tipo de bebida y la referencia al Expendedor en 
        el que comprará
    */
    
    public Comprador(Moneda moneda, int bebidaElegida, Expendedor expendedorQueUsara){
        //Pensando

        expendedorQueUsara.comprarBebida(moneda, bebidaElegida);

    }






    /*

            try{

            error1(moneda);
        }catch(Exception Error1Prueba){
            System.out.println("hola, soy un error :D ");
        }

    public void error1(Moneda moneda)throws Error1Prueba{

          if(moneda==null){
            throw new Error1Prueba("DINERO INSUFICIENTE :( ");
          }  

    } 

    public void error2(Moneda moneda)
    */




}