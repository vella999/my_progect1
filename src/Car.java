public class Car implements Vehicle{
    @Override
    public void start() {
        System.out.println("Машина поехала!");
    }

    @Override
    public void stop() {
        System.out.println("Машина остановилась!");
    }
}
