package task2.SolovevaVE.taskone;

public class Animal implements Voicable{
    protected int age;
    protected String name;

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void sleep(){
        System.out.println(name+" спит");
    }

    public void wake(){
        System.out.println(name+" просыпается");
    }

    public void voice(){
        System.out.print(name+" издает звук: ");
    }
}
