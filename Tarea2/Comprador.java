package Tarea2;
public class Comprador{

    //Al crear el cliente, comprará la bebida con los datos que se le indiquen.
    public Comprador(Moneda moneda, int bebidaElegida, Expendedor expendedorQueUsara){
        expendedorQueUsara.comprarBebida(moneda, bebidaElegida);
    }

    /*Entendemos que no se solita un metodo para comprar bebida, sin embargo nos parece importante poder realizar esta
    acción fuera del constructor. */
    public void ClienteCompraBebida(Moneda moneda, int bebidaElegida,Expendedor expendedorQueUsara){
        expendedorQueUsara.comprarBebida(moneda, bebidaElegida);
    }
}