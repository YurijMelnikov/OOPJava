package HomeWork4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class Box<T extends Fruit> implements Iterable<T> {
    private final ArrayList<T> fruitList = new ArrayList<>();

    public void add(T fruit) {
        this.fruitList.add(fruit);
    }

    public int boxWeight() {
        int sum = 0;
        for (Fruit fruit : this.fruitList
        ) {
            sum += fruit.getWeight();
        }
        return sum;
    }

    public void move(Box<? extends T> box) {
        for (T fruit : box) {
            this.fruitList.add(fruit);
        }
        box.fruitList.clear();
    }

    @Override
    public String toString() {
        String print = "";
        for (T fruit: this.fruitList) {
            print += String.format("%d ",fruit.getWeight());
        }
        return print;
    }

    @Override
    public Iterator<T> iterator() {
        return this.fruitList.iterator();
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        Iterable.super.forEach(action);
    }
}
