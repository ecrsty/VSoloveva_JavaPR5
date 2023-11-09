package task2.SolovevaVE.taskthree.gameElems;

import task2.SolovevaVE.taskthree.GameObject;
import task2.SolovevaVE.taskthree.Moveable;
import task2.SolovevaVE.taskthree.Position;

public class Prop extends GameObject implements Moveable {
    public Prop(int id, String name, Position position) {
        super(id, name, position);
    }

    @Override
    public void move(Position newPosition) {}
}

