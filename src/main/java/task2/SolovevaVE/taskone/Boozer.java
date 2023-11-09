package task2.SolovevaVE.taskone;

public class Boozer extends Animal{
    public Boozer(int age, String name) {
        super(age, name);
    }

//    @Override
//    public void sleep() {}
//    @Override
//    public void wake() {}
    @Override
    public void voice() {
        super.voice();
        System.out.println("ыоыуоыуо");
    }
}
