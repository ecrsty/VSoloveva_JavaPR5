package task2.SolovevaVE.taskthree.gameElems;

import task2.SolovevaVE.taskthree.GameObject;
import task2.SolovevaVE.taskthree.Moveable;
import task2.SolovevaVE.taskthree.Position;

public class Creature extends GameObject implements Moveable {
    private int hp;

    public Creature(int id, String name, Position position, int hp) {
        super(id, name, position);
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }

    @Override
    public void move(Position newPosition) {}
}
