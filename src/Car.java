public class Car extends Vehicle {
    int numberOfDoors;

    public Car(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String getDescription() {
        return super.getDescription() +" Колличество дверей " + numberOfDoors;
    }
}
