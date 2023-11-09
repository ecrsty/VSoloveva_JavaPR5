package task2.SolovevaVE.tasktwo;

public class Bartender implements Servicable<Alcohol>{
    private String name;

    @Override
    public Alcohol serve(){
        Alcohol drink = new Alcohol();
        return drink;
    }

    public String getName() {
        return name;
    }
}
