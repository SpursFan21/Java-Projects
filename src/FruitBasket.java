class FruitBasket {
    private String type;

    public FruitBasket(String type) {
        this.type = type;
    }

    public void display() {
        System.out.println("Fruit Basket Type: " + type);
    }
}

class Apple extends FruitBasket {
    private String variety;

    public Apple(String type, String variety) {
        super(type);
        this.variety = variety;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Apple Variety: " + variety);
    }
}

class Banana extends FruitBasket {
    private int length;

    public Banana(String type, int length) {
        super(type);
        this.length = length;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Banana Length: " + length + " inches");
    }
}

class Orange extends FruitBasket {
    private boolean seedless;

    public Orange(String type, boolean seedless) {
        super(type);
        this.seedless = seedless;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Seedless: " + (seedless ? "Yes" : "No"));
    }
}
