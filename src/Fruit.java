public class Fruit {

    private String name;
    private double price;
    private int quality;

    public Fruit(String name, double price, int quality) {
        this.name = name;
        this.price = price;
        this.quality = quality;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuality() {
        return quality;
    }

    public boolean isEquals(Fruit f){
        if(f == null || this.getClass() != f.getClass()){
            return false;
        }else if(this == f){
            return true;
        }
        Fruit f1 = (Fruit)f;
        return this.name.equals(f1.name)
                && this.price == f1.price
                && this.quality == f1.quality;
    }

    public int compareTo(Fruit f) {
        if (this.quality > f.quality) {
            return 1;
        } else if (this.quality < f.quality) {
            return -1;
        }
        return 0;
    }

    public String toString(){
        return this.name + "(price: " + price + ", " + "quality: " + quality + ")";
    }

}
