class vehicle{

    // States / Attributes
    int numberOfTires;
    int numberOfHorns;

    // Constructor
    vehicle(int tires, int horns) {
        numberOfTires = tires;
        numberOfHorns = horns;
    }

    // Behaviors / Methods
    void startEngine() {
        System.out.println("Engine started");
    }

    void drive() {
        System.out.println("car is driving");
    }

    void honk() {
        System.out.println("car is honking");
    }
}