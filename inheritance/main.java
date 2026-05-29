public class main {
    public static void main(String[] args)
    {
        bike b1=new bike(2,1);
        car c1=new car(4,1);
        System.out.println("bike");
        b1.startEngine();
        b1.drive();
        b1.honk();

        System.out.println("\nCar:");

        c1.startEngine();

        c1.drive();

        c1.honk();

    }
}
