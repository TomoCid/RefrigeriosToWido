package Temporal;

abstract class Bebida{

    public String beber() {
        String x1 = new String("Sabor:");
        return x1;
  }
}
class Sprite extends Bebida {

    public Sprite() {
        super();
    }

    public String beber() {
        String x = new String("sprite");
        return super.beber() + x;
    }
}

class CocaCola extends Bebida {

    public CocaCola() {
        super();
    }

    public String beber() {
        String x = new String("CocaCola");
        return super.beber() + x;
    }
}

class Fanta extends Bebida {

    public Fanta() {
        super();
    }

    public String beber() {
        String x = new String("Fanta");
        return super.beber() + x;
    }
}


