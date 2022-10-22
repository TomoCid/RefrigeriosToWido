package Temporal;

class Expendedor {
    private Deposito fanta;
    private Deposito coca;
    private Deposito sprite;
    private DepositoMonedas vuelto;
    private int Precio;
    private int CantidadAuxiliar; 

    //W. La maquina tiene un deposito donde almacena el vuelto a entregar
    //Sas
    //W. Constructor del expendedor, se le entrega la cantidad de bebidas y el precio (Valores iguales para todos los depositos)
    public Expendedor(int cantidad, int precio) {

        this.Precio = precio ;
        this.CantidadAuxiliar = cantidad;
        coca = new Deposito();
        sprite = new Deposito();
        fanta = new Deposito();
        vuelto = new DepositoMonedas();

        for (int i = 0; i < cantidad; i++) {
            coca.addBebida(new CocaCola(i+100));
            sprite.addBebida(new Sprite(i+200));
            fanta.addBebida(new Fanta(i+200));
        }
    }

    public int getPrecio(){
        return this.Precio;
    }

    public Boolean hayBebidas(){
        if(this.CantidadAuxiliar != 0){
            return true;
        }else{
            //agregar excepcion no hay bebidas
            return false;
        }
    }

    //W. Metodo devolver el vuelto (Debe ir eliminado de una en una moneda hasta retornar null)
    public void calcularVuelto(int valorDeLaMoneda){
        
        int cantidadDeMonedadsAdevolver = (valorDeLaMoneda-this.Precio)/100;
        

        //Este for entregara monedas de 100 en 100 hasta vaciar el deposito de Vuelto
        for (int i = 0; i < cantidadDeMonedadsAdevolver; i++){
            vuelto.addMoneda(new Moneda100());
            System.out.println("SE GUARDO UNA MONEDA! "+ (i+1));
        }

    }

    public void texto(){

        if(vuelto.listIsEmpty()==false){
            System.out.println("Recibiste $100"); 
        }else{
            System.out.println("No hay vuelto");
        }
    }

    public void entregarVuelto(){

        texto();
        vuelto.getMoneda();

    }

    public void sacarBebida(int bebidaSeleccionada){

                    switch(bebidaSeleccionada){
                case 0: coca.getBebida();
                        break;

                case 1: sprite.getBebida();
                        break;

                case 2: fanta.getBebida();
                        break;
                
            }
    }
    
    //Este se invoca desde el constructor de Comprador (AGREGAR EXCEPCIONES)
    public void comprarBebida(Moneda moneda, int bebidaSeleccionada){

        //Idea general! Deben agregarse excepciones

        if(moneda.getValues() == this.Precio){

            if(hayBebidas()){
                sacarBebida(bebidaSeleccionada);
            }

        }else if(moneda.getValues() >= this.Precio){

            if(hayBebidas()){
                sacarBebida(bebidaSeleccionada);
                calcularVuelto(moneda.getValues());
            }

        }else if(moneda.getValues() <= this.Precio){
            //excepcion dinero insuficiente
        }

        //excepcion moneda nula

    }

}