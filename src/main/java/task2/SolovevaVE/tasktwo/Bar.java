package task2.SolovevaVE.tasktwo;

public class Bar {
    private Bartender bartender;
    private Waitress waitress;
    private Bouncer bouncer;

    public Alcohol makeOrder(int age){
        if (age > 18)
            return bartender.serve();
        else{
            System.out.println("Несовершеннолетним нельзя!");
        }
        return null;
    }

    public Food makeOrder(){
        return waitress.serve();
    }

    public void kickoutBoozer(){
        bouncer.boozerOut();
    }
}
