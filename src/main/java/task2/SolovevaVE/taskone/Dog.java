package task2.SolovevaVE.taskone;

public class Dog extends Animal{
    private String breed;

    public Dog(int age, String name, String breed) {
        super(age, name);
        this.breed = breed;
    }

//    @Override
//    public void sleep() {}
//    @Override
//    public void wake() {}
    @Override
    public void voice() {
        super.voice();
        System.out.println("гав гав");
    }
}
