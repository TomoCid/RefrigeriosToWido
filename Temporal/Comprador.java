package Temporal;
public class Comprador{

    /*Recibir la moneda con la que comprará, un número que identifique el tipo de bebida y la referencia al Expendedor en
        el que comprará
    */

    public Comprador(Moneda moneda, int bebidaElegida, Expendedor expendedorQueUsara){
        //Pensando

        //Comprobar si alcanza el dinero para comprar una bebida, Igual que en la realidad :(
        //hola
        try{

            error1(moneda);
        }catch(Exception Error1Prueba){
            System.out.println("hola, soy un error :D ");
        }



    }

    public void Comprar(Moneda moneda, Expendedor expenderor){
        if(expenderor.getPrecio() == Integer.parseInt( moneda.toString() )){
            //Compra con exito
        }


    }

    public void error1(Moneda moneda)throws Error1Prueba{

        if(moneda==null){
            throw new Error1Prueba("DINERO INSUFICIENTE :( ");
        }

    }



}