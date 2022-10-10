public class Main {
    public static void main(String[] args) {
        Fruit f1 = new Fruit("Apple" , 20, 3);
        Fruit f2 = new Fruit("Banana", 25, 2);
        Fruit f3 = new Fruit("Apple" , 20, 3);

        FruitCollection fc = new FruitCollection(3);
        fc.addFruit("Grape", 35, 5);
        fc.addFruit("Pineapple", 40, 4);
        fc.expand(1);
        fc.addFruit("Beans", 40, 4);
        System.out.println(fc.getCount());
        System.out.println(fc.getFruitAt(1));
        System.out.println(fc.getFruitAt(2));
        System.out.println(fc.getFruitAt(3));
        System.out.println(fc.searchForFruitName("Grape"));
        System.out.println(fc.searchForFruitName("Beans"));
        System.out.println(fc.searchForFruitName("Apple"));
    }
}