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


class Sprite extends Bebida {

    public Sprite(int s) {
        super(s);
    }

    public String beber() {
        String x = new String("sprite");
        return super.beber() + x;
    }
}

class CocaCola extends Bebida {

    public CocaCola(int d) {
        super(d);
    }

    @Override
    public String beber() {
        String w = new String("cocacola");
        return super.beber() + w;
    }
}

class Deposito {

    private ArrayList<Bebida> al;

    public Deposito() {
        al = new ArrayList();
    }

    public void addBebida(Bebida a) {
        al.add(a);
    }

    public Bebida getBebida() {
        if (al.size() != 0) {
            return al.remove(0);
        } else {
            return null;
        }
    }
}