public class Boat implements Vehicle{
    @Override
    public void start() {
        System.out.println("Лодка поплыла");
    }

    @Override
    public void stop() {
        System.out.println("Лодка остановилась");
    }
}
