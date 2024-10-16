public class Bicycle implements Vehicle {
    @Override
    public void start() {
        System.out.println("Велосипед поехал");
    }

    @Override
    public void stop() {
        System.out.println("Велосипед остановился");
    }
}
