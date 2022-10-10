import java.util.Objects;

public class FruitCollection {
    private Fruit[] fruits;
    private int count;

    public FruitCollection(int size){
        if(size <= 1){
            fruits = new Fruit[1];
        }else {
            fruits = new Fruit[size];
        }
    }
    public boolean addFruit(String name, double price, int quality){

        if(price < 0 && quality >= 1 && quality <= 10){
            return false;

        }else {
            count += 1;
            fruits[count] = new Fruit(name, price, quality);
        }
       return true;
    }

    public int getCount() {
        return count;
    }

    public boolean isFull(){
        return count >= fruits.length;
    }

    public Fruit getFruitAt(int slot){
        return fruits[slot];
    }

    public boolean expand(int size){
        Fruit[] copy = new Fruit[fruits.length + size];

            if(size < 1){
                return false;
        }else{
                for(int i = 0; i < fruits.length; i++) {
                    copy[i] = fruits[i];
                }
                fruits = copy;
            }
    return true;
    }

    public int searchForFruitName(String name){
        for (int i = 1; i < fruits.length; i++) {
            if(fruits[i].getName().equals(name)){
                return i;
            }
        }
        return -1;
    }




}
