package Tarea2;
import java.util.Objects;

class Expendedor {
    private Deposito fanta;
    private Deposito coca;
    private Deposito sprite;
    private DepositoMonedas vuelto;
    private int Precio;

    //La maquina tiene un deposito donde almacena el vuelto a entregar
    //Constructor del expendedor, se le entrega la cantidad de bebidas y el precio (Valores iguales para todos los depositos)
    public Expendedor(int cantidad, int precio) {

        this.Precio = precio ;
        coca = new Deposito();
        sprite = new Deposito();
        fanta = new Deposito();
        vuelto = new DepositoMonedas();

        for (int i = 0; i < cantidad; i++) {
            coca.addBebida(new CocaCola(i+100));
            sprite.addBebida(new Sprite(i+200));
            fanta.addBebida(new Fanta(i+300));
        }
    }

    public int getPrecio(){
        return this.Precio;
    }

    //Metodo devolver el vuelto (Debe ir eliminado de una en una moneda hasta retornar null)
    public void calcularVuelto(int valorDeLaMoneda){
        
        int cantidadDeMonedadsAdevolver = (valorDeLaMoneda-this.Precio)/100;
        

        //Este for entregara monedas de 100 en 100 hasta vaciar el deposito de Vuelto
        for (int i = 0; i < cantidadDeMonedadsAdevolver; i++){
            vuelto.addMoneda(new Moneda100());

        }

    }

    public void vueltoString(){
        if(vuelto.listIsEmpty()==false){
            System.out.println("Recibiste $100"); 
        }else{
            System.out.println("No hay vuelto");
        }
    }

    public void entregarVuelto(){
        vueltoString();
        vuelto.getMoneda();
    }

    public void sacarBebida(int Soda){
            switch(Soda){
                case 0: coca.getBebida();
                        System.out.println("Ha comprado una Coca-Cola");
                        break;

                case 1: sprite.getBebida();
                        System.out.println("Ha comprado una Sprite");
                        break;

                case 2: fanta.getBebida();
                        System.out.println("Ha comprado una Fanta");
                        break;
            }
    }
    
    //Este se invoca desde el constructor de Comprador
    public void comprarBebida(Moneda moneda, int Soda){
        //Lo primero que se debe hacer es verificar si la moneda es nula, de ser as?? no se sigue ejecutando el codigo
        if( Objects.isNull(moneda)){
            try{
                throw new Error3Exception("Moneda es Nula");
            }catch(Error3Exception msg3){
                System.out.println(msg3.getMessage());
            }
        }else{
            //Este fragmento de codigo nos seleccionara el deposito de bebidas al que queremos acceder
            boolean booleanAux=false;
            switch(Soda){
              case 0: booleanAux= coca.hayBebidas();
                        break;
             case 1: booleanAux= sprite.hayBebidas();
                        break;
             case 2: booleanAux= fanta.hayBebidas();
            }

            //Este codigo est?? encargado de verificar todos los casos y realizar la compra de la bebida
            if(moneda.getValues() == this.Precio && booleanAux){
              sacarBebida(Soda);

            }else if(moneda.getValues() >= this.Precio){

             if(booleanAux){
                   sacarBebida(Soda);
                    calcularVuelto(moneda.getValues());
                }else{
                  try{
                       switch(Soda){
                        case 0:
                            throw new Error3Exception("No queda CocaCola");
                        case 1:
                            throw new Error3Exception("No queda Sprite");
                        case 2:
                            throw new Error3Exception("No queda Fanta");
                        default:
                            throw new Error3Exception("Seleccione una bebida valida");
                    }
                    }catch(Error3Exception msg3){
                        System.out.println("Se devuelve la moneda de $"+moneda.getValues()+" pesos.");
                        System.out.println(msg3.getMessage());
                    }
                }
            }else{ 
                try{
                    if(moneda.getValues() < this.Precio){
                        System.out.println("Se devuelve la moneda de $"+moneda.getValues()+" pesos.");
                        throw new Error1Exception("No hay saldo suficiente");
                    }
                }catch(Error1Exception e){
                    System.out.println(e.getMessage());
                }
            }   
        }
    }    
}
