class Expendedor {

    private Deposito coca;
    private Deposito sprite;

    public Expendedor(int c1) {
       coca = new Deposito();
       sprite = new Deposito();
        for (int i = 0; i < c1; i++) {
            coca.addBebida(new CocaCola(i + 100));
            sprite.addBebida(new Sprite(i + 200));

        }
    }