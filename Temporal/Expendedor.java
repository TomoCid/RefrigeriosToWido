package Temporal;

class Expendedor {
    private Deposito fanta;
    private Deposito coca;
    private Deposito sprite;

    //W. La maquina tiene un deposito donde almacena el vuelto a entregar
    private Deposito depositoDeVuelto;

    public Expendedor(int c1, int precio) {
        fanta = new Deposito();
        coca = new Deposito();
        sprite = new Deposito();
        for (int i = 0; i < c1; i++) {
            coca.addBebida(new CocaCola());
            sprite.addBebida(new Sprite(i + 200));

        }

    //W. Metodo devolver el vuelto (Debe ir eliminado de una en una moneda hasta retornar null)
    public void getVuelto(){
        
    }
    

    }