public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple("Fruit Basket A", "Red Delicious");
        Banana banana = new Banana("Fruit Basket B", 8);
        Orange orange = new Orange("Fruit Basket C", true);
        Grape grape = new Grape("Fruit Basket D", 10);

        // Display information about fruits
        apple.display();
        banana.display();
        orange.display();
        grape.display();
    }
}
