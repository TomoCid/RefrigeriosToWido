package Temporal;
public class A {

    public static void main(String[] args) {
        Expendedor soda = new Expendedor(1);
        Moneda x = new Moneda();
        Bebida xoda = soda.comprarBebida(x, 1);
        if(xoda!=null){
        System.out.println(xoda.beber()+xoda.getSerie());
        }else{
            System.out.println("No hay colas");
        }
        System.out.println(xoda.beber());
    }
}
