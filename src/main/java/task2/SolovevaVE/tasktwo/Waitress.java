package task2.SolovevaVE.tasktwo;

public class Waitress implements Servicable<Food>{
    private String name;

    @Override
    public Food serve(){
        Food dish = new Food();
        return dish;
    }

    public String getName() {
        return name;
    }
}
