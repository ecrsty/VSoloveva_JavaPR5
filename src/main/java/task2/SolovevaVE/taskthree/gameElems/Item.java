package task2.SolovevaVE.taskthree.gameElems;

import task2.SolovevaVE.taskthree.GameObject;
import task2.SolovevaVE.taskthree.Position;

public class Item extends GameObject {
    private int price;

    public Item(int id, String name, Position position, int price) {
        super(id, name, position);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
