package task2.SolovevaVE.taskone;

public class Cat extends Animal{
    private String color;
    private String breed;

    public Cat(int age, String name, String color, String breed) {
        super(age, name);
        this.color = color;
        this.breed = breed;
    }

//    @Override
//    public void sleep() {}
//    @Override
//    public void wake() {}
    @Override
    public void voice() {
        super.voice();
        System.out.println("мяяу");
    }
}
